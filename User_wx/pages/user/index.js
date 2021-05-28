// pages/user/index.js
Page({
  data: {
    userinfo:{},
  },
  onShow(){
    const userinfo=wx.getStorageSync("userInfo");
    console.log(userinfo);
    this.setData({
    userinfo,
  })
  
  },
  handleGetUserInfo(e){
    var that = this;
    wx.showModal({
      title: '温馨提示',
      content: '正在请求您的个人信息',
      success(res) {
        var this1 = that;
        if (res.confirm) {
          wx.getUserProfile({
          desc: "获取你的昵称、头像、地区及性别",
          success: res => {
            console.log(res)
            wx.setStorageSync('userInfo',res.userInfo);
            this1.onShow();
          },
          fail: res => {
          }
        })} else if (res.cancel) {
        }
      }
    })
  }
})