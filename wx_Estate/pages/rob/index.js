Page({


  data: {
    id:0,
   robhousing:[],
   info:{},
  },
  onShow: function (e) {
      var info = wx.getStorageSync('info')||{};
      this.getrobhousing()
      this.setData({
        info
      })
  },
  getrobhousing: function(e){
    var that = this;
    wx.request({
      url: 'http://localhost:8080/getRobhousing',
      data:{
        index: this.data.robhousing
      },
      success: function(res) {
        console.log(res.data);
        wx.setStorageSync('rob',res.data);
        that.setData({
          robhousing: res.data,
        })
      },
    })
  },
  handleRob(){
    console.log(this.data.info.userid);
    var that = this;
    wx.request({
      url: 'http://localhost:8080/sendRob',
      data:{
        userid:this.data.info.userid,
        robid:this.data.robhousing[this.data.id].robid
      },
      success: function(res) {
        console.log(res);
      }
    })
  },
  bindleft(){
    var id = this.data.id;
    id = id - 1;
    var length = this.data.robhousing.length-1;
    if(id==-1){
      this.setData({
        id:length
      })
    }
    else{
      this.setData({
        id
      })
    }
    
  },
  bindright(){
    var id = this.data.id;
    id = id + 1;
    var length = this.data.robhousing.length ;
    if(id==length){
      this.setData({
        id:0
      })
    }
    else{
      this.setData({
        id
      })
    }
  }
})