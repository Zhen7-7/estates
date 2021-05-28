<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">

      </div>
      <div class="col-xs-6 flex-end-center">
        <!-- <button-box type="add" to="../course/damo/index" title="添加"></button-box> -->
        <!-- <button-box type="add" @click="addItem" title="添加"></button-box> -->
        <button-box type="edit" @click="editItem" title="编辑"></button-box>
        <button-box type="delete" @click="deleteItem"></button-box>
      </div>
    </div>

    <table-box ref="tableBox" :info="estate" :length="length" :url="table.url" :columns="table.columns" :key-name="table.keyName" :parse-data="table.parseData" :data="table.data" :multi-select="table.multiSelect">

        <tr slot="row"  slot-scope="props" @click="getId(props.item.estateid,props.item.userid)">
          <td class="tc" style="line-height:150px">{{props.item.estateid}}</td>
          <td class="tc" style="line-height:150px">{{props.item.estatename}}</td>
          <td class="tc"><img :src="props.item.estateimg" width="150" height="150"/></td>
          <td class="tc" style="line-height:150px">{{props.item.estateaddress}}</td>
          <td class="tc" style="line-height:150px">{{props.item.city}}</td>
          <td class="tc" style="line-height:150px">共{{props.item.estatelastnum}}户</td>
          <!-- <td class="tc"><span v-if="props.item.post_baidu==1" >已提交</span><span v-else>未提交</span></td> -->
          <!-- <td class="tc" style="line-height:150px"><a href="/src/pages/news/edit" class="btn btn-info btn-sm" target="_blank">预览</a></td> -->
        </tr>
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
        estateid:'',
        userid:'',
        estate:[],
        building:[],
        housing:[],
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
              title:"Image",
              field:"articleimg",
              width:'100'
            },
            {
              title:"Address",
              field:"content",
              width:'180'
            },
            {
              title:"City",
              field:"status",
              width:'60'
            },
            {
              title:"Remain",
              field:"remain",
              width:'60'
            },
          ],
        },
        pc_domain:config.pc_domain
      }
    },
    mounted:function () {
      let breadcrumb=[
        {
          link: '#',
          title:'房产管理'
        },
        {
          link:'',
          title:'文章管理'
        },
        

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb)
      this.getData();
    },
    methods:{
      getData:function(){
        var that = this;
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
            // this.$axios.post('/building/getBuildingByEstateid')
            // .then(function (response) {
            //     console.log(response.data.result);
            //     const res = response.data.result;
            //     const data = res;
            //     that.building = data;
            //     that.length = res.length;
            // })
            // .catch(function (error) {
            //     console.log(error);
            // });
            // this.$axios.post('/housing//getHousingBybuildingid')
            // .then(function (response) {
            //     console.log(response.data.result);
            //     const res = response.data.result;
            //     const data = res;
            //     that.estate = data;
            //     that.length = res.length;
            // })
            // .catch(function (error) {
            //     console.log(error);
            // });
      },
      getId:function(a,b){
        this.estateid = a;
        this.userid = b;
      },
      deleteItem:function () {
         if(this.estateid){
          this.$confirm({
          content:"删除操作不能恢复，您确定要删除吗",
          success: ()=> {
            var that = this;
            let user = {
              estateid:this.estateid
            }
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/user/deleteUserInfo',data)
            .then(function (response) {
                // console.log(response.data.result);
                // const res = response.data.result;
                // that.info = res;
                // that.length = res.length;
            })
            .catch(function (error) {
                console.log(error);
            });

          },
        })
        }
        else{
          alert('请选择删除的举报信息')
        } 
      },
      editItem:function () {
          if(this.estateid){
           this.$router.push({  
            path: '/news/edit',   
            name: 'news-edit',  
            query:{
              userid : this.userid,
              estateid : this.estateid,
            }
        })  
        }
        else{
          alert('请选择需要编辑的信息')
        }
      },
      addItem:function () {
         this.$router.push({  
            path: '/news/edit',   
            name: 'news-edit',  
            // query:{
            //   userid : this.userid,
            // }
        })  
      },
    },
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