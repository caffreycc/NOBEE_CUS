<template>
  <div>
    <Group class="group" title="问题描述" style="padding-top:5px; margin-top:20px;">
      <x-textarea v-model="form.rlAfterSaleServiceInfo.problemDescribe" style="border-top:1px solid #f5f5f5"></x-textarea>
    </Group>
    <Group class="group" :title="'上传了' + showImgList.length + '张图片'" style="padding-top:5px; margin-top:20px;">
      <div class="div-ipt" style="min-height:100px; border-top:1px solid #f5f5f5">
        <div class="div-img" v-for="item in showImgList"><img :src="'http://milinkinfo.com' + item" width="60" height="60"></div>
      </div>
      <div style="height:40px; float:left; width:100%">
        <button class="footer-right" style="width:80px; margin-right:10px;" @click="fileClick">选择图片</button>
      </div>
    </Group>
    <XButton type="primary" class="btn" style="margin-top:20px" @click.native="addFinish">申请售后</XButton>
    <input @change="fileChange($event)" type="file" id="upload_file" multiple style="display: none"/>
  </div>
</template>

<script>
// import Qs from 'qs'
import { Cell, XInput, Group, XTextarea, XButton } from 'vux'
export default {
  components: { Cell, XInput, Group, XTextarea, XButton },
  data () {
    return {
      imgList: [],
      showImgList: [], // 显示图片的数组
      form: {
        rlAfterSaleServiceInfo: {
          expectTime: '',
          orderId: '',
          problemDescribe: ''
        },
        userId: '',
        uuids: []
      }
    }
  },
  created () {
    this.form.rlAfterSaleServiceInfo.orderId = this.$route.query.opportunityId
    this.form.userId = this.get('userId')
    // this.form.rlAfterSaleServiceInfo.expectTime = '2017-09-09'
  },
  methods: {
    addFinish () {
      var self = this
      this.$http.post('/afterSale/applyFor ', this.form).then(response => {
        if (response.data.code === 0) {
          this.$vux.alert.show({
            title: '提示',
            content: '售后申请提交成功，等待联系',
            onHide () {
              self.$router.push({path: '/orderDetail', query: {opportunityId: self.$route.query.opportunityId}})
            }
          })
        }
      })
    },
    update (e) {
      let file = e.target.files[0]
      let param = new FormData() // 创建form对象
      param.append('file', file, file.name) // 通过append向form对象添加数据
      param.append('chunk', '0') // 添加form表单中其他数据
      console.log(param.get('file')) // FormData私有类对象，访问不到，可以通过get判断值是否传进去
      let config = {
        headers: {'Content-Type': 'multipart/form-data'}
      } // 添加请求头
      this.$http.post('/afterSale/uploadApplyFor?userId=' + this.get('userId'), param, config)
      .then(response => {
        console.log(response.data)
      })
    },
    postImg (e) {
      let file = e.target.files[0]
      let param = new FormData() // 创建form对象
      param.append('file', file, file.name) // 通过append向form对象添加数据
      param.append('chunk', '0') // 添加form表单中其他数据
      console.log(param.get('file')) // FormData私有类对象，访问不到，可以通过get判断值是否传进去
      let config = {
        headers: {'Content-Type': 'multipart/form-data'}
      } // 添加请求头
      var self = this
      this.$vux.loading.show({
        text: '正在上传中'
      })
      this.$http.post('/afterSale/uploadApplyFor?userId=' + self.get('userId'), param, config)
      .then(response => {
        if (response.data.code === 0) {
          this.showImgList.push(response.data.data.url)
          this.form.uuids.push(response.data.data.uuid)
          this.$vux.loading.hide()
          this.$vux.toast.text('上传成功', 'middle')
        } else {

        }
      })
    },
    fileClick () {
      /* if (this.showImgList.length >= 3) {
        this.$vux.alert.show({
          title: '提示',
          content: '最多只能上传三张图片'
        })
      } */
      // 触发双击事件
      document.getElementById('upload_file').click()
      document.getElementById('upload_file').click()
    },
    fileChange (el) {
      this.postImg(el)
      /* if (!el.target.files[0].size) return
      this.fileList(el.target.files)
      el.target.value = '' */
    },
    fileList (files) {
      for (let i = 0; i < files.length; i++) {
        this.fileAdd(files[i])
      }
    },
    fileAdd (file) {
      this.size = this.size + file.size // 总大小
      let reader = new FileReader()
      reader.vue = this
      reader.readAsDataURL(file)
      reader.onload = function () {
        file.src = this.result
        this.vue.imgList.push({
          file
        })
      }
    },
    fileDel (index) {
      this.size = this.size - this.imgList[index].file.size // 总大小
      this.imgList.splice(index, 1)
    },
    bytesToSize (bytes) {
      if (bytes === 0) {
        return '0 B'
      }
      let k = 1000 // or 1024
      let sizes = ['B', 'KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB']
      let i = Math.floor(Math.log(bytes) / Math.log(k))
      return (bytes / Math.pow(k, i)).toPrecision(3) + ' ' + sizes[i]
    },
    dragenter (el) {
      el.stopPropagation()
      el.preventDefault()
    },
    dragover (el) {
      el.stopPropagation()
      el.preventDefault()
    },
    drop (el) {
      el.stopPropagation()
      el.preventDefault()
      this.fileList(el.dataTransfer.files)
    },
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    }
  }
}
</script>
<style scoped>
  .upload_warp_img_div_del {
    position: absolute;
    top: 6px;
    width: 16px;
    right: 4px;
  }
  .upload_warp_img_div_top {
    position: absolute;
    top: 0;
    width: 100%;
    height: 30px;
    background-color: rgba(0, 0, 0, 0.4);
    line-height: 30px;
    text-align: left;
    color: #fff;
    font-size: 12px;
    text-indent: 4px;
  }
  .upload_warp_img_div_text {
    white-space: nowrap;
    width: 80%;
    overflow: hidden;
    text-overflow: ellipsis;
  }
  .upload_warp_img_div img {
    max-width: 100%;
    max-height: 100%;
    vertical-align: middle;
  }
  .upload_warp_img_div {
    position: relative;
    height: 100px;
    width: 120px;
    border: 1px solid #ccc;
    margin: 0px 30px 10px 0px;
    float: left;
    line-height: 100px;
    display: table-cell;
    text-align: center;
    background-color: #eee;
    cursor: pointer;
  }
  .upload_warp_img {
    border-top: 1px solid #D2D2D2;
    padding: 14px 0 0 14px;
    overflow: hidden
  }
  .upload_warp_text {
    text-align: left;
    margin-bottom: 10px;
    padding-top: 10px;
    text-indent: 14px;
    border-top: 1px solid #ccc;
    font-size: 14px;
  }
  .upload_warp_right {
    float: left;
    width: 57%;
    margin-left: 2%;
    height: 100%;
    border: 1px dashed #999;
    border-radius: 4px;
    line-height: 130px;
    color: #999;
  }
  .upload_warp_left img {
    margin-top: 32px;
  }
  .upload_warp_left {
    float: left;
    width: 40%;
    height: 100%;
    border: 1px dashed #999;
    border-radius: 4px;
    cursor: pointer;
  }
  .upload_warp {
    margin: 14px;
    height: 130px;
  }
  .upload {
    border: 1px solid #ccc;
    background-color: #fff;
    width: 650px;
    box-shadow: 0px 1px 0px #ccc;
    border-radius: 4px;
  }
  .hello{
    width: 650px;
    margin-left: 34%;
  }
  .div-img {
    float: left;
    padding: 10px;
  }
</style>
