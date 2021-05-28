Page({

  /**
   * 页面的初始数据
   */
  data: {
    data:{
      cart:[],
      userinfo:'',
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

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
    let cart=wx.getStorageSync("cart")||[];
    console.log(cart);
    this.setData({
      cart:cart
    });
    wx.getStorage({
      key:'info',
      success(res){
        console.log(res.data);
        that.setData({
          userinfo:res.data
        })
      }
    })
  },
  delete(e){
    const housingid = e.currentTarget.dataset.housingid;
    let {cart}= this.data;
    const index = cart.findIndex(v=>v.housingid===housingid);
    wx.showModal({
      title:'提示',
      content: '确定要移除该心愿么？',
      showCancel: true,
      success: (res) => {
          console.log(res);
          if(res.confirm==true){
            cart.splice(index,1);
            wx.setStorageSync('cart', cart);
            wx.switchTab({
              url: '/pages/index/index',
            })
          }
        },
      
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
//   1 假设用户点击获取收货地址的提示框确定 authSetting scope.address true
//     scope 值ture
//   2 假设用户点击获取收货地址的提示框取消
//     scope 值false
// 3 页面加载完毕
//  0 onLoad onShow
//  1 获取本地存储中的地址数据
//  2 把数据 设置给data中的一个变量
// 4 onShow
//   1 获取缓存中的购物车数组
//   2 把购物车数据 填充到data中
// 5 全选的实现 数据的展示
//   1 onShow获取到缓存中的购物车数组
//   2 根据购物车中的商品数据 所有商品都被选中 checked=true  全选被选中
// 6 总价格和总数量
//   1 都需要商品被选中 checked=true
//   2 获取到购物车数组
//   3 遍历
//   4 判断商品是否被选中
//   5 总价格+=商品的单价*商品的数量
//   6 总数量+=商品的数量
//   7 把计算后的价格和数量设置回data中即可
// 7 商品的选中功能
//   1 绑定change事件
//   2 获取到被修改的商品对象
//   3 商品对象的选中状态 取反
//   4 重新填充回data中和缓存中
//   5 重新计算 全选 总价格 总数量
// 8 全选和反选功能
//  1 全选复选框绑定事件change
//  2 获取data中的全选变量allChecked
//  3 直接取反
//  4 遍历购物车数组 让里面的购物车商品选中状态跟随着allChecked改变
//  5 把购物车数组和选中状态重新设置会data中 把购物车重新设置回缓存中
// 9 商品数量的编辑功能
//  1 + - 绑定同一个点击事件
//   1 +  +1
//   2 -  -1
//  2 传递被点击的商品goods_id
//  3 获取data中的购物车数组 来换取需要被修改的商品对象
//   当购物车的数量=1 同时用户点击 -
//     弹窗提示  询问用户是否要删除
//     1 确定 直接执行删除
//     2 取消  就什么都不做
//  4 直接修改商品对象的数量属性 num
//  5 把cart数组重新设置回缓存中和data中
// 10 点击结算
//  1 判断有没有收货地址信息
//  2 判断用户有没有选购商品
//  3 经过验证  跳转到支付界面

// */

// import {chooseAddress,showModal,showToast} from "../../utils/asyncWx.js";
// import regeneratorRuntime from "../../lib/runtime/runtime";
// Page({


//   data: {
//     address:{},
//     cart:[],
//     allChecked:false,
//     totalPrice:0,
//     totalNum:0
//   },
//   onShow(){
//     // 1 获取缓存中的收货地址
//     const cart=wx.getStorageSync("cart")||[];
//     let address=wx.getStorageSync("address")||{};
//     if(address.provinceName!=undefined){
//       address.all=address.provinceName+address.cityName+address.countyName+address.detailInfo;
//     }
//     this.setData({
//       address
//     });
//     this.setCart(cart);
//   },
//   handleChooseAddress(){
//     wx.chooseAddress({
//       success: (result) => {
//           wx.setStorageSync('address', result);
//       },
//     });
//   },
//   handleItemChange(e){
//     // 1 获取被修改的商品的id
//     const goods_id=e.currentTarget.dataset.id;
    
//     // 2 获取购物车数组
//     let {cart}=this.data;
//     // 3 找到被修改的商品对象
//     let index=cart.findIndex(v=>v.goods_id===goods_id);
//     // 4 选中状态取反
//     cart[index].checked=!cart[index].checked;
//     this.setCart(cart);
//     // 重新计算
    
//   },
//   // 设置购物车状态 重新计算底部工具栏数据
//   setCart(cart){
//      // 计算全选
//     // every 数组方法 会遍历 会接收一个回调函数 那么没一个回调函数都返回true 那么every方法的返回值为true
//     // 只要有一个回调函数返回了false  那么不在循环  返回false
//     // 空数组调用了every 返回值为true
//     // const allChecked=cart.length?cart.every(v=>v.checked):false;
   
//     let allChecked=true;
//     //总价格和总数量
//     let totalPrice=0;
//     let totalNum=0;
//     cart.forEach(v=>{
//       if(v.checked){
//         totalPrice+=v.num*v.goods_price;
//         totalNum+=v.num;
//       }else{
//         allChecked=false;
//       }
//     })
//     //判断一下数组是否为空
//     allChecked=cart.length!=0?allChecked:false;
//     // 5 6 把购物车数据重新设置回data中和缓存中
//     this.setData({
//       cart,
//       totalNum,
//       totalPrice,
//       allChecked
//     });
//     wx.setStorageSync("cart",cart);
//   },
//   //商品的全选功能
//   handleItemAllcheck(){
//   //1 获取data中的数据
//   let {cart,allChecked}=this.data;
//   //2 修改值
//   allChecked=!allChecked;
//   //3 循环修改cart中的商品选中状态
//   cart.forEach(v=>v.checked=allChecked);
//   //4 把修改后的值填充回data中或者缓存中
//   this.setCart(cart);
//   },

//   //商品数量的编辑功能
//   async handelItemNumEdit(e){
//     //1 获取传递过来的参数
//     const {operation,id}=e.currentTarget.dataset;
//     //2 获取购物车数组
//     let {cart}=this.data;
//     //3 找到需要修改的商品的索引
//     const index=cart.findIndex(v=>v.goods_id===id);
//     //4 判断是否要执行删除
//     if(cart[index].num===1&&operation===-1){
//       //4.1弹窗提示
//       const res=await showModal({content:'您是否要删除该商品'});
//       if(res.confirm){
//         cart.splice(index,1);
//         this.setCart(cart);
//       }
//     }else{
//       //4 进行修改数量
//     cart[index].num+=operation;
    
//     //5 设置回缓存的data中
//     this.setCart(cart);
//     }
    
//   },
//   //点击结算
//   async handlePay(){
//     //1 判断收货地址
//     const {address,totalNum}=this.data;
//     if(!address.userName){
//       await showToast({title:"您还没有选择收货地址"});
//       return;
//     }
//     //2 判断用户有没有选购商品
//     if(totalNum===0){
//       await showToast({title:"您还没有选购商品"});
//       return;
//     }
//     //3 跳转到支付界面
//     wx.navigateTo({
//       url: '/pages/pay/index'
//     });
//   }

// })