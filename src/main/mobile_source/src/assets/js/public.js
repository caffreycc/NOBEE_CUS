// 传入一个值value，返回在字典dicArr中的name
function getDicName (value, dicArr) {
  if (dicArr) {
    console.log('arr:' + dicArr)
    for (var i = 0; i < dicArr.length; i++) {
      if (dicArr[i].value === value) {
        console.log('返回name' + dicArr[i].name)
        return dicArr[i].name
      }
    }
  }
},

// 检测字段是否为空
function isNull (str) {
  if (str === '' || str === null || str === undefined) {
    return true
  }
  var regu = '^[ ]+$'
  var re = new RegExp(regu)
  return re.test(str)
}