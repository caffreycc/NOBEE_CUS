<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">我的需求</div>
  <!-- 没有需求时显示的 -->
  <div style="width:100%; height:100%" v-if="hint">
    <img class="hint-img" src="../assets/images/已完善信息.png">
    <div class="hint-tip">没有您的需求哦</div>
  </div>
  <Group class="group" v-if="main">
    <div v-for="list in this.cForm" class="need-list">
            <div class="header">
              <div class="header-left">
              {{ getStatu(list.currentStatusShow) }}</div>
              <div class="header-right">已付款：<sapn style="color:#429394">￥{{ getAmount(list.amount) }}</sapn></div>
            </div>
            <div class="content">
              <ul>
                <li class="content-item">
                  希望测量时间：<span style="color:#000">{{ list.expectMeasureDate }}</span>
                  
                </li>
                <li class="content-item">
                  需求：<span style="color:#000; margin-right:30px">{{ list.count }}项</span>
                  预算：<span style="color:#000;">{{ list.budgetShow }}</span>
                </li>
              </ul>
            </div>
            <div class="footer">
            <!-- <button class="footer-left"  @click="to('/gzh/or/payOrder', list.opportunityId)">付款</button> -->
              <button class="footer-right" style="width:80px;"  @click="to('/needDetail', list.opportunityId)">查看详情</button>
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
      content: ['预算：1-2万', '需求数量：10'],
      id: [{id: 1, content: '预算：1-2万'}, {id: 2, content: '需求数量：10'}],
      budgetData: [],
      currentStatusData: [],
      openId: '',
      form: [{}],
      cForm: [{}],
      showBudget: [],
      hint: false, // 没有需求时提示
      main: true // 需求列表
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
    this.$http.post('/user/myRequire', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      if (response.data.code === 0) {
        // 如果没有需求显示提示
        if (response.data.data.length === 0) {
          this.hint = true
          this.main = false
        }
        this.form = response.data.data
        for (var i = 0; i < this.form.length; i++) {
          console.log('budget:' + this.form[i].budget)
          this.form[i].expectMeasureDate = dateFormat(this.form[i].expectMeasureDate, 'YYYY-MM-DD')
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
    getStatu (val) {
      if (val === '潜客') {
        return '待测量'
      } else {
        return val
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
.vux-demo {
  text-align: center;
}
.logo {
  width: 100px;
  height: 100px
}
.header {
  width: 98%;
  margin-left: 10px;
  padding-top: 5px;
  padding-bottom: 5px;
  height: 30px;
}
.header-left, .header-right {
  width: 45%;
  padding: 5px 5px;
}
.header-left {
  float: left;
  font-size: 14px;
  background-color: #fff;
  width: 70px;
  height: 26px;
  color: #fff;
  border-radius: 6px;
  background-image: url(../assets/images/tip.png);
  background-size:auto 34px;
  background-repeat: no-repeat;
}
.header-left-tip {
  width: 20px;

}
.header-right {
  float: right;
  text-align: right;
  font-size: 14px;
  color: #bebebe
}

.content {
  padding-top: 10px;
  height:auto;
  width: 100%;
  font-size: 14px;
  color: gray;
}
.content-item {
  list-style: none;
  display: block;
  margin: 10px 10px;

}
.footer {
  height: 30px;
  padding: 5px 10px 10px 10px;
}
.footer-right {
  float: right;
  /* margin-right: 20px; */
  position:relative;
}
.footer-left {
  float: right;
}
.footer-left,.footer-right {
  width: 60px;
  height: 30px;
  background-color:#fff !important;
  color: #429394;
  border-radius: 30px;
  border:1px solid #429394;
}
.need-list {
  padding: 15px 10px 0px 10px;
  border-bottom: 1px solid #f5f5f5
}
</style>
