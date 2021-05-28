Page({


  data: {
   estate:[
      {
        estateid:'1',
        estateimg:'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fs10.sinaimg.cn%2Fmw690%2F002BU6nazy6NmJcN2kh89%26690&refer=http%3A%2F%2Fs10.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621836407&t=be8f25e66fe7a6e449826dd3bed792a8',
        estateaddress:'请您先完善信息',
        estatename:'请您先完善信息',
        estatelastnum:'0',
        price: 0
      },
      {
        estateid:'2',
        estateimg:'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fs10.sinaimg.cn%2Fmw690%2F002BU6nazy6NmJcN2kh89%26690&refer=http%3A%2F%2Fs10.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621836407&t=be8f25e66fe7a6e449826dd3bed792a8',
        estateaddress:'请您先完善信息',
        estatename:'请您先完善信息',
        estatelastnum:'1',
        price: 0
      },
      {
        estateid:'3',
        estateimg:'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fs10.sinaimg.cn%2Fmw690%2F002BU6nazy6NmJcN2kh89%26690&refer=http%3A%2F%2Fs10.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1621836407&t=be8f25e66fe7a6e449826dd3bed792a8',
        estateaddress:'请您先完善信息',
        estatename:'请您先完善信息',
        estatelastnum:'0',
        price: 0
      }
    ]
  },
  onShow: function (e) {
    this.getestate();
  },
  getestate: function(e){
    const user = wx.getStorageSync('user');
    var data = '黑龙江省哈尔滨市';
    // console.log(user);
    if(user.address!=undefined){
      data = user.address;
    }
    console.log(data);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/getAllEstate',
      data:{
        city: data
      },
      success: function(res) {
        console.log(res);
        that.setData({
          estate : res.data,
        })
      },
    })
  },
  

})