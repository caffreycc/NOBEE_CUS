<template>
<div>
<!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">订单支付</div>
<div v-show="zfbImg" class="zhifubao_div"><img class="zhifubao_img"src="../assets/zhifubao.png"></div>
<div v-show="order">
    <Group class="group">
      <cell value-align="left" style="margin: 5px 0">
        <div style="width:100%; text-align:center">
          <check-icon :value.sync="payment1" type="plain">定金 </check-icon>
          <check-icon :value.sync="payment2" type="plain" style="margin-left:20%;">销售款</check-icon>
        </div>
      </cell>
    </Group>
    <Group class="group">
      <XInput v-show="!type" type="number" text-align="center" :show-clear="false"  v-bind:class="{disable: type}" placeholder="输入定金" style="height: 50px;font-size:25px; color:#429394" v-model="sendMoney"></XInput>
      <XInput v-show="type" v-model="sendMoney" text-align="center" :show-clear="false"  style="height: 50px;font-size:25px; color:#429394;" placeholder="输入销售款"></XInput>
    </Group>
    <Group class="group" style="margin-top:35px;">
        <div class="payline"></div>
        <img class="icon1" src="../assets/images/客人-标准流程-我的订单-订单生成_06.png" width="16" height="16">
        <img class="icon2" src="../assets/images/客人-标准流程-我的订单-订单生成_03.png" width="16" height="16">
        <radio :selected-label-style="{color: '#FF9900'}" :options="payOptions" @on-change="changePay" v-model="payWay" style="padding-left:20px; margin:10px 0;"></radio>
    </Group>
      <XButton style="margin-top:55px;" type="primary" @click.native="customPay" class="btn">确认支付</XButton>
  </div>
  </div>
</template>
<script type="text/javascript" src="ap.js"></script>
<script type="text/javascript">
  import WeixinJSBridge from 'WeixinJSBridge'
  // import _AP from '_AP'
</script>
<script>
import { CheckIcon, Radio, XButton, XInput, XHeader, Checker, CheckerItem, Divider, Group, Cell, Popup } from 'vux'
import Qs from 'qs'
export default {
  components: { CheckIcon, Radio, XButton, XInput, XHeader, Checker, CheckerItem, Divider, Group, Cell, Popup },
  data () {
    return {
      payment1: true,
      payment2: false,
      payId: '',
      openId: '',
      saleMoney: 0,
      payType: 1,
      payWay: 1,
      type: false,
      payOptions: [{key: 1, value: '微信支付'}, {key: 2, value: '支付宝支付'}],
      sendOpportunityId: '',
      sendPayType: '定金',
      sendMoney: 0,
      sendPayWay: '微信支付',
      zfbImg: false,
      order: true
    }
  },
  watch: {
    payment1: function (val, oldVal) {
      if (this.payment1) {
        this.payType = 1
        this.payment2 = false
        this.sendMoney = ''
      } else {
        this.payType = 2
        this.payment2 = true
      }
    },
    payment2: function (val, oldVal) {
      if (this.payment2) {
        this.payType = 2
        this.payment1 = false
      } else {
        this.payType = 1
        this.payment1 = true
        this.sendMoney = ''
      }
    },
    payType: function (val, oldVal) {
      console.log('val:' + val)
      if (val === 1) {
        this.type = false
        this.sendPayType = '定金'
      } else {
        this.type = true
        this.sendPayType = '销售款'
      }
    },
    payWay: function (val, oldVal) {
      console.log('payWay:' + val)
      if (val === 1) {
        this.sendPayWay = '微信支付'
      } else {
        this.sendPayWay = '支付宝支付'
        var self = this
        if (this.isWeiXin()) {
          const _this = this // 需要注意 onCancel 和 onConfirm 的 this 指向
          this.$vux.confirm.show({
            title: '提示',
            content: '是否确定使用支付宝支付，将跳转到外部浏览器支付',
            // 组件除show外的属性
            onCancel () {
              self.payWay = 1
              self.sendPayWay = '微信支付'
              console.log(this) // 非当前 vm
              console.log(_this) // 当前 vm
            },
            onConfirm () {
              self.zfbImg = true
              self.order = false
            }
          })
        }
      }
    }
  },
  beforeCreate () {
  },
  created () {
    if (!this.isWeiXin()) {
      this.payWay = 2
    }
    this.openId = this.get('userId')
    this.sendOpportunityId = this.$route.query.opportunityId
  },
  methods: {
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    isWeiXin () { // 判断是否微信浏览器
      var ua = window.navigator.userAgent.toLowerCase()
      if (ua.match(/MicroMessenger/i) + '' === 'micromessenger') { // 并不是全=
        // alert('微信')
        return true
      } else {
        // alert('不是微信')
        return false
      }
    },
    zhifubaoPay () {
      if (this.isWeiXin()) {
        this.zfbImg = true
        this.order = false
      } else {
        const url = this.$http.defaults.baseURL + '/aliPay/wapPay?' +
          'opportunityId=' + this.$route.query.opportunityId + '&payment=' + this.sendPayType +
          '&amount=' + this.sendMoney + '&payWay=' + this.sendPayWay + '&userId=' + this.$route.query.openId
        window.location.href = url
      }
    },
    changePay (val) {
      console.log('val' + val)
    },
    customPay () {
      if (!this.isNumber(this.sendMoney) || this.isNull(this.sendMoney) || this.sendMoney === 0) {
        this.$vux.alert.show({
          title: '提示',
          content: '金额不能为空或者非数字'
        })
      } else {
        if (this.payWay === 1) {
          var self = this
          console.log('发送信息：' + {opportunityId: this.sendOpportunityId, payment: this.sendPayType, amount: this.sendMoney, payWay: this.sendPayWay})
          var send = Qs.stringify({userId: this.$route.query.openId, opportunityId: this.$route.query.opportunityId, payment: this.sendPayType, amount: this.sendMoney * 100, payWay: this.sendPayWay})
          this.$http.post('/order/unifiedOrder', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
            this.payId = response.data.payId
            console.log('传订单信息给微信系统' + typeof response.data + 'obj:' + response.data.appId + '--' + response.data.timeStamp + '--' + response.data.nonceStr + '--' + response.data.package + '--' + response.data.signType + '--' + response.data.paySign)
            WeixinJSBridge.invoke('getBrandWCPayRequest', {
              'appId': response.data.appId, // 公众号名称，由商户传入
              'timeStamp': response.data.timeStamp, // 时间戳，自 1970 年以来的秒数
              'nonceStr': response.data.nonceStr, // 随机串
              'package': response.data.package,
              'signType': response.data.signType, // 微信签名方式:
              'paySign': response.data.paySign // 微信签名
            }, function (res) {
              console.log('接收微信系统信息')
              if (res.err_msg === 'get_brand_wcpay_request:ok') {
                console.log('ok')
                self.to()
              } else if (res.err_msg === 'get_brand_wcpay_request:fail') {
                console.log('fail')
                alert(JSON.stringify(res))
              }
            })
          })
        } else {
          this.zhifubaoPay()
        }
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
    // 验证是否数字
    isNumber: function (value) {
      if (/^\d+(\.\d{1,6})?$/.test(value)) {
        return true
      }
      return false
    },
    to () {
      this.$router.push({path: '/payResult', query: {opportunityId: this.opportunityId, payId: this.payId}})
    }
  }
}
/* window.onload = function () {
  var btn = document.querySelector('.J-btn-submit')
  btn.addEventListener('click', function (e) {
    e.preventDefault()
    e.stopPropagation()
    e.stopImmediatePropagation()
    // ele.href 是GET到支付宝收银台的URL
    _AP.pay(e.target.href)
    return false
  }, false)
} */
</script>

<style>
.money-div {
  width:100%
}
.disable {
  color: #bebebe;
}
.icon1 {
  position:absolute; left:10px; top:24px; display:inline; float:left;
}
.icon2 {
  position:absolute; left:10px; top:68px; display:inline; float:left;
}
.payline {
  height: 1px;
  background-color: #f5f5f5;
  position: relative;
  top: 53px;
  width: 90%;
  float: right;
}
</style>
