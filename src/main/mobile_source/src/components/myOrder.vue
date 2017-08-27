<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">我的订单</div>
  <!-- 没有订单时显示的 -->
  <div style="width:100%; height:100%" v-if="hint">
    <img class="hint-img" src="../assets/images/已完善信息.png">
    <div class="hint-tip">没有您的订单哦</div>
  </div>
  <Group class="group" v-if="main">
    <div v-for="list in this.cForm" class="need-list" style="padding-top:0px; border-bottom:1px solid #f5f5f5;">
            <div class="order-header">
              <div class="order-header-left-1">
              <img class="order-img" src="../assets/images/myOrder_tip.png" width="15" height="15">
              订单号：{{ list.orderCode }}</div>
              <div class="order-header-right">{{ list.orderDate }}</div>
            </div>
            <div class="order-content">
              <ul>
                <li class="content-item">
                  <div style="float:left">
                    状态：<span style="color:#000">{{ list.currentStatusShow }}</span> 
                  </div>
                  <div style="float:right;">
                    已付金额：<span style="color:#000">{{ list.amount }}</span>
                  </div>
                  </span>
                </li>
              </ul>
            </div>
            <div class="footer">
            <div class="shop"><span style="color:#bebebe"> 门店：</span>{{ list.shop }}</div>
            <!-- <button class="footer-left"  @click="to('/gzh/or/payOrder', list.opportunityId)">付款</button> -->
              <button class="footer-right" style="width:80px;" @click="to('/orderDetail', list.opportunityId)">查看详情</button>
            </div>
    </div>
  </Group>
  </div>
</template>

<script>
import { Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, dateFormat } from 'vux'
import Qs from 'qs'
export default {
  components: { Cell, XHeader, XInput, Group, XAddress, Datetime, PopupPicker, XButton, dateFormat },
  data () {
    return {
      // note: changing this line won't causes changes
      // with hot-reload because the reloaded component
      // preserves its current state and we are modifying
      // its initial state.
      data: [],
      budgetData: [],
      currentStatusData: [],
      openId: '',
      form: [{}],
      cForm: [{}], // 订单列表循环的数组
      showBudget: [], // 显示预算
      hint: false, // 没有订单时提示
      main: true // 订单列表
    }
  },
  beforeCreate () {
  },
  created () {
    /* 检测用户是否注册过 */
    this.$http.post('/common/checkCustomer', Qs.stringify({userId: this.get('userId')}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === -1) {
        this.$router.push({path: '/'})
      }
    })
    this.openId = this.get('userId')
    console.log('created' + this.openId)
    var send = Qs.stringify({userId: this.openId})
    this.$http.post('/user/myOrder', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === 0) {
        this.form = response.data.data
        if (response.data.data.length === 0) {
          this.hint = true
          this.main = false
        }
        /* 格式化显示时间 */
        for (var i = 0; i < this.form.length; i++) {
          console.log('budget:' + this.form[i].budget)
          this.form[i].orderDate = dateFormat(this.form[i].orderDate, 'YYYY-MM-DD')
        }
        this.loadDictData('/weixin/api/dict/getDictInfo', [this.budgetData], ['OPPORTUNITY_BUDGET_CODE'], this.findDic)
        this.loadDictData('/weixin/api/dict/getDictInfoFilter1', [this.currentStatusData], ['ORDER_STATUS'], this.findDic)
      }
    })
  },
  methods: {
    getAmount (val) {
      if (this.isNull(val)) {
        return 0
      }
      return val
    },
    // 得到状态名称
    getStatu (val) {
      return this.getDicName(val, this.currentStatusData)
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
    get (name) {
      var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)')
      return v ? v[2] : null
    },
    to (url, id) {
      console.log('openId:' + this.$route.query.openId + 'opportunityId:' + id)
      this.$router.push({path: url, query: {opportunityId: id, openId: this.openId}})
    },
    // 根据值来查找在字典中对应的中文, arrData为传入字典数组，arr为值数组
    findDic () {
      var self = this
      console.log('0:' + self.form.length)
      for (var i = 0; i < self.form.length; i++) {
        self.budgetData[0].forEach(function (item) {
          if (item.value === self.form[i].budget) {
            self.form[i].budgetShow = item.name
            console.log('name:' + self.form[i].budgetShow)
          }
        })
        self.currentStatusData[0].forEach(function (item) {
          if (item.value === self.form[i].currentStatus) {
            console.log('name:' + item.name)
            self.form[i].currentStatusShow = item.name
          }
        })
      }
      this.cForm = this.form // 只有完全加载完才正常
    },
    // 完美获取业务字典函数- ，-
    // 工具：加载数据字典（url：访问数据字典的路径，arr是上传字典id的数组，obj：数据字典存放对象的数组，arr必须和obj一样的长度）
    loadDictData: function (url, obj, arr, callBack) {
      var temp = []
      if (arr) {
        // var send = Qs.stringify([])
        this.$http.post(url, arr).then(response => {
          if (response.data.code === 0) {
            for (var i = 0; i < arr.length; i++) {
              temp[i] = []
              response.data.data[arr[i]].forEach(function (item) {
                console.log(item)
                var map = {name: item.text, value: item.id, parent: item.father}
                temp[i].push(map)
              })
              obj[i].push(temp[i])
            }
            callBack()
          }
        })
      } else {
        this.$http.post(url, obj).then(response => {
          if (response.data.code === 0) {
            console.log('data:' + response.data.data)
            response.data.data.forEach(function (item) {
              console.log(item)
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
.order-header {
  width: 100%;
  padding-top: 5px;
  height: 40px;
}
.order-header-left-1 {
  float: left;
  font-size: 14px;
  width: 60%;
  padding: 5px 5px;
}
.order-header-right {
  width: 32%;
  padding: 5px 5px;
  float: right;
  text-align: right;
  font-size: 14px;
  color: #bebebe
}
.order-content {
  min-height:30px;
  width: 100%;
  font-size: 14px;
  color: gray;
}
.order-footer-right {
  float: right;
  margin-right: 20px;
  position:relative;
}
.order-img {
  margin-right:5px; position:relative; top:2px;
}
.shop {
  width: 60%;
  float:left;
  font-size: 14px;
}
</style>
