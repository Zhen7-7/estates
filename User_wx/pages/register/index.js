// pages/user/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    userinfo:{},
    address:'',
    success: false,
    state: '',
    info:{},


    provinceArray: ["黑龙江省","北京市", "天津市", "上海市", "重庆市", "河北省", "山西省", "辽宁省", "吉林省", "江苏省", "浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "海南省", "四川省", "贵州省", "云南省", "陕西省", "甘肃省", "内蒙古自治区", "广西壮族自治区", "西藏自治区", "宁夏回族自治区"],
    provinceIndex: 0,
    cityObject:{
      '黑龙江省': ['哈尔滨市', '齐齐哈尔市', '鸡西市', '鹤岗市', '双鸭山市', '大庆市', '伊春市', '佳木斯市', '七台河市', '牡丹江市', '黑河市', '绥化市', '大兴安岭地区'],
      '北京市': ['市辖区'],
      '天津市': ['市辖区'],
      '河北省': ['石家庄市', '唐山市', '秦皇岛市', '邯郸市', '邢台市', '保定市', '张家口市', '承德市', '沧州市', '廊坊市', '衡水市', '省直辖县级行政区划'],
      '山西省': ['太原市', '大同市', '阳泉市', '长治市', '晋城市', '朔州市', '晋中市', '运城市', '忻州市', '临汾市', '吕梁市'],
      '内蒙古自治区': ['呼和浩特市', '包头市', '乌海市', '赤峰市', '通辽市', '鄂尔多斯市', '呼伦贝尔市', '巴彦淖尔市', '乌兰察布市', '兴安盟', '锡林郭勒盟', '阿拉善盟'],
      '辽宁省': ['沈阳市', '大连市', '鞍山市', '抚顺市', '本溪市', '丹东市', '锦州市', '营口市', '阜新市', '辽阳市', '盘锦市', '铁岭市', '朝阳市', '葫芦岛市'],
      '吉林省': ['长春市', '吉林市', '四平市', '辽源市', '通化市', '白山市', '松原市', '白城市', '延边朝鲜族自治州'],
      '上海市': ['市辖区'],
      '江苏省': ['南京市', '无锡市', '徐州市', '常州市', '苏州市', '南通市', '连云港市', '淮安市', '盐城市', '扬州市', '镇江市', '泰州市', '宿迁市'],
      '浙江省': ['杭州市', '宁波市', '温州市', '嘉兴市', '湖州市', '绍兴市', '金华市', '衢州市', '舟山市', '台州市', '丽水市'],
      '安徽省': ['合肥市', '芜湖市', '蚌埠市', '淮南市', '马鞍山市', '淮北市', '铜陵市', '安庆市', '黄山市', '滁州市', '阜阳市', '宿州市', '六安市', '亳州市', '池州市', '宣城市'],
      '福建省': ['福州市', '厦门市', '莆田市', '三明市', '泉州市', '漳州市', '南平市', '龙岩市', '宁德市'],
      '江西省': ['南昌市', '景德镇市', '萍乡市', '九江市', '新余市', '鹰潭市', '赣州市', '吉安市', '宜春市', '抚州市', '上饶市'],
      '山东省': ['济南市', '青岛市', '淄博市', '枣庄市', '东营市', '烟台市', '潍坊市', '济宁市', '泰安市', '威海市', '日照市', '莱芜市', '临沂市', '德州市', '聊城市', '滨州市', '菏泽市'],
      '河南省': ['郑州市', '开封市', '洛阳市', '平顶山市', '安阳市', '鹤壁市', '新乡市', '焦作市', '濮阳市', '许昌市', '漯河市', '三门峡市', '南阳市', '商丘市', '信阳市', '周口市', '驻马店市', '省直辖县级行政区划'],
      '湖北省': ['武汉市', '黄石市', '十堰市', '宜昌市', '襄阳市', '鄂州市', '荆门市', '孝感市', '荆州市', '黄冈市', '咸宁市', '随州市', '恩施土家族苗族自治州', '省直辖县级行政区划'],
      '湖南省': ['长沙市', '株洲市', '湘潭市', '衡阳市', '邵阳市', '岳阳市', '常德市', '张家界市', '益阳市', '郴州市', '永州市', '怀化市', '娄底市', '湘西土家族苗族自治州'],
      '广东省': ['广州市', '韶关市', '深圳市', '珠海市', '汕头市', '佛山市', '江门市', '湛江市', '茂名市', '肇庆市', '惠州市', '梅州市', '汕尾市', '河源市', '阳江市', '清远市', '东莞市', '中山市', '潮州市', '揭阳市', '云浮市'],
      '广西壮族自治区': ['南宁市', '柳州市', '桂林市', '梧州市', '北海市', '防城港市', '钦州市', '贵港市', '玉林市', '百色市', '贺州市', '河池市', '来宾市', '崇左市'],
      '海南省': ['海口市', '三亚市', '三沙市', '儋州市', '省直辖县级行政区划'],
      '重庆市': ['市辖区', '县'],
      '四川省': ['成都市', '自贡市', '攀枝花市', '泸州市', '德阳市', '绵阳市', '广元市', '遂宁市', '内江市', '乐山市', '南充市', '眉山市', '宜宾市', '广安市', '达州市', '雅安市', '巴中市', '资阳市', '阿坝藏族羌族自治州', '甘孜藏族自治州', '凉山彝族自治州'],
      '贵州省': ['贵阳市', '六盘水市', '遵义市', '安顺市', '毕节市', '铜仁市', '黔西南布依族苗族自治州', '黔东南苗族侗族自治州', '黔南布依族苗族自治州'],
      '云南省': ['昆明市', '曲靖市', '玉溪市', '保山市', '昭通市', '丽江市', '普洱市', '临沧市', '楚雄彝族自治州', '红河哈尼族彝族自治州', '文山壮族苗族自治州', '西双版纳傣族自治州', '大理白族自治州', '德宏傣族景颇族自治州', '怒江傈僳族自治州', '迪庆藏族自治州'],
      '西藏自治区': ['拉萨市', '日喀则市', '昌都市', '林芝市', '山南市', '那曲地区', '阿里地区'],
      '陕西省': ['西安市', '铜川市', '宝鸡市', '咸阳市', '渭南市', '延安市', '汉中市', '榆林市', '安康市', '商洛市'],
      '甘肃省': ['兰州市', '嘉峪关市', '金昌市', '白银市', '天水市', '武威市', '张掖市', '平凉市', '酒泉市', '庆阳市', '定西市', '陇南市', '临夏回族自治州', '甘南藏族自治州'],
      '青海省': ['西宁市', '海东市', '海北藏族自治州', '黄南藏族自治州', '海南藏族自治州', '果洛藏族自治州', '玉树藏族自治州', '海西蒙古族藏族自治州'],
      '宁夏回族自治区': ['银川市', '石嘴山市', '吴忠市', '固原市', '中卫市'],
      '新疆维吾尔自治区': ['乌鲁木齐市', '克拉玛依市', '吐鲁番市', '哈密市', '昌吉回族自治州', '博尔塔拉蒙古自治州', '巴音郭楞蒙古自治州', '阿克苏地区', '克孜勒苏柯尔克孜自治州', '喀什地区', '和田地区', '伊犁哈萨克自治州', '塔城地区', '阿勒泰地区', '自治区直辖县级行政区划'],
      '台湾省': ['台湾'],
      '香港特别行政区': ['香港'],
      '澳门特别行政区': ['澳门']
    },
    city:['哈尔滨市', '齐齐哈尔市', '鸡西市', '鹤岗市', '双鸭山市', '大庆市', '伊春市', '佳木斯市', '七台河市', '牡丹江市', '黑河市', '绥化市', '大兴安岭地区'],
    cityIndex: 0,
    // roomArray: [],
    // roomIndex: 0
  },
  changeProvince: function(e) {
    const value = e.detail.value;
    const province = this.data.provinceArray[value];
    const city = this.data.cityObject[province];
    console.log(city);
      this.setData({
        provinceIndex: value,
        city: city
      }) 
  },
  changeCity: function(e) {
      this.setData({
        cityIndex: e.detail.value
      }) 
  },
  handleAddress:function(a,b){
    const province = a;
    const city = b;
    var address = '';
    address = province + city;
    this.setData({
      address
    })
  },
  return_home:function(e){
    wx.switchTab({
      url: '/pages/user/index',
    })
  },
  formSubmit:function(e){
    var address = this.handleAddress(e.detail.value.province,e.detail.value.city);
    this.doGetCode(e);
  },
  onLoad:function(){
   const userinfo = wx.getStorageSync('userInfo');
   this.setData({
     userinfo
   })
  },
  doGetCode(e) {
   console.log(e.detail.value) 
    var that = this;
    if (e.detail.value.username == '') {
      wx.showToast({
        title: '请输入账号',
        icon: 'error',
        duration: 2000
      })
      return
    } 
    else if (e.detail.value.phone == '') {
      wx.showToast({
        title: '请输入手机号',
        icon: 'error',
        duration: 2000
      })
      return 
    }else if (e.detail.value.realname == '') {
      wx.showToast({
        title: '请输入真实姓名',
        icon: 'error',
        duration: 2000
      })
      return 
    }else if (e.detail.value.identity == '') {
      wx.showToast({
        title: '请输入身份证号',
        icon: 'error',
        duration: 2000
      })
      return 
    } else if (e.detail.value.password == '') {
      wx.showToast({
        title: '请输入密码',
        icon: 'error',
        duration: 2000
      })
      return 
    }
    // else if (!/\w{4,15}/.test(e.detail.value.username)) {
    //   wx.showToast({
    //     title: '账号不符合规则',
    //     icon: 'error',
    //     duration: 2000
    //   })
    //   return
    // }
    // else if (!/\d{11}/.test(this.data.phone)) {
      else if (!/^1[3|4|5|8][0-9]\d{8}$/.test(e.detail.value.phone)) {
      wx.showToast({
        title: '手机号格式错误',
        icon: 'error',
        duration: 2000
      })
      return
    } else if (!/^[\u4E00-\u9FA5]{2,10}/.test(e.detail.value.realname)){
      wx.showToast({
        title: '真实姓名格式错误',
        icon: 'error',
        duration: 2000
      })
      return
    }else if (!/^\d{17}(\d|x)$/.test(e.detail.value.identity)) {
      wx.showToast({
        title: '身份证格式错误',
        icon: 'error',
        duration: 2000
      })
      return
    } else if (!/\w{6,15}/.test(e.detail.value.password)) {
      wx.showToast({
        title: '密码格式错误',
        icon: 'error',
        duration: 2000
      })
      return
    } 
    else{
      var that = this;
    wx.request({
      url: 'http://localhost:8080/register', //后端判断是否已被注册， 已被注册返回1 ，未被注册返回0
      method: "Post",
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        'username':e.detail.value.username,
        'phone':e.detail.value.phone,
        'realname':e.detail.value.realname,
        'identity':e.detail.value.identity,
        'city':this.data.address,
        'gender':e.detail.value.gender,
        'headimg':this.data.userinfo.avatarUrl,
      },
      success: function (res) {
        console.log(res.data);
        wx.setStorageSync('info', res.data);
        wx.showToast({
          title: '完善成功',
          icon: 'success',
          duration: 2000
        });
        that.setData({
          success:'ture'
        })
      },
    })
   }
  },
  
})