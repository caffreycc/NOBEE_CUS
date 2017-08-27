<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">需求修改</div>
    <!-- <x-header title="修改需求" class="x-header"></x-header> -->
    <Group class="group">
      <!-- <XInput title="紧急电话：" v-model="form.connectPhone"></XInput>
      <XInput title="邮箱：" v-model="form.email"></XInput>
      <PopupPicker title="职业" :data="jobData" v-model="form.job" show-name></PopupPicker>
      <PopupPicker title="地址" :data="addressData" v-model="address" show-name></PopupPicker>
      <XInput title="详细地址：" v-model="form.addressDetail"></XInput> -->
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_14.png" width="12" height="12">
        <PopupPicker title="装修风格" :data="decorationStyleData" v-model="form.decorationStyleCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_22.png" width="12" height="12">
        <PopupPicker title="房屋户型" :data="houseTypeData" v-model="form.houseTypeCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_22.png" width="12" height="12">
        <PopupPicker title="装修进度" :data="decorationProgressData" v-model="form.decorationProgressCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_24.png" width="12" height="12">
        <PopupPicker title="装修方式" :data="decorationMethodData" v-model="form.decorationMethodCode" show-name></PopupPicker>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_26.png" width="12" height="12">
        <XInput title="小区开发商：" v-model="form.developer"></XInput>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_26.png" width="12" height="12">
        <PopupPicker title="大致预算" :data="budgetData" v-model="form.budget" show-name></PopupPicker>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-预约测量_12.png" width="12" height="12">
        <Datetime title="希望测量时间" v-model="form.expectMeasureDate"></Datetime>
      </div>
    </Group>
    <Group class="group">
    <div  v-for="(item, index) in form.requirements">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/需求类型.png" width="12" height="12">
        <cell title="需求类型" >{{ getNeedType(item.requirementType) }}</cell>
      </div>
      <div class="div-ipt">
        <img class="icon" src="../assets/images/需求描述.png" width="12" height="12">
        <cell title="需求描述" v-model="item.requirementDescription"></cell>
      </div>
    </div>
    </Group>
    <Group>
      <XButton type="primary" class="btn" @click.native="modifyFinish">完成</XButton>
    </Group>
  </div>
</template>
<script>
import { dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data } from 'vux'
export default {
  components: { dateFormat, Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, ChinaAddressV3Data },
  data () {
    return {
      jobData: [],
      decorationStyleData: [], // 装修风格
      houseTypeData: [], // 房屋户型
      decorationProgressData: [], // 装修进度
      decorationMethodData: [], // 装修方式
      budgetData: [], // 大致预算
      addressData: [], // 地址字典
      address: [],
      needTypeData: [],
      decorationMethodCode: '',
      form: {
        opportunityId: '',
        requirements: [],
        userId: '',
        connectPhone: '',
        email: '',
        job: [],
        addressCity: '',
        addressCounty: '',
        addressDetail: '',
        decorationStyleCode: [], // 装修风格
        houseTypeCode: [], // 房屋户型
        decorationProgressCode: [], // 装修进度
        decorationMethodCode: [], // 装修方式
        budget: [], // 大致预算
        expectMeasureDate: '', // 希望测量时间
        developer: '' // 小区开发商
      },
      sendForm: {
        opportunities: {}
      }
    }
  },
  mounted: function () {
    this.loadDictData('/weixin/api/dict/getDictInfo', [this.jobData, this.decorationStyleData, this.houseTypeData, this.decorationProgressData, this.decorationMethodData, this.budgetData, this.needTypeData], ['OPPORTUNITY_JOB_CODE', 'OPPORTUNITY_DECORATION_STYLE_CODE', 'OPPORTUNITY_HOUSE_TYPE_CODE', 'OPPORTUNITY_DECORATION_PROGRESS_CODE', 'OPPORTUNITY_DECORATION_METHOD_CODE', 'OPPORTUNITY_BUDGET_CODE', 'DMS_DS_INTENTION'])
    this.loadDictData('weixin/api/dict/getCity', this.addressData)
    this.loadDictData('weixin/api/dict/getArea', this.addressData)
  },
  created () {
    this.form.userId = this.get('userId')
    this.form.opportunityId = this.$route.query.opportunityId
    this.openId = this.$route.query.openId
    this.$http.post('/user/myOrder', {opportunityId: this.$route.query.opportunityId, userId: this.form.userId}).then(response => {
      if (response.data.code === 0) {
        let opportunities = response.data.data.opportunities
        // this.sendForm.opportunities = opportunities
        this.form.decorationStyleCode[0] = opportunities.decorationStyleCode
        this.form.budget[0] = opportunities.budget
        this.form.decorationMethodCode[0] = opportunities.decorationMethodCode
        this.form.houseTypeCode[0] = opportunities.houseTypeCode
        this.form.decorationProgressCode[0] = opportunities.decorationProgressCode
        this.form.expectMeasureDate = dateFormat(opportunities.expectMeasureDate, 'YYYY-MM-DD')
        this.form.developer = opportunities.developer
        this.form.requirements = response.data.data.requirements
        console.log('requirementType')
      }
    })
  },
  methods: {
    // 从业务字典查名称
    getDicName (value, dicArr) {
      if (dicArr) {
        console.log('arr:' + dicArr)
        for (var i = 0; i < dicArr.length; i++) {
          if (dicArr[i].value === value) {
            console.log('返回name' + dicArr[i].name)
            return dicArr[i].name
          }
        }
      }
    },
    // 得到需求类型的名称
    getNeedType (val) {
      console.log('getNeedTypegetNeedType')
      return this.getDicName(val, this.needTypeData[0])
    },
    // 在cookie中的得到key为name的数据
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    to () {
      this.$router.push({path: '/myNeed', query: {userId: this.$route.query.userId}})
    },
    modifyFinish () {
      if (!this.isNull(this.form.expectMeasureDate)) {
        this.sendForm.opportunities.opportunityId = this.form.opportunityId
        this.sendForm.opportunities.decorationStyleCode = this.form.decorationStyleCode[0]
        this.sendForm.opportunities.houseTypeCode = this.form.houseTypeCode[0]
        this.sendForm.opportunities.decorationProgressCode = this.form.decorationProgressCode[0]
        this.sendForm.opportunities.budget = this.form.budget[0]
        this.sendForm.opportunities.expectMeasureDate = this.form.expectMeasureDate[0]
        this.sendForm.opportunities.developer = this.form.developer
        this.sendForm.opportunities.decorationMethodCode = this.form.decorationMethodCode[0]
        // 显示loading
        this.$vux.loading.show({
          text: '正在提交...'
        })
        var url = '/user/updateRequire2'
        // var self = this
        var opportunities = JSON.parse('{"dog": "1"}')
        // JSON.stringify({'dog': {'cat': '1'}})
        console.log('传输数据string ' + typeof opportunities)
        // this.axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8'
        this.$http.post(url, {'cat': '1'}, {headers: {'Content-Type': 'application/json;charset=UTF-8'}}).then(response => {
          if (response.data.code === 0) {
            this.$vux.loading.hide()
            this.to()
          }
        }).catch(function (err) {
          console.log(err)
        })
      } else {
        this.$vux.alert.show({
          title: '警告',
          content: '必须填写希望测量时间'
        })
      }
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
    // 完美获取业务字典函数- ，-
    // 工具：加载数据字典（url：访问数据字典的路径，arr是上传字典id的数组，obj：数据字典存放对象的数组，arr必须和obj一样的长度）
    loadDictData: function (url, obj, arr) {
      var temp = []
      if (arr) {
        this.$http.post(url, {'dictCodes[]': arr}).then(response => {
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
        this.$http.post(url, obj).then(response => {
          if (response.data.code === 0) {
            response.data.data.forEach(function (item) {
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
.btn {
  background-color: #429394;
  width: 92% !important;
  margin-top: 10px;
  margin-bottom: 10px;
  height: 50px;
}
</style>
