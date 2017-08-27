<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">订单详情</div>
    <div class="div-progress">
      <div class="item-progress" :class="{active: isActive1}">提交
        <span class="statu-time" v-text="commitTime"></span>
      </div>
      <div class="item-progress" v-bind:class="{active: isActive2}">生产
        <span class="statu-time" v-text="productionTime"></span>
      </div>
      <div class="item-progress" v-bind:class="{active: isActive3}">出库
        <span class="statu-time" v-text="outputTime"></span>
      </div>
      <div class="item-progress" v-bind:class="{active: isActive4}">收货
        <span class="statu-time" v-text="receiveTime"></span>
      </div>
      <div class="item-progress" v-bind:class="{active: isActive5}">安装
        <span class="statu-time" v-text="installTime"></span>
      </div>
      <div style="width:100%;">
      </div>
    </div>
      <div class="title">商品详情</div>
      <Group class="group">
      <div v-for="item in form.requirement">
        <div class="div-cell no-padding" >
          <img class="detail-icon" src="../assets/images/orderDetail_closet.png" width="12" height="12">
          <cell :title="item.type + '：￥'" value-align="left" class="cell">1000</cell>
        </div>
      </div>
      </Group>
      <div class="title">价格详情</div>
      <Group class="group">
      <div v-for="(value, key) in form.price">
        <div class="div-cell no-padding" >
          <img class="detail-icon" :src="'../../static/'+ key + '.png'" width="12" height="12">
          <cell :title="getName(key)" value-align="left" class="cell">{{ value }}</cell>
        </div>
      </div>
      </Group>
      <div class="title">订单详情</div>
      <Group class="group" >
        <div class="div-cell no-padding" >
          <img class="detail-icon" src="../assets/images/orderDetail_date.png" width="12" height="12">
          <cell title="订单号：" value-align="left" class="cell">{{ form.orderCode }}</cell>
        </div>
        <div class="div-cell" >
          <img class="detail-icon" src="../assets/images/orderDetail_date.png" width="12" height="12">
          <cell title="订单时间：" value-align="left" class="cell">{{ form.submitOrder }}</cell>
        </div>
      </Group>
      
    <Group  style="margin-top:40px;">
      <button v-if="canEvaluate" class="footer-right" style="margin:10px 10px" @click="toEvaluate">评价</button>
      <button v-if="isReceive" class="footer-right" style="width:80px; margin:10px 10px" >确认收货</button>
      <button v-if="isInstall" class="footer-right" style="width:80px; margin:10px 10px" >确认安装</button>
      <button class="footer-right" style="width:80px; margin:10px 10px" @click="toNeed">需求详情</button>
    </Group>
  </div>
</template>
<script>
import { dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data, XTable } from 'vux'
import Qs from 'qs'
export default {
  components: { dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, XTable, ChinaAddressV3Data },
  data () {
    return {
      canEvaluate: false, // 是否到达可以评价状态
      evaluate: false, // 是否评价过
      isReceive: false, // 确认收货按钮
      isInstall: false, // 确认安装按钮
      isActive1: false, // 提交状态
      isActive2: false, // 生产状态
      isActive3: false, // 出库状态
      isActive4: false, // 收货状态
      isActive5: false, // 安装状态
      addItem: false, // 追加需求框
      openId: '',
      opportunityId: '', // 商机id
      address: '',
      decorationStyleData: [], // 装修风格
      houseTypeData: [], // 房屋户型
      decorationProgressData: [], // 装修进度
      decorationMethodData: [], // 装修方式
      budgetData: [], // 大致预算
      addressData: [], // 地址字典
      needTypeData: [], // 需求类型字典
      currentStatusData: [], // 状态字典
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
      }, {
        '活动：': 'activity'
      }, {
        '最终价：￥': 'finalPrice'
      }, {
        '折上折：': 'fold'
      }, {
        '总价：￥': 'totalPrice'
      }, {
        '满减：￥': 'fullReduction'
      }],
      form: {
        commitTime: '',
        productionTime: '',
        outputTime: '',
        receiveTime: '',
        installTime: '',
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
        userId: '',
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
    this.sendForm.userId = this.$route.query.openId
    this.postMyRequest()
  },
  watch: {
    isInstall: function (val, oldVal) {
    }
  },
  updated () {
  },
  methods: {
    // 评价按钮
    toEvaluate () {
      this.$router.push({path: '/evaluate', query: {evaluated: this.evaluate, opportunityId: this.$route.query.opportunityId}})
    },
    // 跳转到需求页
    toNeed () {
      this.$router.push({path: '/needDetail', query: {opportunityId: this.$route.query.opportunityId, openId: this.openId}})
    },
    // 初始化请求
    postMyRequest () {
      var send = Qs.stringify({userId: this.get('userId'), opportunityId: this.$route.query.opportunityId})
      this.$http.post('/user/myOrder', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          this.form.order = response.data.data.order
          this.form.requirement = response.data.data.requirement
          this.form.price = response.data.data.price
          this.form.orderCode = response.data.data.orderCode
          this.form.submitOrder = response.data.data.submitOrder
          this.evaluate = response.data.data.evaluate
          // 根据sortNo判定状态，渲染图片
          var self = this
          this.form.order.forEach(function (item) {
            console.log('状态：' + item.sortNo)
            switch (item.sortNo) {
              case 6:
                self.isActive1 = true
                self.commitTime = dateFormat(item.orderTime, 'YYYY-MM-DD')
                break
              case 7:
                self.isActive2 = true
                self.productionTime = dateFormat(item.orderTime, 'MM-DD')
                break
              case 8:
                self.isActive3 = true
                self.outputTime = dateFormat(item.orderTime, 'MM-DD')
                break
              case 9:
                self.isActive4 = true
                self.isReceive = true
                self.receiveTime = dateFormat(item.orderTime, 'MM-DD')
                break
              case 10:
                self.isActive5 = true
                self.isInstall = true
                self.installTime = dateFormat(item.orderTime, 'MM-DD')
                break
            }
          })
        }
      })
    },
    // 从dicarr数组里取名字
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
    // 传入val，遍历所有字典，查找对应的code
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
          this.postMyRequest()
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
      this.sendForm.requirementType = this.sendForm.requirementType[0]
      var send = Qs.stringify(this.sendForm)
      this.$http.post('/user/addRequire', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0 && response.data.message === 'success') {
          console.log('------' + this.sendForm.requirementType)
          /* this.form.requirements.push({requirementType: this.sendForm.requirementType, requirementDescription: this.sendForm.requirementDescription, requirementFunction: null, requirementId: ''}) */
          this.postMyRequest()
          this.addItem = false
          this.$vux.alert.show({
            title: '提示',
            content: '成功提交需求'
          })
        } else {
          console.log('追加需求失败')
          this.$vux.alert.show({
            title: '提示',
            content: '提交失败'
          })
        }
      })
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
            console.log('obj:' + obj[2][0].length)
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
.bottom {
  position: absolute;
  bottom: 0px;
  left: 0px;
  width:100%;
  background-color: #fff;
  height: auto;
}
.div-progress {
  background-image: url('../assets/images/orderDetail_bg.png');
  background-repeat: no-repeat;
  background-size: 100%;
  height: 120px;
}
.item-progress {
  background-image: url('../assets/images/orderProgress_item.png');
  background-repeat: no-repeat;
  background-size: 100%;
  width: 13%;
  height: 50px;
  float: left;
  margin: 20px 11px 0 11px;
  text-align: center;
  line-height: 43px;
  font-size: 14px;
  color:#e0e0e0;
}
.active {
  background-image: url('../assets/images/orderProgress_item_active.png');
  color: #fff;
}
.statu-time {
  color:#fff; font-size:12px;
  position: relative;
  left: -20px;
  display: block;
  width: 80px;
  padding-left: 5px;
}
</style>
