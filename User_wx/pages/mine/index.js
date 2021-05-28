// pages/pay/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {

      userinfo:{},
      birth:'',
      phoneafter:'',
      identityafter:'',
      birth:''
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    
    
    
   
  },
  change:function(e){
    var phone = this.data.userinfo.phone;
    var a = phone.slice(0,3);
    var b = phone.slice(7);
    var phoneafter = a + '****' + b;
    console.log(phoneafter);
    var identity = this.data.userinfo.identity;
    var c = identity.slice(0,3);
    var d = identity.slice(14);
    var identityafter = c + '***********' + d;
    console.log(identityafter);
    var birth = identity.slice(6,14);
    this.setData({
      phoneafter:phoneafter,
      identityafter:identityafter,
      birth:birth
    })
    console.log(birth)
  },
  
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    var that = this;
    wx.getStorage({
      key:'info',
      success(res){
        console.log(res.data);
        that.setData({
          userinfo:res.data
        })
        if(res.data.username){
          that.change();
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})