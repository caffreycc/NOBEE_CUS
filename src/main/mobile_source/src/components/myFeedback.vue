<template>
  <div>
  <!-- 绑定微信的title -->
  <div v-title data-title="'sdf'">我的售后</div>
  <!-- 没有订单时显示的 -->
  <div style="width:100%; height:100%" v-if="hint">
    <img class="hint-img" src="../assets/images/已完善信息.png">
    <div class="hint-tip">没有您的售后单哦</div>
  </div>
  <Group class="group" v-if="main">
    <div v-for="list in this.form" class="need-list" style="padding-top:0px; border-bottom:1px solid #f5f5f5;">
      <div class="order-header">
        <div class="order-header-left-1">
        <img class="order-img" src="../assets/images/myOrder_tip.png" width="15" height="15">
        服务号：{{ list.assId }}</div>
        <div class="order-header-right">{{ getTime(list.createDate) }}</div>
      </div>
      <div class="order-content">
        <ul>
          <li class="content-item">
            <div style="float:left">
              反馈问题：<span style="color:#000">{{ list.problemDescribe }}</span> 
            </div>
            <!-- <div style="float:left;">
              已付金额：<span style="color:#000">{{ list.amount }}</span>
            </div> -->
            </span>
          </li>
        </ul>
      </div>
      <div class="footer">
      <div class="shop"><span style="color:#bebebe"> 状态：</span>{{ getStuta(list.isSolve) }}</div>
      <!-- <button class="footer-left"  @click="to('/gzh/or/payOrder', list.opportunityId)">付款</button> -->
        <button class="footer-right" style="width:80px;" >查看详情</button>
      </div>
    </div>
  </Group>
  </div>
</template>

<script>
  import { Group, Cell, dateFormat } from 'vux'
  import Qs from 'qs'
  export default {
    components: { Group, Cell, dateFormat },
    data () {
      return {
        main: true,
        hint: false,
        form: {

        }
      }
    },
    created () {
      this.$http.post('/afterSale/showList', Qs.stringify({optyId: 'd88e95c610774e4d9fc528901f08f7b3'}), {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
        if (response.data.code === 0) {
          this.form = response.data.data
        }
      })
    },
    methods: {
      getTime (val) {
        return dateFormat(val, 'YYYY-MM-DD')
      },
      getStuta (val) {
        if (val === 'Y') {
          return '已解决'
        } else {
          return '待解决'
        }
      }
    }
  }
</script>
<style scoped>
  
</style>
