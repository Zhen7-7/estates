<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">

      </div>
      <div class="col-xs-6 flex-end-center">
        <!-- <button-box type="edit" @click="editItem" title="管理员编辑"></button-box> -->
        <!-- <button-box type="edit" @click="editItem"></button-box> -->
        <button-box type="delete" @click="deleteItem"></button-box>
      </div>
    </div>

    <table-box ref="tableBox" :info='info' :length="length" :url="table.url" :columns="table.columns" :key-name="table.keyName" :parse-data="table.parseData" :data="table.data" :multi-select="table.multiSelect">
      <tr slot="row"  slot-scope="props" class="tr" @click = 'getUserid(props.item.roborderid)'>
        <td class="tc" style="line-height:60px">{{props.item.roborderid}}</td>
        <td class="tc" style="line-height:60px">{{props.item.rob.estatename}}</td>
        <td class="tc" style="line-height:60px">{{props.item.user.realname}}</td>
        <td class="tc" style="line-height:60px">{{props.item.room}}</td>
         <td class="tc" style="line-height:60px">{{props.item.phone}}</td>
        <td class="tc" style="line-height:60px">{{props.item.discount}}</td>
        <!-- <td class="tc" style="line-height:60px">{{props.item.password}}</td> -->
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
            // {
            //   title:"id",
            //   field:"nickname",
            //   width:'120'
            // },
             {
              title:"名称",
              field:"nickname",
              width:'120'
            },
             {
              title:"用户",
              field:"nickname",
              width:'120'
            },
             {
              title:"房间号",
              field:"province",
              width:'160'
            },
             {
              title:"联系电话",
              field:"province",
              width:'120'
            },
             {
              title:"折扣",
              field:"province",
              width:'120'
            },
          

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
          title:'预订管理'
        },

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb),
      this.getUser();
    },
    methods:{
      getUser:function(){
           var that = this;
           let user = {
             adminname:'test',
             adminpassword:123456
           }
           let data = this.$qs.stringify(user);
            this.$axios.post('/roborder/getAllRoborder')
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
            path: '/administrators/edit',   
            name: 'administrators-edit',  
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
