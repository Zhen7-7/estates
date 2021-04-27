// pages/rob/index.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    buildingid:'',
    housing:[],
    housingimg:[]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
      this.setData({
        buildingid:options.buildingid
      })
      this.getbuilding();
  },
  handleCartAdd:function(){
    let cart=wx.getStorageSync("cart")||[];
    console.log(cart);
    console.log(this.data.housing);
    let index=cart.findIndex(v=>v.housingid===this.data.housing.housingid);
    console.log(index);
    if(index==-1){
      cart.push(this.data.housing);
      wx.showToast({
        title: '已加入心愿单',
        icon: 'error',
        image: '',
        duration: 1500,
        // true 防止用户手抖
        mask: true,
      });
    }else{
      wx.showToast({
        title: '请不要重复加入',
        icon: 'error',
        image: '',
        duration: 1500,
        // true 防止用户手抖
        mask: true,
      });
      return
    }
    wx.setStorageSync("cart", cart);
   
   
  },
  
  getbuilding: function(){
    var that = this;
     wx.request({
      url:'http://localhost:8080/getHousing',
      method: "Post",
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        'buildingid': this.data.buildingid
      },
      success: function (res) {
        console.log(res);
        that.setData({
          housing: res.data,
          housingimg:res.data.housingimg,
          success: true
        });
        
      },
    })
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
