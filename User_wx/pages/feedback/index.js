// pages/second_level/suggest/suggest.js
Page({
  data:{
    imageUrl: [],
    info:{}
  },
  onLoad:function(options){
    // 页面初始化 options为页面跳转所带来的参数
    const info = wx.getStorageSync('info');
    this.setData({
      info
    })
  },
  onReady:function(){
    // 页面渲染完成
  },
  onShow:function(){
    // 页面显示
  },
  onHide:function(){
    // 页面隐藏
  },
  onUnload:function(){
    // 页面关闭
  },
  bindFormSubmit: function(e) {
  },
  upLoadImage: function(){
    var that = this;
    wx.chooseImage({
      count: 9, 
      sizeType: ['original', 'compressed'], 
      sourceType: ['album', 'camera'],
      success: function (res) {
        // 返回选定照片的本地文件路径列表，tempFilePath可以作为img标签的src属性显示图片
        var uploadedImageLists = that.data.imageUrl;
        console.log(res.tempFilePaths);
        var totalImages = uploadedImageLists.concat(res.tempFilePaths);
        // for(var i = 0; i < res.tempFilePaths.length; i++) {
        //   uploadedImageLists.push(res.tempFilePaths[i]);
        // }
        var aNum = 0;
        if(totalImages.length >= 9) {
          totalImages.length = 9;
          aNum = 1;
        }
        //uploadedImageLists.concat(res.tempFilePaths);
        console.log(totalImages)
          that.setData({
            num: 0,
            addNum: aNum,
            imageUrl:totalImages
          })
      }
    })
  },
  removeImage: function(e){
    var that = this;
    var currentImageLists = that.data.imageUrl; 
    currentImageLists.splice(e.target.dataset.index,1);
    that.setData({
        imageUrl:currentImageLists
    })
    if(currentImageLists.length < 9 && currentImageLists.length >= 1) {
       that.setData({
            addNum: 0
       })
    } else if(currentImageLists.length == 0) {
       that.setData({
            addNum: 1,
            num: 1
       })
    }
  },
  preImage:function(e){
    var that = this;
    var currentImageUrl = that.data.imageUrl[e.target.dataset.index]
    wx.previewImage({
      current: currentImageUrl, // 当前显示图片的http链接
      urls: that.data.imageUrl // 需要预览的图片http链接列表
    })
  },
  formSubmit:function(e){
    if(e.detail.value.classify==''){
      wx.showToast({
        title: '请填写举报类型',
        image:'../../icons/error.png',
        mask: true,
      })
    }else if(e.detail.value.textarea==''){
      wx.showToast({
        title: '请填写举报内容',
        image:'../../icons/error.png',
        mask: true,
      })
    }else{
      wx.request({
        url:'http://localhost:8080/insertSuggest',
        method: "Post",
        header: {
          'content-type': 'application/x-www-form-urlencoded'
        },
        data:{
          suggesttype:e.detail.value.classify,
          suggestcontent:e.detail.value.textarea,
          userid:this.data.info.userid,
          list:this.data.imageUrl
        },
        success:function(res){
          wx.showToast({
            title: '反馈成功',
          })
        }
      })
    }
  }
})