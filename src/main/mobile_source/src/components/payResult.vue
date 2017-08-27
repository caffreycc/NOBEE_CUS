<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">支付结果</div>
    <!-- <x-header title="支付结果" class="x-header"></x-header> -->
    <div class="pay-div">
      <span class="pay-result">支付成功</span>
      <div class="pay-img">
        <img src="../assets/images/客人-标准流程-我的订单-支付结果01_03.png" width="85" height="75">
      </div>
    </div>
    <ul class="pay-ul">
      <li class="pay-li">付款金额：<span v-text="payMoney"></span></li>
      <li class="pay-li">付款时间：<span v-text="payTime"></span></li>
    </ul>
    <button v-show="btn" class="pay-btn" @click="checkOrder">查看订单信息</button>
    <div v-show="tip" class="order-tip">请回到微信我的订单查看</div>
  </div>
</template>
<script>
import { Alert, dateFormat, Radio, XButton, XInput, XHeader, Checker, CheckerItem, Divider, Group, Cell, Popup } from 'vux'
import Qs from 'qs'
export default {
  components: { Alert, dateFormat, Radio, XButton, XInput, XHeader, Checker, CheckerItem, Divider, Group, Cell, Popup },
  data () {
    return {
      opportunityId: '',
      payId: '',
      payMoney: 0,
      payTime: '',
      btn: true,
      tip: false
    }
  },
  watch: {
  },
  beforeCreate () {
  },
  created () {
    this.opportunityId = this.$route.query.opportunityId
    console.log('opportunityId:' + this.opportunityId)
    var send = Qs.stringify({payId: this.$route.query.payId})
    this.$http.post('/order/isPaySuccess', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === 0) {
        console.log(response.data.data)
        this.payMoney = Number(response.data.data.total_fee / 100)
        this.payTime = response.data.data.time_end
        this.payTime = this.dataformat(this.payTime, 'YYYY-MM-DD HH:mm:ss')
      } else {
        this.$vux.alert.show({
          title: '提示',
          content: '此订单没有支付成功'
        })
      }
    })
    if (!this.isWeiXin()) {
      this.btn = false
      this.tip = true
    }
  },
  methods: {
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
    getPayMoney () {
    },
    dataformat (val) { // 20091225091010
      var arr = []
      arr[0] = val[0] + val[1] + val[2] + val[3]
      arr[1] = val[4] + val[5]
      arr[2] = val[6] + val[7]
      arr[3] = val[8] + val[9]
      arr[4] = val[10] + val[11]
      arr[5] = val[12] + val[13]
      return arr[0] + '-' + arr[1] + '-' + arr[2] + ' ' + arr[3] + ':' + arr[4] + ':' + arr[5]
    },
    checkOrder () {
      this.to()
    },
    to () {
      // this.$router.push({path: '/needDetail', query: {opportunityId: this.$route.query.opportunities}})
      this.$router.push({path: '/myNeed'})
    }
    /* guid () {
      return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
          var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8)
          return v.toString(16)
      })
    } */
  }
}
</script>

<style>
.pay-div {
  text-align: center;
  background-color: #429394;
}
.pay-result {
  color: #fff;
  display: block;
  position: relative;
  top: 35px;
}
.pay-img {
  position: relative;
  top: 40px;
}
.pay-ul {
  list-style: none;
  font-size: 13px;
  margin-top: 50px;
  margin-left: 30px;
}
.pay-li {
  margin-top: 10px;
}
.pay-btn {
  border: 1px solid #429394;
  border-radius: 20px;
  background-color: #fff;
  color: #429394;
  width: 150px;
  height: 35px;
  margin: 40px auto;
  display: block;
}
.order-tip {
  width: 90%;
  margin-left: 5%;
  background-color: #fff;
  border-radius: 10px;
  margin-top: 100px;
  text-align: center;
  font-size: 23px;
  color: #429394;
}
</style>
