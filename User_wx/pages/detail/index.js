Page({


  data: {
    estateid:'',
    estate:{},
    building:[]
  },
  onLoad: function (e) {
    console.log(e),
    this.setData({
      estateid:e.estateid
    })
    this.getestate(),
    this.getbuilding()
  },
  getbuilding: function(e){
    var that = this;
    // console.log(this.data)
    wx.request({
      url: 'http://localhost:8080/getBuilding',
      data:{
        estateid:this.data.estateid
      },
      success: function(res) {
        that.setData({
          building : res.data,

        })

      },
    })
  },
  getestate: function(e){
    var that = this;
    // console.log(this.data)
    wx.request({
      // url: 'http://localhost:8080/getEstateById',
      url: 'http://localhost:8080/getEstateById',
      data:{
        estateid:this.data.estateid
      },
      success: function(res) {
        that.setData({
          estate : res.data,
          
        })
      },
    })
  }
 
  

})