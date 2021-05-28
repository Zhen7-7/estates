<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">

      </div>
      <div class="col-xs-6 flex-end-center">
        <button-box type="add" to="/rob/edit" title="添加"></button-box>
        <button-box type="edit" @click="editItem"></button-box>
        <!-- <button-box class="btn-danger" @click="postToBaidu"><i class="fa fa-location-arrow"></i> 提交百度收录</button-box>
        <dropdown-menu class="btn-dropdown" ref="dropdownMenu">
          <template slot="toggle">
            <button-box class="btn-info">更改状态 <i class="fa fa-sort-amount-asc"></i></button-box>
          </template>
          <template slot="menu">
            <a href="javascript:" @click="show">前台显示</a>
            <a href="javascript:" @click="hide">前台隐藏</a>
            <a href="javascript:" @click="recommend">推荐</a>
            <a href="javascript:" @click="cancleRecommend">取消推荐</a>
            <a href="javascript:" @click="top">置顶</a>
            <a href="javascript:" @click="cancleTop">取消置顶</a>
          </template>
        </dropdown-menu> -->
        <button-box type="delete" @click="deleteItem"></button-box>
      </div>
    </div>

    <table-box ref="tableBox" :info="estate" :length="length" :url="table.url" :columns="table.columns" :key-name="table.keyName" :parse-data="table.parseData" :data="table.data" :multi-select="table.multiSelect">

        <tr slot="row"  slot-scope="props">
          <td class="tc" style="line-height:150px">{{props.item.estateid}}</td>
          <td class="tc" style="line-height:150px">{{props.item.estatename}}</td>
          <td class="tc "style="line-height:150px">{{props.item.estateaddress}}</td>
          <td class="tc"><img :src="props.item.estateimg" width="150" height="150"/></td>
          <!-- <td class="status">
            <span v-if="props.item.status==0" class="btn btn-default btn-sm">前台隐藏</span>
            <span v-if="props.item.recommend_ok==1" class="btn btn-primary btn-sm">已推荐</span>
            <span v-if="props.item.top_ok==1" class="btn btn-danger btn-sm">置顶</span>
          </td> -->
          <td class="tc" style="line-height:150px">{{props.item.city}}</td>
          <td class="tc" style="line-height:150px">{{props.item.estatelastnum}}</td>
          <!-- <td class="tc"><span v-if="props.item.post_baidu==1" >已提交</span><span v-else>未提交</span></td> -->
          <td class="tc" style="line-height:150px"><a href="/src/pages/rob/edit" class="btn btn-info btn-sm" target="_blank">预览</a></td>
        </tr>
``

    </table-box>

  </div>
</template>

<script>

  import config from '../../utils/config/config'

  import TableBox from '../../components/mod/TableBox'
  import ButtonBox from  '../../components/mod/ButtonBox'
  import DropdownMenu from '../../components/mod/DropdownMenu'

  export default {
    name: 'RolesIndex',
    components: {TableBox,ButtonBox,DropdownMenu},

    data:function () {
      return {
        estate:[],
        length:0,
        table:{
          url:this.$api.news_index,
          keyName:'id',
          columns:[
            {
              title:"EstateName",
              field:"title",
              width:'80'
            },
            {
              title:"Address",
              field:"content",
              width:'180'
            },
            {
              title:"IMAGE",
              field:"articleimg",
              width:'100'
            },
            {
              title:"City",
              field:"status",
              width:'60'
            },
            {
              title:"Remain",
              field:"createtime",
              width:'60'
            },
            {
              title:"EDIT",
              field:"preview",
              width:'60'
            },
          ],
          parseData:function (data) {
            data.forEach(function(row){

            })
          }
        },
        pc_domain:config.pc_domain
      }
    },
    mounted:function () {
      let breadcrumb=[
        {
          link: '#',
          title:'内容管理'
        },
        {
          link:'',
          title:'文章管理'
        },
        

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb)
      this.getarticle();
    },
    methods:{
      getarticle:function(){
        var that = this;
            // let user = {
            //     adminname:'admin',
            //     adminpassword:123456
            // };
            // let data = this.$qs.stringify(user);
            this.$axios.post('/estate/getAllEstate')
            .then(function (response) {
                console.log(response.data.result);
                const res = response.data.result;
                const data = res;
                that.estate = data;
                that.length = res.length;
            })
            .catch(function (error) {
                console.log(error);
            });
        // const article = [
        //   {
        //     articleid:1,
        //     articletitle:'篮球',
        //     articletype:'沙雕',
        //     articlecontent:'东北农业大学',
        //     articletime:'2021-5-5',
        //     articlestatus:'已检查',
        //     userid:1,
        //     articleimg:'https://pic4.ajkimg.com/display/xinfang/d654c93578d807ace4913c2a13fcddf1/860x10000.jpg'
        //   },
        //    {
        //     articleid:1,
        //     articletitle:'篮球',
        //     articletype:'沙雕',
        //     articlecontent:'东北农业大学',        
        //     articletime:'2021-5-5',
        //     articlestatus:'已检查',
        //     userid:2,
        //     articleimg:'https://pic4.ajkimg.com/display/xinfang/d654c93578d807ace4913c2a13fcddf1/860x10000.jpg'
        //   },
        //   {
        //     articleid:1,
        //     articletitle:'篮球',
        //     articletype:'沙雕',
        //     articlecontent:'东北农业大学',
        //     articletime:'2021-5-5',
        //     articlestatus:'已检查',
        //     userid:3,
        //     articleimg:'https://pic4.ajkimg.com/display/xinfang/d654c93578d807ace4913c2a13fcddf1/860x10000.jpg'
        //   },  
        //   {
        //     articleid:1,
        //     articletitle:'篮球',
        //     articletype:'沙雕',
        //     articlecontent:'东北农业大学',
        //     articletime:'2021-5-5',
        //     articlestatus:'已检查',
        //     userid:1,
        //     articleimg:'https://pic4.ajkimg.com/display/xinfang/d654c93578d807ace4913c2a13fcddf1/860x10000.jpg'
        //   }
        // ]
        // this.article = article;
      },

      deleteItem:function () {

        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        this.$confirm({
          content:"删除操作不能恢复，您确定要删除吗",

          success: ()=> {
            let post_data={
              id: id,
              status:9,
              operation:'delete'
            }
            this.$network.post(this.$api.news_save,post_data).then((res)=>{
              table.refresh()
            })
          },
        })


      },
      editItem:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据',
          })
          return
        }
        this.$router.push({path:'/rob/edit',query:{
          id:id
        }})

      },
      postToBaidu:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          post_baidu:1,
          operation:'post_baidu'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
      },
      show:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          status:1,
          operation:'online'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      },
      hide:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          status:0,
          operation:'offline'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      },
      recommend:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          recommend_ok:1,
          operation:'recommend'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      },
      cancleRecommend:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          recommend_ok:0,
          operation:'c_recommend'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      },
      top:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          top_ok:1,
          operation:'top'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      },
      cancleTop:function () {
        let table=this.$refs.tableBox
        let id=table.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据'
          })
          return
        }

        let post_data={
          id: id,
          top_ok:0,
          operation:'c_top'
        }
        this.$network.post(this.$api.news_save,post_data).then((res)=>{
          table.refresh()
        })
        this.$refs.dropdownMenu.hide()
      }

    },
    beforeRouteEnter:function (to,from,next) {
      //从编辑页面返回到列表，应该刷新一下当前页面
      if(from.path=='/news/edit'){
        next(vm=>{
          vm.$refs.tableBox.refresh()
        })
      }
      next()
    }
  }
</script>

<style lang="less">
  .btn-dropdown{
    .dropdown-toggle{
      padding: 0 !important;
      &:hover{
        background-color: white !important;
      }
      .open&{
        background-color: white !important;
      }
    }
  }

  .status{
    .btn{
      padding: 3px 5px !important;
      margin-top: 5px;
      margin-bottom: 5px;
    }
  }
  // #content{
  //   // -webkit-animation-direction: ;
  //    display: -webkit-box;
  //    overflow: hidden;
  //   -webkit-box-orient: vertical;
  //   -webkit-line-clamp: 3;
  //   line-height:26px;
  //   text-indent:20px;
  //   padding:0;
  // }


</style>
