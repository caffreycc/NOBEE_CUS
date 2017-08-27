<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">需求详情</div>
    <div class="title">最新进度</div>
    <Group class="group">
      <div v-for="(value, key) in form.progress">
        <div class="div-cell no-padding">
          <img class="list-icon" :src="'../../static/'+ key + '.png'" width="12" height="12">
          <cell :title="getName(key)" value-align="left" class="cell">{{ getAllName(value) }}</cell>
        </div>
      </div>
    </Group>
    <div class="title">需求背景</div>
    <Group class="group">
      <div v-for="(value, key) in form.opportunities">
        <div class="div-cell no-padding" ><!-- :src="'../assets/images/' + key + '.png'" -->
          <img class="list-icon" :src="'../../static/' + key + '.png'" width="12" height="12">
          <cell :title="getName(key)" value-align="left" class="cell">{{ getAllName(value) }}</cell>
        </div>
      </div>
    </Group>
    <div class="title">需求详情<button class="miniBtn-right" style="width:80px;" @click="modify">保存变更</button><button class="miniBtn-right" @click="addNeed">追加</button></div>
    <Group class="group" >
      <div class="div-ipt-cell" v-for="(val, key) in modifyForm">
        <div  class="div-cell no-padding">
          <img class="list-icon" src="../assets/images/orderDetail_closet.png" width="12" height="12">
          <PopupPicker title="" :data="needTypeData" v-model="val.requirementType" show-name></PopupPicker>
        </div>
        <div  class="div-cell" style="left:25px; top:-18px">
          <XInput title="描述：" v-model="val.requirementDescription" placeholder="请输入" class="cell"  :show-clear="false"></XInput>
          <img @click="deleteNeed(val.requirementId)" class="list-icon" style="padding-right:40px;" src="../assets/images/orderDetail_closet.png" width="12" height="12">
        </div>
      </div>
      <div v-if="addItem" class="add-item">
        <div class="div-cell">
        <img class="list-icon" src="../assets/images/orderDetail_closet.png" width="12" height="12">
        <PopupPicker title="类型：":data="needTypeData" v-model="sendForm.requirementType" show-name></PopupPicker>
        </div>
        <div class="div-cell" style="left:25px; top:-18px">
        <XInput title="描述：" class="cell" placeholder="请输入" :show-clear="false" v-model="sendForm.requirementDescription"></XInput>
        </div>
        <button class="miniBtn-right" style="margin-bottom:10px;"  @click="add">确定</button>
        <button class="miniBtn-right" style="margin-bottom:10px;"  @click="cancel">取消</button>
      </div>
    </Group>
    <div class="title">联系方式</div>
    <Group class="group">
      <div v-for="(value, key) in form.contact" >
        <div class="div-cell no-padding" >
          <img class="list-icon" :src="'../../static/' + key + '.png'" width="12" height="12">
          <cell :title="getName(key)" value-align="left" class="cell">{{ value }}</cell>
        </div>
      </div>
    </Group>
    
    <Group  style="margin-top:40px;">
      <button class="footer-right" style="margin:10px 10px" @click="pay">付款</button>
      <button v-if="lookPicture" class="footer-right" style="margin:10px 10px" @click="toPicture">看图</button>
    </Group>
  </div>
</template>
<script>
import { Selector, dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data, XTable } from 'vux'
import Qs from 'qs'
export default {
  components: { Selector, dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, XTable, ChinaAddressV3Data },
  data () {
    return {
      lookPicture: false, // 是否显示看图按钮
      addItem: false, // 追加需求的item标识
      delNeed: [], // 删除需求的id数组
      openId: '',
      opportunityId: '',
      address: '',
      decorationStyleData: [], // 装修风格
      houseTypeData: [], // 房屋户型
      decorationProgressData: [], // 装修进度
      decorationMethodData: [], // 装修方式
      budgetData: [], // 大致预算
      addressData: [], // 地址字典
      needTypeData: [], // 需求类型字典
      currentStatusData: [], // 状态字典
      // 标题字典
      titleData: [{
        '房屋户型：': 'houseTypeCode'
      }, {
        '装修风格：': 'decorationStyleCode'
      }, {
        '装修进度：': 'decorationProgressCode'
      }, {
        '装修方式：': 'decorationMethodCode'
      }, {
        '大致预算：': 'budget'
      }, {
        '小区开发商：': 'developer'
      }, {
        '希望测量时间：': 'expectMeasureDate'
      }, {
        '设计师：': 'designer'
      }, {
        '设计师电话：': 'designerPhone'
      }, {
        '门店：': 'shop'
      }, {
        '门店地址：': 'shopAddress'
      }, {
        '导购：': 'shopGuide'
      }, {
        '导购电话：': 'shopGuidePhone'
      }, {
        '最近测量日期：': 'recentlyMeasureDate'
      }, {
        '提出时间：': 'startDate'
      }, {
        '状态：': 'statu'
      }],
      form: {
        requirements: [],
        needSelect: [[]],
        addressDetail: '',
        connectName: '',
        connectPhone: '',
        connectSex: '',
        addressCity: '',
        addressCounty: '',
        email: '',
        job: [''],
        currentStatus: [''],
        // address: [],
        decorationStyleCode: [''], // 装修风格
        houseTypeCode: [''], // 房屋户型
        decorationProgressCode: [''], // 装修进度
        decorationMethodCode: [''], // 装修方式
        budget: [''], // 大致预算
        expectMeasureDate: [''], // 希望测量时间
        developer: '' // 小区开发商
      },
      sendForm: {
        createBy: '',
        opportunityId: '',
        requirementType: [''],
        requirementDescription: ''
      },
      // 变更需求的数组
      modifyForm: [{requirementDescription: '1',
        requirementFunction: '1',
        requirementId: '1',
        requirementType: ['CUPBOARD']}]
    }
  },
  mounted: function () {
    this.openId = this.get('userId')
    this.loadDictData('/weixin/api/dict/getDictInfo', [this.decorationStyleData, this.houseTypeData, this.decorationProgressData, this.decorationMethodData, this.budgetData, this.needTypeData], ['OPPORTUNITY_DECORATION_STYLE_CODE', 'OPPORTUNITY_HOUSE_TYPE_CODE', 'OPPORTUNITY_DECORATION_PROGRESS_CODE', 'OPPORTUNITY_DECORATION_METHOD_CODE', 'OPPORTUNITY_BUDGET_CODE', 'DMS_DS_INTENTION'])
    this.loadDictData('/weixin/api/dict/getDictInfoFilter1', [this.currentStatusData], ['ORDER_STATUS'])
    console.log('needDetail--id:' + this.$route.query.opportunityId)
  },
  computed: {
    getStatu: function () {
      return this.getDicName(this.form.currentStatus, this.currentStatusData[0])
    },
    getDecorationStyleCode: function () {
      return this.getDicName(this.form.decorationStyleCode, this.decorationStyleData[0])
    },
    getHouseTypeCode: function () {
      console.log('houseType:' + this.getDicName(this.form.houseTypeCode, this.houseTypeData[0]))
      return this.getDicName(this.form.houseTypeCode, this.houseTypeData[0])
    },
    getDecorationProgressCode: function () {
      return this.getDicName(this.form.decorationProgressCode, this.decorationProgressData[0])
    },
    getDecorationMethodCode: function () {
      return this.getDicName(this.form.decorationMethodCode, this.decorationMethodData[0])
    },
    getBudget: function () {
      return this.getDicName(this.form.budget, this.budgetData[0])
    }
  },
  created () {
    console.log('requirements:' + this.currentStatusData)
    this.sendForm.opportunityId = this.$route.query.opportunityId
    this.sendForm.createBy = this.get('userId')
    this.postMyRequest()
  },
  updated () {
  },
  methods: {
    // 跳转看图页面
    toPicture () {
      this.$router.push({path: '/picture', query: {opportunityId: this.$route.query.opportunityId}})
    },
    // 请求
    postMyRequest () {
      var send = Qs.stringify({userId: this.get('userId'), opportunityId: this.$route.query.opportunityId})
      this.$http.post('/user/myRequire', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          this.lookPicture = !(response.data.data.countPic === '0')
          this.form.opportunities = response.data.data.opportunities
          this.form.requirements = response.data.data.requirements
          this.form.contact = response.data.data.contact
          this.form.progress = response.data.data.progress
          this.form.progress.expectMeasureDate = dateFormat(response.data.data.progress.expectMeasureDate, 'YYYY-MM-DD')
          // 数据转换，popuerpoker控件值要['']格式
          this.modifyForm = this.form.requirements
          for (var i in this.form.requirements) {
            this.modifyForm[i].requirementType = [this.form.requirements[i].requirementType]
          }
          // 重置sendform
          this.sendForm.requirementType = ['']
        }
      })
    },
    // 删除购买需求
    deleteNeed (id) {
      var self = this
      this.$vux.confirm.show({
        title: '提示',
        content: '确定删除这条购买需求吗？',
        onConfirm () {
          self.$http.post('/user/deleteRequire', [id]).then(response => {
            if (response.data.code === 0) {
              self.$vux.alert.show({
                title: '提示',
                content: '删除购买需求成功！'
              })
              self.postMyRequest()
            }
          })
        }
      })
    },
    // 判断数组内是否包含obj
    contains (arr, obj) {
      var i = arr.length
      while (i--) {
        if (arr[i] === obj) {
          return true
        }
      }
      return false
    },
    getDicName (value, dicArr) {
      if (dicArr) {
        for (var i = 0; i < dicArr.length; i++) {
          if (dicArr[i].value === value) {
            console.log('返回name' + dicArr[i].name)
            return dicArr[i].name
          }
        }
      }
    },
    getName (val) {
      var self = this
      for (var index in self.titleData) {
        for (var key in self.titleData[index]) {
          if (val === self.titleData[index][key]) {
            return key
          }
        }
      }
      // console.log('getName1' + this.titleData.length)
      /* for (var i = 0; i < this.titleData.length; i++) {
        console.log('getName2' + this.titleData[i])
        if (this.titleData[i].value === val) {
          return this.titleData[i].name
        }
      } */
    },
    getAllName (val) {
      var arr = [this.houseTypeData[0], this.decorationStyleData[0], this.decorationProgressData[0], this.decorationMethodData[0], this.budgetData[0], this.addressData[0], this.needTypeData[0], this.currentStatusData[0]]
      for (var j = 0; j < arr.length; j++) {
        if (!this.isNull(this.getDicName(val, arr[j]))) {
          if (this.getDicName(val, arr[j]) === '潜客') {
            return '待测量'
          }
          return this.getDicName(val, arr[j])
        }
      }
      return val
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    getNeedType (val) {
      console.log('=======val=========' + val)
      return this.getDicName(val, this.needTypeData[0])
    },
    // 修改需求
    modify () {
      this.$vux.loading.show({
        text: '提交中'
      })
      // 变更需求提交时数据转换
      for (var i in this.modifyForm) {
        this.form.requirements[i] = this.modifyForm[i]
        this.form.requirements[i].requirementType = this.modifyForm[i].requirementType[0]
      }
      this.$http.post('/user/updateRequire', this.form.requirements).then(response => {
        if (response.data.code === 0) {
          this.$vux.loading.hide()
          this.$vux.alert.show({
            title: '提示',
            content: '变更需求成功'
          })
          this.postMyRequest() // 重新请求
        }
      })
    },
    // 检测字段是否为空
    isNull: function (str) {
      if (str === '' || str === null || str === undefined) {
        return true
      }
      var regu = '^[ ]+$'
      var re = new RegExp(regu)
      return re.test(str)
    },
    pay () {
      this.toPay()
    },
    // 追加需求
    add () {
      if (this.isNull(this.sendForm.requirementType[0])) {
        this.$vux.alert.show({
          title: '提示',
          content: '不能提交空的需求'
        })
      } else {
        // 转换数据格式
        this.sendForm.requirementType = this.sendForm.requirementType[0]
        var send = Qs.stringify(this.sendForm)
        this.$http.post('/user/addRequire', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
          if (response.data.code === 0) {
            this.postMyRequest()
            this.addItem = false
            this.$vux.alert.show({
              title: '提示',
              content: '成功提交需求'
            })
            this.sendForm.requirementDescription = ''
          } else {
            console.log('追加需求失败')
            this.$vux.alert.show({
              title: '提示',
              content: '提交失败'
            })
          }
        })
      }
    },
    toModify () {
      this.$router.push({path: '/needModify', query: {openId: this.openId, opportunityId: this.$route.query.opportunityId}})
    },
    toPay () {
      this.$router.push({path: '/gzh/or/payOrder', query: {openId: this.openId, opportunityId: this.$route.query.opportunityId}})
    },
    addNeed () {
      this.addItem = true
    },
    cancel () {
      this.addItem = false
      this.sendForm.requirementDescription = ''
      this.sendForm.requirementType = ['']
    },
    // 完美获取业务字典函数- ，-
    // 工具：加载数据字典（url：访问数据字典的路径，arr是上传字典id的数组，obj：数据字典存放对象的数组，arr必须和obj一样的长度）
    loadDictData: function (url, obj, arr) {
      var temp = []
      if (arr) {
        var map = {}
        // var sendDic = Qs.stringify({dictCodes: arr})
        this.$http.post(url, arr).then(response => {
          if (response.data.code === 0) {
            for (var i = 0; i < arr.length; i++) {
              temp[i] = []
              response.data.data[arr[i]].forEach(function (item) {
                if (item.father === null) {
                  map = {name: item.text, value: item.id, parent: ''}
                } else {
                  map = {name: item.text, value: item.id, parent: item.father}
                }
                temp[i].push(map)
              })
              obj[i].push(temp[i])
            }
          }
        })
      } else {
        this.$http.post(url, obj).then(response => {
          if (response.data.code === 0) {
            console.log('data:' + response.data.data)
            response.data.data.forEach(function (item) {
              console.log(item)
              var map = {name: item.text, value: item.id, parent: item.father}
              temp.push(map)
            })
            obj.push(temp)
          }
        })
      }
    }
  }
}
</script>

<style>
.vux-demo {
  text-align: center;
}
.logo {
  width: 100px;
  height: 100px
}
.select {
  width:90px;
  height:30px;
}
/* 追加需求的item */
.item {
  margin-top: 20px;
}
/* 详情icon */
.detail-icon {
  position:relative; left:0px; top:0px; display:inline; float:left; width:14px; height:15px;
}
.list-icon {
  float:left; width:14px; height:15px;
}
.cell {
   padding:0 15px; color: #7f7f7f;
}
.weui-cell__ft {
  color: #202020
}
/* 标题 */
.title {
  margin-left: 5%;
  width: 90%;
  padding: 10px 10px 0px 0px;
  font-size: 14px;
  color: #bebebe
}
/* 小按钮 */
.miniBtn-right {
  background-color:#fff !important;
  color: #429394;
  border-radius: 30px;
  border:1px solid #429394;
  float:right;
  width: 50px;
  height: 25px;
  margin-right: 10px;
}
/* 需求类型 */
.needList-type {
  width:40%; float:left; padding-top: 0
}
/* 需求描述 */
.needList-detail {
  width:40%; float:left; padding-top: 0
}
/* 添加的需求框 */
.add-item {
  height:80px; background-color: #f5f5f5; border: 1px solid #429394;
}
.no-padding {
  padding-top: 0px;
  padding-bottom: 0px;
}
/* 需求背景组合 */
.div-ipt-cell {
  height:70px;
  border-bottom: 1px solid #f5f5f5
}
</style>
