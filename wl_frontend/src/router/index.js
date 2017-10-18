/*
import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: HelloWorld
    }
  ]
})
*/
import Vue from 'vue'
import Router from 'vue-router'
import '@progress/kendo-ui'
import '@progress/kendo-theme-default/dist/all.css'
import { KendoCalendar } from '@progress/kendo-dateinputs-vue-wrapper'
Vue.use(Router)
export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: KendoCalendar
    }
  ]
})
