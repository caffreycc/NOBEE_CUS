<template>
<div style="height:100%">
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">门店详情</div>
  <div style="height:100%">
    <Group class="group" style="margin-bottom:20px;">
      <div class="div-ipt" style="padding: 20px 10px 0px 10px">
        <span style="font-size:18px;">{{ form.orgName }}</span>
        <span style="float:right; color:#429394; margin-right:10px;">11.2km</span>
        <img style="float:right; margin-right:10px; position:relative; top:3px;" src="../assets/images/distance.png" width=14 height=14>
      </div>
      <div class="div-cell no-padding" style="font-size:14px">
       <img class="detail-icon" src="../assets/images/myShopAddress.png">
       <cell>{{ form.address }}</cell>
      </div>
      <div class="div-cell">
        <img class="detail-icon" src="../assets/images/phone.png">
        <cell  value-align="left">{{ form.cellPhone}}</cell>
      </div>
    </Group>
    <view-box ref="viewBox">
      <div class="group">
      <div style="width:100%; height:40px;font-size:23px;display:flex;-webkit-align-items: center; align-items: center; -webkit-justify-content: center;justify-content: center; font-weight: bold; border-bottom:1px solid #f5f5f5">门店介绍</div>
      <div style="padding:10px" v-html="introduce"></div>
      <!-- <iframe src="./#/introduce" width="100%" frameborder="0" scrolling="no" id="test" onload="this.height=100"></iframe> -->
      </div>
    </view-box>
    
  </div>
 </div>
</template>
<script >
import { ViewBox, Cell, XInput, Group, XButton } from 'vux'
import Qs from 'qs'
import introde from './introduce'
export default {
  components: { ViewBox, Cell, XInput, Group, XButton, introde },
  data () {
    return {
      introduce: '',
      form: {}
    }
  },
  created () {
    // setInterval(this.reinitIframe, 1000)
    this.$http.post('/store/details', Qs.stringify({orgId: this.$route.query.orgId}, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}})).then(response => {
      if (response.data.code === 0) {
        this.form = response.data.data
      }
    })
    var send = Qs.stringify({orgId: this.$route.query.orgId})
    this.$http.post('/store/introduce', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      this.introduce = response.data
    })
  },
  methods: {
    reinitIframe () {
      var iframe = document.getElementById('test')
      try {
        var bHeight = iframe.document.body.offsetHeight
        console.log('b:' + bHeight)
        var dHeight = iframe.contentWindow.document
        console.log('d:' + dHeight)
        var cHeight = iframe.contentWindow.document.body.scrollHeight
        console.log('c:' + cHeight)
        var height = Math.max(bHeight, dHeight)
        iframe.height = height
      } catch (ex) {
        console.log('错误')
      }
    }
  },
  watch: {
  }
}
</script>
<style >
.bottom-tab {
	position: absolute;
	bottom: 0px;
  width: 100%
}
html, body {
    height: 100%;
    width: 100%;
    overflow-x: hidden;
}
</style>
