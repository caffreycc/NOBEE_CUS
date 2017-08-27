// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
// import querystring from 'querystring'
import FastClick from 'fastclick'
import VueRouter from 'vue-router'
import App from './App'
import PersonalInfo from './components/personalInfo'
import MyNeed from './components/myNeed'
import ReserveMeasure from './components/reserveMeasure'
import NeedDetail from './components/needDetail'
import NeedModify from './components/needModify'
import PayOrder from './components/payOrder'
import PayResult from './components/payResult'
import zhifubao from './components/zhifubao'
import MyOrder from './components/myOrder'
import OrderDetail from './components/OrderDetail'
import Evaluate from './components/evaluate'
import MyShop from './components/myShop'
import Picture from './components/picture'
import Introduce from './components/introduce'
import ShopDetail from './components/shopDetail'
import SaleFeedback from './components/saleFeedback'
import MyFeedback from './components/myFeedback'
import axios from 'axios'
// import VueAxios from 'vue-axios'
import { LoadingPlugin, AlertPlugin, ConfirmPlugin, ToastPlugin } from 'vux'
// import Qs from 'qs'

// Vue.use(VueAxios, axios)
// Vue.use(AjaxPlugin)
Vue.use(LoadingPlugin)
Vue.use(ConfirmPlugin)
Vue.use(ToastPlugin)
Vue.use(AlertPlugin)
Vue.use(VueRouter)

/* var axiosInstance = axios.create({
  transformRequest: [function (data) {
    data = Qs.stringify(data)
    return data
  }],
  headers: {'Content-Type': 'application/x-www-form-urlencoded'}
})
Vue.use(VueAxios, axiosInstance) */

Vue.prototype.$http = axios

// 支持json格式
// Vue.http.options.emulateJSON = false
// axios.defaults.withCredentials = true

if (process.env.NODE_ENV === 'development') {
  // 开发环境
  axios.defaults.baseURL = 'http://milinkInfo.com/nobee_weixin_ipad_api'
  // axios.defaults.baseURL = 'http://chenshengjv.tunnel.qydev.com/nobee_weixin_ipad_api'
} else {
  // 测试生产环境
  axios.defaults.baseURL = 'http://milinkInfo.com/nobee_weixin_ipad_api'
  // axios.defaults.baseURL = 'http://chenshengjv.tunnel.qydev.com/nobee_weixin_ipad_api'
}
/* Vue.http.defaults.transformRequest = [function (data) {
  return querystring.stringify(data)
}] */

// 标题全局变量
Vue.directive('title', {
  inserted: function (el, binding) {
    document.title = el.innerText
    el.remove()
  }
})
Vue.component('introduce', {
  template: '<template><div v-html="introduce"></div></template>'
})
const routes = [{
  path: '/',
  component: PersonalInfo
},
{
  path: '/myNeed',
  component: MyNeed
},
{
  path: '/reserveMeasure',
  component: ReserveMeasure
},
{
  path: '/needDetail',
  component: NeedDetail
},
{
  path: '/needModify',
  component: NeedModify
},
{
  path: '/gzh/or/payOrder',
  component: PayOrder
},
{
  path: '/payResult',
  component: PayResult
},
{
  path: '/zhifubao',
  component: zhifubao
},
{
  path: '/evaluate',
  component: Evaluate
},
{
  path: '/myOrder',
  component: MyOrder
},
{
  path: '/orderDetail',
  component: OrderDetail
},
{
  path: '/myShop',
  component: MyShop
},
{
  path: '/introduce',
  component: Introduce
},
{
  path: '/picture',
  component: Picture
},
{
  path: '/shopDetail',
  component: ShopDetail
},
{
  path: '/saleFeedback',
  component: SaleFeedback
},
{
  path: '/myFeedback',
  component: MyFeedback
}]

const router = new VueRouter({
  // mode: 'history',
  routes
})

FastClick.attach(document.body)

Vue.config.productionTip = false
// 自定义全局函数
Vue.prototype.isNull = function (str) {
  if (str === '' || str === null || str === undefined) {
    return true
  }
  var regu = '^[ ]+$'
  var re = new RegExp(regu)
  return re.test(str)
}
/* eslint-disable no-new */
new Vue({
  router,
  render: h => h(App)
}).$mount('#app-box')
