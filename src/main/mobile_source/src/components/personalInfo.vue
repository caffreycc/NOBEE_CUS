<template style="background-color:#f0f0f0">
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">个人信息</div>
  <!-- <x-header title="个人信息" class="x-header" :left-options="{showBack: false}"></x-header> -->
    <div style="width:100%; height:100%; margin-top:20px" v-if="personal"><!-- v-show="personal" -->
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-个人信息_03.png" width="12" height="12">
        <XInput title="姓名" v-model="form.userName" placeholder="请输入" :show-clear="false" placeholder-align="right" text-align="right"></XInput>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt div-phone" :class="{divNoVerify: signed}">
        <img class="icon" src="../assets/images/客人-标准流程-个人信息_06.png" width="12" height="12">
        <XInput title="电话" :class="{disable: signed}" type="number" v-model="form.phone" placeholder="请输入" :show-clear="false" placeholder-align="right" text-align="right" :disabled="signed"></XInput>
        <button v-show="!signed" class="btn-check" @click="verifyPhone">验证</button>
      </div>
    </Group>
    <Group class="group" v-show="verify">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/验证码.png" width="12" height="12">
        <XInput title="验证码" type="number" v-model="form.checkCode" placeholder="请输入" :show-clear="false" placeholder-align="right" text-align="right"></XInput>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt">
      <img class="icon" src="../assets/images/客人-标准流程-个人信息_08.png" width="12" height="12">
        <cell title="性别">
        <check-icon :value.sync="boy" type="plain">男 </check-icon>
        <check-icon :value.sync="girl" type="plain">女</check-icon>
        </cell>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-个人信息_03.png" width="12" height="12">
        <PopupPicker title="学历" :data="educationData" v-model="form.educationType" show-name></PopupPicker>
      </div>
    </Group>
    <Group class="group">
      <div class="div-ipt">
        <img class="icon" src="../assets/images/客人-标准流程-个人信息_03.png" width="12" height="12">
        <PopupPicker title="年收入" :data="incomeData" v-model="form.annualIncome" show-name></PopupPicker>
      </div>
    </Group>
    <Group class="group">
      <!-- <radio :options="sexOptions" v-model="form.sex" @on-change="changeSex" ></radio> -->

    </Group>
    <XButton v-if="!signed" type="primary" class="btn" style="margin-top:40px;" @click.native="addFinish">确定</XButton>
    <XButton v-if="signed" type="primary" class="btn" style="margin-top:40px;" @click.native="modify">确认修改</XButton>
    </div>
    <div style="width:100%; height:100%" v-if="hint">
      <img class="hint-img" src="../assets/images/已完善信息.png">
      <div class="hint-tip">您已经完善过信息了</div>
    </div>
  </div>
</template>
<script>
  import WeixinJSBridge from 'WeixinJSBridge'
</script>
<script>
import { PopupPicker, CheckIcon, Cell, XHeader, XInput, Group, XSwitch, Radio, XButton } from 'vux'
import Qs from 'qs'
export default {
  components: { PopupPicker, CheckIcon, Cell, XHeader, XInput, Group, XSwitch, Radio, XButton },
  data () {
    return {
      signed: false,
      boy: true,
      girl: false,
      personal: true,
      hint: false,
      isCommit: false,
      verify: false,
      educationData: [], // 学历字典
      incomeData: [], // 年收入字典
      form: {
        userId: '',
        userName: '',
        phone: '',
        sex: '男',
        checkCode: '',
        educationType: [''],
        annualIncome: ['']
      }
    }
  },
  watch: {
    boy: function (val, oldVal) {
      this.girl = !val
      if (val) {
        this.form.sex = '男'
      } else {
        this.form.sex = '女'
      }
    },
    girl: function (val, oldVal) {
      this.boy = !val
      if (!val) {
        this.form.sex = '男'
      } else {
        this.form.sex = '女'
      }
    }
  },
  updated: function () {
  },
  created: function () {
    this.form.userId = this.get('userId')
    var send = Qs.stringify({userId: this.get('userId')})
    this.$http.post('/user/checkOpenId', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === -1) {
        // 已经存在用户
        this.signed = true
        this.form.userName = response.data.data.userName
        this.form.sex = response.data.data.sex
        this.form.phone = response.data.data.phone
        this.form.annualIncome = [response.data.data.annualIncome]
        this.form.educationType = [response.data.data.educationType]
        if (this.form.sex === '女') {
          this.girl = true
        } else {
          this.boy = true
        }
        // this.personal = false
        // this.hint = true
      } else {
        // this.personal = true
        // this.hint = false
      }
    })
    this.loadDictData('/weixin/api/dict/getDictInfo', [this.educationData, this.incomeData], ['degree', 'INCOME_TYPE'])
  },
  methods: {
    verifyPhone () {
      if (!this.isNull(this.form.phone) && this.form.phone.length === 11) {
        var self = this
        this.$vux.loading.show({
          text: '正在往' + self.form.phone + '发送短信验证码'
        })
        var send = Qs.stringify({phone: self.form.phone, userId: self.get('userId')})
        self.$http.post('/user/getPhoneCode', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
          self.$vux.loading.hide()
          if (response.data.code === -1) {
            self.$vux.alert.show({
              title: '提示',
              content: '号码已经注册过，请重新填写'
            })
            self.form.phone = ''
          } else {
            this.verify = true
          }
        })
      } else {
        this.$vux.alert.show({
          title: '提示',
          content: '手机号码格式不正确'
        })
      }
    },
    // 性别值改变时事件
    changeSex (currentValue) {
      console.log(currentValue)
    },
    // 完成事件
    addFinish () {
      var self = this
      if (self.isNull(self.form.userName) || self.isNull(self.form.phone) || self.isNull(self.form.sex)) {
        self.$vux.alert.show({
          title: '警告',
          content: '请填写完整信息'
        })
      } else if (self.isNull(self.form.checkCode)) {
        self.$vux.alert.show({
          title: '警告',
          content: '请验证手机号码并填写验证码'
        })
      } else if (self.form.phone.length !== 11) {
        self.$vux.alert.show({
          title: '警告',
          content: '手机号码格式不正确'
        })
      } else {
        var send = Qs.stringify({checkCode: this.form.checkCode})
        this.$http.post('/user/checkCode', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
          if (response.data.code === 0) {
            // 显示loading
            this.$vux.loading.show({
              text: '正在提交...'
            })
            var url = '/user/savePotentialCustomer'
            this.form.educationType = this.form.educationType[0]
            this.form.annualIncome = this.form.annualIncome[0]
            var sendform = Qs.stringify(this.form)
            this.$http.post(url, sendform, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
              if (response.data.code === 0) {
                this.$vux.loading.hide()
                this.to()
              }
            })
          } else {
            self.$vux.alert.show({
              title: '警告',
              content: '验证码错误'
            })
            self.form.checkCode = ''
          }
        })
      }
    },
    // 上传验证码
    postCode () {
    },
    // 跳转页面
    to () {
      console.log('跳转页面')
      this.$router.push({path: '/reserveMeasure', query: {openId: this.form.userId}})
    },
    checkout () {
      if (!this.isNull(this.form.userNamezs) && !this.isNull(this.form.phone) && !this.isNull(this.form.sex && this.form.checkCode === '000000')) {
        return true
      }
      return false
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
    set (name, value, days) {
      var d = new Date()
      d.setTime(d.getTime() + 24 * 60 * 60 * 1000 * days)
      window.document.cookie = name + '=' + value + ';path=/;expires=' + d.toGMTString()
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    dele (name) {
      this.set(name, '', -1)
    },
    loadDictData: function (url, obj, arr) {
      var temp = []
      if (arr) {
        var map = {}
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
              console.log(temp[i])
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
    },
    modify () {
      this.form.educationType = this.form.educationType[0]
      this.form.annualIncome = this.form.annualIncome[0]
      var send = Qs.stringify(this.form)
      this.$http.post('user/modifyPersonal', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          this.$vux.alert.show({
            title: '提示',
            content: '修改成功,关闭页面',
            onHide () {
              WeixinJSBridge.call('closeWindow')
            }
          })
        }
      })
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
.container {
  position: relative;
  display: block;
  height: auto;

}
/* 线 */
.container-line {
  height: 1px;
  background-color: #e0e0e0;
  float: right;
  width: 92%;
}
/* 验证按钮 */
.btn-check {
  position: absolute;
  display: inline-block;
  width: 50px;
  height: 25px;
  border-radius: 5px;
  border: none;
  background-color: #429394;
  color: #fff;
  left: 82%;
  top: 16px;
}
 /* 装x-input的div */
.div-ipt{
  display:block;  position:relative; left: 8px; font-size: 15px;
  padding: 10px 10px 5px 10px;
}
.div-cell{
  display:block;  position:relative; left: 8px; font-size: 15px;
  padding: 5px 10px 5px 10px;
  /* 弹性盒子布局，装逼利器 */
  display: -webkit-flex;
  display: flex;
  垂直居中
  -webkit-align-items: center;
  align-items: center;
  /* 水平居中 */
  /* -webkit-justify-content: center;
  justify-content: center; */
}
/* 表单图标 */
.icon{
  position:relative; top: 12px; float:left; width:14px; height:15px;

}
/* 头部 */
.x-header {
  background-color:#429394 !important;
}
/* 个人信息list样式 */
.group {
  width:92%; margin-left:4%; box-shadow: 0px 0px 4px rgba(66, 147, 148, 0.2);;border-radius: 4px; background-color: #fff
}
/* 去除group里面的border */
.weui-cell:before {
  border: 0 !important;
}
.weui-cells:after {
  border: 0 !important;
}
.weui-cells:before {
  border: 0 !important;
}
.hint-img {
   margin:100px 20% 20px 20%;
   width: 60%;
   height: 170px;
}
.hint-tip {
  font-size: 24px;
  color: #429394;
  width: 100%;
  text-align: center;
}
/* 不可编辑时样式 */
.disable {
  color: #e0e0e0
}
/* 验证按钮显示时电话框的样式 */
.div-phone {
  padding-right:60px
}
/* 验证按钮不显示时电话框样式 */
.divNoVerify {
  padding-right:10px;
}
</style>
