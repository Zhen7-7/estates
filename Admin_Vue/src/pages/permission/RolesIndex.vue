<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">

      </div>
      <div class="col-xs-6 flex-end-center">
        <button-box type="edit" @click="editItem" title="用户编辑"></button-box>
        <!-- <button-box type="edit" @click="editItem"></button-box> -->
        <button-box type="delete" @click="deleteItem"></button-box>
      </div>
    </div>

    <table-box ref="tableBox" :info='info' :length="length" :url="table.url" :columns="table.columns" :key-name="table.keyName" :parse-data="table.parseData" :data="table.data" :multi-select="table.multiSelect">
      <tr slot="row"  slot-scope="props" class="tr" @click = 'getUserid(props.item.userid)'>
        <td class="tc" style="line-height:60px">{{props.item.userid}}</td>
        <td class="tc"><img :src="props.item.headimg" style="margin-top:5px;" width="50" height="50"/></td>
        <td class="tc" style="line-height:60px">{{props.item.username}}</td>
        <td class="tc" style="line-height:60px">{{props.item.realname}}</td>
        <td class="tc" style="line-height:60px">{{props.item.identity}}</td>
        <td class="tc" style="line-height:60px">{{props.item.phone}}</td>
        <td class="tc" style="line-height:60px">{{props.item.city}}</td>
        <td class="tc" style="line-height:60px">{{props.item.gender}}</td>
        <!-- <td class="tc">{{props.item.time}}</td> -->
      </tr>
    </table-box>

  </div>
</template>

<script>


  import TableBox from '../../components/mod/TableBox'
  import ButtonBox from  '../../components/mod/ButtonBox'

  export default {
    name: 'RolesIndex',
    components: {TableBox,ButtonBox},

    data:function () {
      return {
        changeinfo:'',
        info:[],
        table:{
          url:this.$api.roles_index+'?sort=-createdAt',
          multiSelect:false,
          keyName:'name',
         columns:[
            {
              title:"Head",
              field:"avatar",
              width:'120'
            },
            {
              title:"UserName",
              field:"nickname",
              width:'120'
            },
             {
              title:"RealName",
              field:"province",
              width:'160'
            },
             {
              title:"Identity",
              field:"province",
              width:'300'
            },
             {
              title:"Phone",
              field:"province",
              width:'120'
            },
            {
              title:"City",
              field:"province",
              width:'250'
            },
            {
              title:"Gender",
              field:"sex",
              width:'120'
            },
            // {
            //   title:"注册时间",
            //   field:"created_at",
            //   width:'160'
            // },

          ],
          parseData:function (data) {
            data.forEach(function(row){

            })
          }
        }
      }
    },
    mounted:function () {
      this.getUser();
      let breadcrumb=[
        {
          link: '#',
          title:'权限管理'
        },
        {
          link:'',
          title:'系统角色'
        },

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb),
      this.getUser();
    },
    methods:{
      getUser:function(){
        //    const info = [
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
        // this.info = info;
        // this.length = info.length;
           var that = this;
            this.$axios.post('/user/getAllUserInfo')
            .then(function (response) {
                console.log(response.data.result);
                const res = response.data.result;
                that.info = res;
                that.length = res.length;
            })
            .catch(function (error) {
                console.log(error);
            });
      },
      getUserid:function(e){
        console.log(e);
        this.changeinfo = e;
      },
      deleteItem:function () {
        console.log(this.changeinfo)
         if(this.changeinfo){
          this.$confirm({
          content:"删除操作不能恢复，您确定要删除吗",
          success: ()=> {
            var that = this;
            let user = {
              userid:this.changeinfo
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
          alert('请选择删除的用户')
        } 
      },
      editItem:function () {
        console.log(123)
         console.log(this.changeinfo)
         if(this.changeinfo){
           this.$router.push({  
            path: '/roles/edit',   
            name: 'roles-edit',  
            query:{
              userid : this.changeinfo
            }
        })  
        }
        else{
          alert('请选择编辑的用户')
        }
      },
    },
    // beforeRouteEnter:function (to,from,next) {
    //   //从编辑页面返回到列表，应该刷新一下当前页面
    //   if(from.path=='/roles/edit'){
    //     next(vm=>{
    //       vm.$refs.tableBox.refresh()
    //     })
    //   }
    //   next()
    // }
  }
</script>

<style lang="less" scoped>

</style>
