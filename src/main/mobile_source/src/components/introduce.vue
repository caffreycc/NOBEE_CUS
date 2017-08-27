<template>
	<div style="padding:10px;" v-html="ht"></div>
</template>
<script>
import Qs from 'qs'
export default {
  data () {
    return {
      ht: ''
    }
  },
  created () {
    var send = Qs.stringify({orgId: '402828c74973b20001497a7d5bc30028'})
    this.$http.post('/store/introduce', send, {headers: {'Content-Type': 'application/x-www-form-urlencoded'}}).then(response => {
      this.ht = response.data
    })
  }
}

</script>

<style scoped>
	
</style>
