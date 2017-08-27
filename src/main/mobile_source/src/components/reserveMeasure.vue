<template>
  <div>
  <!-- 变更需求再追加有问题， 订单时间还没添加， 如果没有需求-变更需求按钮不显示 -->
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">预约测量</div>
    <div style="margin-top:20px;">
    <Group v-if="haveShop" class="group" style="background-color:#429394;">
      <div class="div-cell">
        <cell style="font-size:18px;" v-model="shop[0].orgName" show-name ></cell>
        <button class="btn-none" style="position:absolute; right:20px" @click="choseShop">选择</button>
      </div>
      <div class="div-cell" style="left:25px; top:-18px">
        <img class="list-icon" src="../assets/images/客人-标准流程-预约测量_10.png" width="12" height="12">
        <cell title="" class="cell" :show-clear="false" v-model="shop[0].address"></cell>
      </div>
    </Group>
    <div v-if="!haveShop" class="group flexd">
      <button class="btn-choseShop" @click="choseShop">请选择门店</button>
    </div>
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_03.png" width="12" height="12">
        <XInput title="紧急电话：" v-model="form.connectPhone" placeholder="请输入" placeholder-align="right" text-align="right" :show-clear="false" type="number"></XInput>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_06.png" width="12" height="12">
        <XInput title="邮箱：" v-model="form.email" placeholder="请输入" placeholder-align="right" text-align="right" :show-clear="false" type="email"></XInput>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_08.png" width="12" height="12">
        <PopupPicker title="年龄" :data="ageData" v-model="form.age" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_08.png" width="12" height="12">
        <PopupPicker title="职业" :data="jobData" v-model="form.job" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_10.png" width="12" height="12">
        <PopupPicker title="地址" v-model="address" :columns="3" :data="addressData" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_10.png" width="12" height="12">
        <XInput title="详细地址：" v-model="form.addressDetail" placeholder="请输入" placeholder-align="right" text-align="right" :show-clear="false"></XInput>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_12.png" width="12" height="12">
        <Datetime title="希望测量时间" v-model="form.expectMeasureDate" :start-date="startDate" :end-date="endDate"></Datetime>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_14.png" width="12" height="12">
        <PopupPicker title="装修风格" :data="decorationStyleData" v-model="form.decorationStyleCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_22.png" width="12" height="12">
        <PopupPicker title="房屋户型" :data="houseTypeData" v-model="form.houseTypeCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_22.png" width="12" height="12">
        <PopupPicker title="装修进度" :data="decorationProgressData" v-model="form.decorationProgressCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_24.png" width="12" height="12">
        <PopupPicker title="装修方式" :data="decorationMethodData" v-model="form.decorationMethodCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_26.png" width="12" height="12">
        <XInput title="小区开发商：" v-model="form.developer" placeholder="请输入" placeholder-align="right" text-align="right" :show-clear="false"></XInput>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_26.png" width="12" height="12">
        <PopupPicker title="大致预算" :data="budgetData" v-model="form.budget" show-name></PopupPicker>
      </div>
      <div class="div-ipt div-ipt-top-line">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_08.png" width="12" height="12">
        <PopupPicker title="需求紧迫性" :data="orderPriorityData" v-model="form.orderPriorityCode" show-name></PopupPicker>
      </div>
    </Group>
    </div>
    <XButton type="primary" class="btn" style="margin-top:20px" @click.native="addFinish">完成</XButton>
  </div>
</template>

<script type="text/javascript">
  import WeixinJSBridge from 'WeixinJSBridge'
</script>
<script>
import { Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data } from 'vux'
import Qs from 'qs'
export default {
  components: { Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data },
  data () {
    return {
      haveShop: true, // 是否有门店
      startDate: '',
      orderPriorityData: [],
      ageData: [],
      jobData: [],
      decorationStyleData: [], // 装修风格
      houseTypeData: [], // 房屋户型
      decorationProgressData: [], // 装修进度
      decorationMethodData: [], // 装修方式
      budgetData: [], // 大致预算
      addressData: [], // 地址字典
      address: [],
      test: [{value: 'C001', name: '北京市'},
        {value: 'C002', name: '天津市', parent: 'C001'},
        {value: 'C002', name: '天津市', parent: 'C003'}],
      shop: [{}], // 门店数据
      // 绑定的表单数据
      form: {
        orgId: '',
        userId: '',
        connectPhone: '',
        email: '',
        age: [''],
        job: [''],
        addressCity: '',
        addressCounty: '',
        addressCell: '',
        addressDetail: '',
        decorationStyleCode: [''], // 装修风格
        houseTypeCode: [''], // 房屋户型
        decorationProgressCode: [''], // 装修进度
        decorationMethodCode: [''], // 装修方式
        budget: [''], // 大致预算
        expectMeasureDate: '', // 希望测量时间
        developer: '', // 小区开发商
        orderPriorityCode: ['']
      },
      // 要发送的表单数据
      sendForm: {
        age: '',
        job: '',
        decorationStyleCode: '', // 装修风格
        houseTypeCode: '', // 房屋户型
        decorationProgressCode: '', // 装修进度
        decorationMethodCode: '', // 装修方式
        budget: '', // 大致预算
        orderPriorityCode: ''
      }
    }
  },
  mounted: function () {
    this.form.userId = this.get('userId')
    console.log('openId:' + this.form.openId)
    this.loadDictData('/weixin/api/dict/getDictInfo', [this.jobData, this.decorationStyleData, this.houseTypeData, this.decorationProgressData, this.decorationMethodData, this.budgetData, this.ageData, this.orderPriorityData], ['OPPORTUNITY_JOB_CODE', 'OPPORTUNITY_DECORATION_STYLE_CODE', 'OPPORTUNITY_HOUSE_TYPE_CODE', 'OPPORTUNITY_DECORATION_PROGRESS_CODE', 'OPPORTUNITY_DECORATION_METHOD_CODE', 'OPPORTUNITY_BUDGET_CODE', 'OPPORTUNITY_CUSTOMER_AGE_CODE', 'OPPORTUNITY_ORDER_PRIORITY_CODE'])
    this.loadDictCityData('weixin/api/dict/getCity', this.addressData)
    // this.loadDictCountyData('weixin/api/dict/getArea', this.addressData)
    // this.loadDictcellData('weixin/api/dict/getAddress', this.addressData)
  },
  created: function () {
    var self = this
    this.form.orgId = this.$route.query.orgId
    // 获取不到门店id
    if (this.isNull(this.form.orgId)) {
      this.$http.post('/store/myStore', Qs.stringify({userId: this.get('userId')}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          self.haveShop = true
          if (response.data.data.length === 0) {
            self.haveShop = false
            /* self.$vux.alert.show({
              title: '提示',
              content: '你还没有门店，将跳转到附近门店',
              onHide () {
                self.$router.push({path: 'myShop', query: {shop: 0}})
              }
            }) */
          } else {
            // 填充我的门店
            this.shop = response.data.data
            this.form.orgId = this.shop[0].orgId
          }
        }
      })
    } else {
      this.$http.post('/store/details ', Qs.stringify({orgId: this.form.orgId}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          // 请求门店详情
          this.shop = [response.data.data]
        }
      })
    }
    /* 检测用户是否注册过 */
    this.$http.post('/common/checkCustomer', Qs.stringify({userId: this.get('userId')}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === -1) {
        this.$router.push({path: '/'})
      }
    })
    var time = new Date()
    this.startDate = time.getFullYear() + '-' + (time.getMonth() + 1) + '-' + time.getDate()
    this.endDate = (time.getFullYear() + 5) + '-' + (time.getMonth() + 1) + '-' + time.getDate()
    console.log('time:' + this.startDate)
  },
  methods: {
    // 选择门店
    choseShop () {
      if (this.shop.length > 1) {
        this.$router.push({path: '/myShop', query: {shop: 1}})
      } else {
        this.$router.push({path: '/myShop', query: {shop: 0}})
      }
    },
    // 验证邮箱是否正确
    isEmail: function (value) {
      const reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/
      if (reg.test(value)) {
        return true
      }
      return false
    },
    // 完成提交
    addFinish () {
      var self = this
      if (this.isNull(this.form.expectMeasureDate) || this.isNull(this.address[0])) {
        this.$vux.alert.show({
          title: '警告',
          content: '必须填写希望测量时间和地址'
        })
      } else {
        if (!this.isNull(this.form.email)) { // 有填写邮箱时进来
          if (!this.isEmail(this.form.email)) {
            this.$vux.alert.show({
              title: '警告',
              content: '邮箱格式不正确'
            })
            return
          }
        }
        console.log('验证邮箱后0:' + this.address[0] + '--1:' + this.address[1])
        this.form.addressCity = this.getDicName(this.address[0], this.addressData)
        this.form.addressCounty = this.getDicName(this.address[1], this.addressData)
        this.form.addressCell = this.address[2]
        console.log('字段：' + this.address + this.form.expectMeasureDate)
        // 显示loading
        this.$vux.loading.show({
          text: '正在提交...'
        })
        // 对发送的sendfrom做处理
        this.sendForm = this.form
        this.sendForm.age = this.form.age[0]
        this.sendForm.job = this.form.job[0]
        this.sendForm.orderPriorityCode = this.form.orderPriorityCode[0]
        this.sendForm.decorationStyleCode = this.form.decorationStyleCode[0]
        this.sendForm.decorationMethodCode = this.form.decorationMethodCode[0]
        this.sendForm.decorationProgressCode = this.form.decorationProgressCode[0]
        this.sendForm.houseTypeCode = this.form.houseTypeCode[0]
        this.sendForm.budget = this.form.budget[0]
        var url = '/user/appointmentMeasure'
        var send = Qs.stringify(this.sendForm)
        this.$http.post(url, send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
          if (response.data.code === 0) {
            this.$vux.loading.hide()
            this.$vux.alert.show({
              title: '提示',
              content: '预约测量成功，等待导购联系'
            })
            this.$vux.confirm.show({
              title: '提示',
              content: '是否跳转到我的需求查看',
              onCancel () {
                WeixinJSBridge.call('closeWindow')
              },
              onConfirm () {
                self.to()
              }
            })
          }
        })
      }
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
    to () {
      this.$router.push({path: '/myNeed'})
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    checkout () {
      if (!this.isNull(this.form.expectMeasureDate) && !this.isNull(this.address)) {
        return true
      }
      return false
    },
    // 完美获取业务字典函数- ，-
    // 工具：加载数据字典（url：访问数据字典的路径，arr是上传字典id的数组，obj：数据字典存放对象的数组，arr必须和obj一样的长度）
    loadDictData: function (url, obj, arr) {
      var temp = []
      if (arr) {
        console.log('arr')
        this.form.addressCity = this.address[0]
        this.form.addressCounty = this.address[1]
        this.$http.post(url, arr).then(response => {
          if (response.data.code === 0) {
            for (var i = 0; i < arr.length; i++) {
              temp[i] = []
              response.data.data[arr[i]].forEach(function (item) {
                var map = {name: item.text, value: item.id, parent: item.father}
                temp[i].push(map)
              })
              obj[i].push(temp[i])
            }
          }
        })
      } else {
        console.log('没有arr')
        this.$http.post(url).then(response => {
          if (response.data.code === 0) {
            response.data.data.forEach(function (item) {
              var map = {name: item.text, value: item.id, parent: item.father}
              console.log(map)
              obj.push(map)
            })
            console.log('对象：' + obj[obj.length - 2].parent)
          }
        })
      }
    },
    // 加载市字典
    loadDictCityData: function (url, obj) {
      var self = this
      var map = {}
      this.$http.post(url).then(response => {
        if (response.data.code === 0) {
          response.data.data.forEach(function (item) {
            map = {name: item.text, value: item.id, parent: ''}
            obj.push(map)
          })
        }
        console.log('地址字典长度:' + self.addressData.length)
        self.loadDictCountyData('weixin/api/dict/getArea', self.addressData)
      })
    },
    // 加载县区字典
    loadDictCountyData: function (url, obj) {
      var self = this
      var map = {}
      this.$http.post(url).then(response => {
        if (response.data.code === 0) {
          response.data.data.forEach(function (item) {
            map = {name: item.text, value: item.id, parent: item.father, type: item.type}
            obj.push(map)
          })
        }
        console.log('地址字典长度:' + self.addressData.length)
        self.loadDictcellData('weixin/api/dict/getAddress', self.addressData)
      })
    },
    // 加载小区字典
    loadDictcellData: function (url, obj) {
      var map = {}
      var self = this
      this.$http.post(url).then(response => {
        if (response.data.code === 0) {
          response.data.data.forEach(function (item) {
            map = {name: item.text, value: item.text, parent: item.father}
            obj.push(map)
          })
        }
        console.log('地址字典长度:' + self.addressData.length)
        self.addCountyNOData(self.addressData)
      })
    },
    // 对所有县区加空小区,解决控件一定要有三级数据的bug
    addCountyNOData: function (addressData) {
      for (var i in addressData) {
        if (addressData[i].type + '' === '1') {
          addressData.push({name: '', value: '-2', parent: addressData[i].value})
        }
      }
    }
  }
}
</script>

<style>
.div-ipt-top-line {
  border-top:1px solid #f6f6f6
}
.vux-cell-box:before {
  border: 0 !important;
}
.btn-none {
  width: 60px;
  height: 30px;
  background-color:#fff !important;
  color: #429394;
  border-radius: 30px;
  border:1px solid #429394;
}
.flexd {
  background-color:#337878; height:110px;
  /* 弹性盒子布局，装逼利器 */
  display: -webkit-flex;
  display: flex;
  垂直居中
  -webkit-align-items: center;
  align-items: center;
  -webkit-justify-content: center;
  justify-content: center;
}
.btn-choseShop {
  width:90%; height:50%; background-color:#429394; border-radius:60px; color:#fff; font-size:20px; border:0px;
}
</style>
