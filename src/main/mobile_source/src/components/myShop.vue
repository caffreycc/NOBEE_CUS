<template>
<div style="height:100%">
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">我的门店</div>
  <div v-show="nearbyShop">
    <div style="width:100%; height:100%; position:relative">
      <!-- <img class="hint-img" src="../assets/images/已完善信息.png">
      <div class="hint-tip">还在开发中</div> -->
      <div class="bmap" id="container"></div>
      <img @click="location" class="location-img" src="../assets/images/location.png" width="66" height="66">
      <Group class="group bmap-group">
        <div class="my-address div-cell">
          <img class="detail-icon" src="../assets/images/shop_address.png" width="14" height="14">
          <span class="address-title">{{ addressTitle }}</span>
        </div>
        <div v-for="item in nearForm" @click="toShopDetail(item.orgId)" :key="item.orgId">
          <div class="div-ipt shop-list">
            <span class="shop-name" style="display:block">{{ item.orgName }}</span>
            <span class="distance" style="position:absolute; top:20px; right:20px;"><img style="padding-right:10px;" src="../assets/images/distance.png" width=14 height=14>{{ getDistance(item.distance) }}公里</span>
            
          </div>
          <div class="div-cell no-padding" style="font-size:14px">
           <img class="detail-icon" src="../assets/images/myShopAddress.png">
           <cell>{{ item.address }}</cell>
          </div>
          <div class="div-ipt">
            <!-- <img class="detail-icon" src="../assets/images/phone.png">
            <cell  value-align="left">{{ item.cellPhone}}</cell> -->
            <button class="footer-right" style="position:absolute; top:-35px; right:20px" @click.stop="toReserve(item.orgId)">预约</button>
          </div>
        </div>
      </Group>
    </div>
  </div>
  <div v-show="myShop" style="height:100%">
    <Group class="group" style="margin-bottom:20px;" v-for="item in form" @click.native="toShopDetail(item.orgId)" :key="item.orgId">
      <div class="div-ipt shop-list">
        <span class="shop-name">{{ item.orgName }}</span>
        <span class="distance">11.2km</span>
        <img class="distance-img" src="../assets/images/distance.png" width=14 height=14>
      </div>
      <div class="div-cell no-padding" style="font-size:14px">
       <img class="detail-icon" src="../assets/images/myShopAddress.png">
       <cell>{{ item.address }}</cell>
      </div>
      <div class="div-cell">
        <img class="detail-icon" src="../assets/images/phone.png">
        <cell  value-align="left">{{ item.cellPhone}}</cell>
        <button class="footer-right right" @click.stop="toReserve(item.orgId)">预约</button>
      </div>
    </Group>
  </div>
  <div class="bottom-tab">
  <tab :line-width="2">
    <tab-item :selected="status == 0" @on-item-click="onClickTab" >附近门店</tab-item>
    <tab-item :selected="status == 1" @on-item-click="onClickTab" >我的门店</tab-item>
  </tab>
  </div>
 </div>
</template>
<script >

import { ViewBox, Tab, TabItem, Cell, XInput, Group, XAddress, Datetime, PopupPicker, XButton, dateFormat } from 'vux'
import Qs from 'qs'
export default {
  components: { ViewBox, Tab, TabItem, Cell, XInput, Group, XAddress, Datetime, PopupPicker, XButton, dateFormat },
  data () {
    return {
      tabList: ['附近门店', '我的门店'],
      status: 1,
      nearbyShop: false,
      myShop: true,
      form: {}, // 我的门店数组
      latitude: 0, // 维度
      longitude: 0, // 精度
      nearForm: {}, // 附近门店数组
      addressTitle: '' // 我的地址
    }
  },
  mounted () {
    var self = this
    var BMap = window.BMap
    // 回头你自己看这两个怎么设置
    var BMAP_ANCHOR_TOP_LEFT = 0
    var BMAP_STATUS_SUCCESS = 0
    var mark
    // 百度地图API功能
    var sContent = '您在这里'
    // 初始化地图
    var map = new BMap.Map('container')
    map.enableScrollWheelZoom()
    // 获取位置
    var geolocation = new BMap.Geolocation()
    geolocation.getCurrentPosition(function (r) {
      if (this.getStatus() === BMAP_STATUS_SUCCESS) {
        mark = new BMap.Marker(r.point)
        map.addOverlay(mark)
        mark.enableDragging()
        mark.addEventListener('dragend', function (e) {
          // 获取中文地址更新addressTitle
          // 发送一次附近门店请求
          alert(e.point.lat + '-' + e.point.lng)
          self.postAddress(e.point.lat, e.point.lng)
        })
        var infoWindow = new BMap.InfoWindow(sContent)
        mark.openInfoWindow(infoWindow)
        map.panTo(r.point)
        map.centerAndZoom(r.point, 15)
        var ads = ''
        ads += r.address.province
        ads += r.address.city
        ads += r.address.district
        ads += r.address.street
        ads += r.address.street_number
        self.addressTitle = ads
        alert('维度' + r.point.lat + '-精度：' + r.point.lng)
        self.postAddress(r.point.lat, r.point.lng)
      } else {
        alert('failed' + this.getStatus())
      }
    }, {enableHighAccuracy: true})
    // 开启鼠标滚轮缩放
    map.enableScrollWheelZoom()
    var size = BMap.Size(300, 300)
    var icon = new BMap.Icon('http://note.youdao.com/favicon.ico', size, {
      anchor: size,
      imageOffset: size,
      infoWindowAnchor: size,
      printImageUrl: 'http://note.youdao.com/favicon.ico'
    })
    // 自定义事件-重新定位
    var geolocationControl = new BMap.GeolocationControl({
      locationIcon: icon
    })
    geolocationControl.addEventListener('locationSuccess', function (e) {
      // 定位成功事件
      console.log('e:' + e.addressComponent)
      var address = ''
      address += e.addressComponent.province
      address += e.addressComponent.city
      address += e.addressComponent.district
      address += e.addressComponent.street
      address += e.addressComponent.streetNumber
      map.panTo(e.point)
      map.centerAndZoom(e.point, 12)
      self.addressTitle = address
      alert('当前定位地址为：' + '维度：' + e.point.lat + '精度:' + e.point.lng + address)
      self.postAddress(e.point.lat, e.point.lng)
    })
    geolocationControl.addEventListener('locationError', function (e) {
      // 定位失败事件
      alert(e.message)
    })
    // 定义methods里重新定位的方法
    this.location = function () {
      geolocationControl.location()
    }
    // map.addControl(geolocationControl)
    function ZoomControl () {
      // 默认停靠位置和偏移量
      this.defaultAnchor = BMAP_ANCHOR_TOP_LEFT
      this.defaultOffset = new BMap.Size(10, 10)
    }
    ZoomControl.prototype = new BMap.Control()
    // 自定义控件必须实现自己的initialize方法,并且将控件的DOM元素返回
    // 在本方法中创建个div元素作为控件的容器,并将其添加到地图容器中
    ZoomControl.prototype.initialize = function (map) {
      // 创建一个DOM元素
      var div = document.createElement('div')
      // 添加文字说明
      div.appendChild(document.createTextNode('重新定位'))
      // 设置样式
      div.style.cursor = 'pointer'
      div.style.border = '1px solid gray'
      div.style.backgroundColor = 'white'
      // 绑定事件,点击时触发重新定位事件
      div.onclick = function (e) {
        geolocationControl.location()
      }
      // 添加DOM元素到地图中
      map.getContainer().appendChild(div)
      // 将DOM元素返回
      return div
    }
    // 创建控件
    var myZoomCtrl = new ZoomControl()
    // 添加到地图当中 控件
    map.addControl(myZoomCtrl)
    map.addControl(geolocationControl)
  },
  created () {
    /* 检测用户是否注册过 */
    this.$http.post('/common/checkCustomer', Qs.stringify({userId: this.get('userId')}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === -1) {
        this.$router.push({path: '/'})
      }
    })
    if (!this.isNull(this.$route.query.shop)) {
      this.status = parseInt(this.$route.query.shop) // 获取shop选择显示tab
    }
    var self = this
    this.$http.post('/store/myStore', Qs.stringify({userId: this.get('userId')}, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}})).then(response => {
      if (response.data.code === 0) {
        this.form = response.data.data
        if (this.form.length === 0) { // 没有我的门店时
          self.$vux.alert.show({
            title: '提示',
            content: '还没有预约门店,去附近门店查看',
            onHide () {
              self.status = 0
              self.nearbyShop = true
              self.myShop = false
            }
          })
        }
      }
    })
  },
  methods: {
    getDistance (val) {
      return (val / 1000).toFixed(1)
    },
    location () {
      alert('原来location')
    },
    // 上传位置，获取附近门店
    postAddress (lat, lng) {
      this.$http.post('/store/nearby', Qs.stringify({latitude: lat, longitude: lng}, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}})).then(response => {
        this.nearForm = response.data.data
      })
    },
    // 跳转预约测量，带门店id
    toReserve (orgId) {
      this.$router.push({path: '/reserveMeasure', query: {orgId: orgId}})
    },
    /* orgId：门店id */
    toShopDetail (orgId) {
      console.log('跳转门店')
      this.$router.push({path: '/shopDetail', query: {orgId: orgId}})
    },
    onClickTab: function (status) {
      this.status = status
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    // 检测字段是否为空
    isNull: function (str) {
      if (str === '' || str === null || str === undefined) {
        return true
      }
      var regu = '^[ ]+$'
      var re = new RegExp(regu)
      return re.test(str)
    }
  },
  watch: {
    status: function (val, oldVal) {
      if (val === 1) {
        this.myShop = true
        this.nearbyShop = false
        var self = this
        if (this.form.length === 0) { // 没有我的门店时
          self.$vux.alert.show({
            title: '提示',
            content: '还没有预约门店,去附近门店查看',
            onHide () {
              self.status = 0
              self.nearbyShop = true
              self.myShop = false
            }
          })
        }
      } else {
        this.myShop = false
        this.nearbyShop = true
      }
    }
  }
}
</script>
<style scoped>
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
.right {
  position: relative;
  left: 27%;
}
.bmap {
  width:100%;height:250px;border:1px solid gray
}
.shop-list {
  padding: 20px 10px 0px 10px;
}
.distance {
  float:right; color:#429394; margin-right:10px; display: inline-block;
}
.distance-img {
  float:right; margin-right:10px; position:relative; top:3px;
}
.shop-name {
  font-size:18px;
  width: 70%;
}
.bmap-group {
  position: relative;
  top: -50px;
}
.my-address {
  padding-top: 15px;
  font-size: 16px;
  padding-bottom: 15px;
  border-bottom: 1px solid #f5f5f5;
}
.location-img {
  position: absolute;
  top: 190px;
  left: 75%;
  z-index:9999;
}
.location-img:active {
  opacity: 0.4;
}
.address-title {
  padding-left:20px; padding-right:60px; display:inline-block;
}
</style>
