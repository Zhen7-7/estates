
Page({

  /**
   * 页面的初始数据
   */
  data: {
    username: '',
    password: '',
    state: '',
    success:false,
    userinfo:{}
  },
  return_home: function (e) {
 
    wx.switchTab({
      url: '/pages/index/index',
    })
  },
 
  handleInputusername:function(e){
    this.setData({
      username : e.detail.value
    })
  },
  handleInputpassword: function (e) {
    this.setData({
      password: e.detail.value
    })
  },
  
  formSubmit:function(e){
    console.log(e.detail.value);
    this.getLogin();
  },
  getLogin() {
    wx.showLoading({
      title: '加载中',
      duration: 1000,
      mask: true
    });
    var that = this;
    if (this.data.username == '') {
      wx.showToast({
        title: '请输入账号',
        icon:'error',
        duration: 2000
      })
      return
    }  else if (this.data.password == '') {
      wx.showToast({
        title: '请输入密码',
        icon:'error',
        duration: 2000
      })
      return
    }
    // else if (!/\w{4,15}/.test(this.data.username)) {
    //   wx.showToast({
    //     title: '账号不符合规则',
    //     icon: 'error',
    //     duration: 2000
    //   })
    //   return
    // }else if (!/\w{6,15}/.test(this.data.password)) {
    //   wx.showToast({
    //     title: '密码不符合规则',
    //     icon: 'error',
    //     duration: 2000
    //   })
    //   return
    // }
    else{
      wx.request({
        url: 'http://localhost:8080/loginuser', 
        method: "Post",
        header: {
          'content-type': 'application/x-www-form-urlencoded'
        },
        data:{
          'username':this.data.username,
          'password':this.data.password,
        },
        success: function (res) {
          if(res.data==true){
          that.setData({
            success: res.data,
          });
          that.getUserInfo()
          }else{
            that.setData({
              success: false,
            });
          }
          if(that.data.success==false){
            wx.showToast({
                  title: '账号或密码错误',
                  icon: 'error',
                  duration: 2000
                })
                return
          }
        }
        
      })
    }
   
  },
  getUserInfo(){
    var that = this;
    wx.request({
      url: "http://localhost:8080/getUser", 
      method: "Post",
      header: {
        'content-type': 'application/x-www-form-urlencoded'
      },
      data:{
        'username': this.data.username,
      },
      success: function (res) {
        wx.showToast({
          title: '登陆成功',
          icon: 'success',
          duration: 2000
        })
        console.log(res);
        wx.setStorage({
          key:'userinfo',
          data:res.data
        })
        that.setData({
          userinfo:res.data
        })
      },
      
    })
  },
 
  
})









