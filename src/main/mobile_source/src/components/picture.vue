<template>
<div>
  
  <div class="picture-item" v-for="item in items">
    <div class="title">{{ item.type }}</div>
    <div class="div-imgs">
    <div class="div-img" v-for="(i, index) in item.pics">
      <img class="previewer-demo-img picture-img" :src="i.src" width="100" height="100" @click="show(item.pics, index)">
      <div>{{ i.picDes }}</div>
    </div>
    </div>
  </div>
  <div v-transfer-dom>
    <previewer :list="list" ref="previewer" :options="options"></previewer>
  </div>
  <!-- 没有图片时显示的 -->
  <div style="width:100%; height:100%" v-show="hint">
    <img class="hint-img" src="../assets/images/已完善信息.png">
    <div class="hint-tip">还没有出图,请联系导购</div>
  </div>
</div>
</template>

<script>
import { TransferDom, Previewer, Radio, XButton, XInput, Group, Cell, Popup } from 'vux'
import Qs from 'qs'
export default {
  directives: {
    TransferDom
  },
  components: { Previewer, Radio, XButton, XInput, Group, Cell, Popup },
  data () {
    return {
      hint: false,
      items: [],
      list: [{
        src: ''
      }],
      options: {
        getThumbBoundsFn (index) {
          // find thumbnail element
          let thumbnail = document.querySelectorAll('.previewer-demo-img')[index]
          // get window scroll Y
          let pageYScroll = window.pageYOffset || document.documentElement.scrollTop
          // optionally get horizontal scroll
          // get position of element relative to viewport
          let rect = thumbnail.getBoundingClientRect()
          // w = width
          return {x: rect.left, y: rect.top + pageYScroll, w: rect.width}
          // Good guide on how to get element coordinates:
          // http://javascript.info/tutorial/coordinates
        }
      }
    }
  },
  created () {
    var send = Qs.stringify({optyId: this.$route.query.opportunityId, userId: this.get('userId')})
    var self = this
    this.$http.post('/attach/show', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      // if (response === 0) {
      self.items = response.data.data
      console.log(self.items)
      if (response.data.data.length === 0) {
        self.hint = true
      }
      // }
    })
  },
  methods: {
    show (arr, index) {
      var self = this
      this.list = arr
      setTimeout(function () {
        self.$refs.previewer.show(index)
      }, 100)
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    }
  }
}

</script>
<style scoped>
  .title {
    color: #429394;
    font-size: 16px;
    margin-bottom: 10px;
  }
  .div-imgs {
    text-align: center;
  }
  .picture-item {
    border-bottom: 1px solid #e0e0e0;
    width: 90%;
    margin-left: 5%;
    padding-bottom: 20px;
  }
  .picture-img {
    padding:10px;
    background-color: #fff;
  }
</style>
