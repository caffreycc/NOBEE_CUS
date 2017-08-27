<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">评价</div>
  <group class="group" v-for="item in form.eva" :key="item.evaGrade">
    <div class="div-title-evaluate" :class="{opacity: evaluate}">
      <cell :title="item.evaObject" style="width:70%">
        <rater style="float:left" v-model="item.evaGrade" slot="value" margin="6" :max="5" active-color="#429394" :disabled="rater"></rater>
      </cell>
      <span style="padding-left:3%; color:#429394; width:50px;">{{ getStore(item.evaGrade) }}分</span>
    </div>
    <x-textarea v-if="!evaluate"  v-model="item.evaDescription" placeholder="说说你想说的，或者有什么更好的建议吗？" style="border-top:1px solid #f5f5f5" height=120></x-textarea>
    <div v-if="evaluate" class="textarea-show" v-text="item.evaDescription"></div>
  </group>
  <XButton v-if="!evaluate" type="primary" class="btn" style="margin-top:20px" @click.native="postEvaluate">提交</XButton>
  <XButton v-if="evaluate" type="primary" class="btn" style="margin-top:20px" @click.native="back">返回</XButton>
  </div>
</template>
  m
<script>

/* 引入vux组件 */
import { XTextarea, Range, Rater, dateFormat, Cell, XHeader, XInput, Group, PopupPicker, XButton } from 'vux'
import Qs from 'qs'
export default {
  components: { XTextarea, Range, Rater, dateFormat, Cell, XHeader, XInput, Group, PopupPicker, XButton },
  data () {
    return {
      rater: false, // 是否禁用星星，true为禁用
      userId: '',
      evaluate: false, // 是否评价过
      form: {
        userId: '',
        optyId: '',
        eva: [{
          evaGrade: 0,
          evaObject: '配送速度',
          evaDescription: ''
        }, {
          evaGrade: 0,
          evaObject: '安装速度',
          evaDescription: ''
        }]
      }
    }
  },
  created () {
    this.evaluate = this.$route.query.evaluated
    this.userId = this.get('userId')
    if (this.$route.query.evaluated) {
      var send = Qs.stringify({opportunityId: this.$route.query.opportunityId, userId: this.get('userId')})
      this.$http.post('/evaluate/show', send).then(response => {
        if (response.data.code === 0) {
          this.form.eva = response.data.data
          this.form.eva.forEach(function (item) {
            item.evaGrade = parseInt(item.evaGrade)
          })
          this.rater = true // 禁用星星功能
        }
      })
    }
  },
  watch: {
    rateStar: function (val, oldVal) {
      console.log('星星' + val)
      this.rateStore = val * 20
    }
  },
  methods: {
    back () {
      this.$router.push({path: '/orderDetail', query: {opportunityId: this.$route.query.opportunityId}})
    },
    getStore (val) {
      return val
    },
    postEvaluate () {
      var self = this
      this.form.userId = this.get('userId')
      this.form.optyId = this.$route.query.opportunityId
      this.$vux.loading.show({
        text: '提交中'
      })
      this.$http.post('/evaluate/insert', this.form).then(response => {
        if (response.data.code === 0) {
          this.$vux.loading.hide()
          this.$vux.alert.show({
            title: '提示',
            content: '提交成功，谢谢您的评价',
            onHide () {
              self.$router.push({path: '/orderDetail', query: {opportunityId: self.$router.query.opportunityId}})
            }
          })
        }
      })
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    }
  }
}
</script>
<style>
.div-title-evaluate {
  height: 50px;
  font-size: 15px;
  /* 弹性盒子布局，装逼利器 */
  display: -webkit-flex;
  display: flex;
  -webkit-align-items: center;
  align-items: center;
}
.textarea-show {
  height: 100px;
  padding: 10px 20px;
  color:#bebebe;
}
.opacity {
  opacity: 0.5
}
</style>
