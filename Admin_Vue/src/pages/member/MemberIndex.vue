<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">
        <form @submit.prevent="queryData" class="query">
          <input type="text" v-model="query.keywords" placeholder="根据用户昵称搜索"  class="form-control" style="width:200px;float: left" />
         <button-box type="search" @click="queryData"></button-box>
        </form>
      </div>
      <div class="col-xs-6"></div>
    </div>

    <table-box :info="info" :length="length" ref="tableBox" :url="table.url" :params="query" :columns="table.columns" 
    :key-name="table.keyName" :parse-data="table.parseData" :data="table.data" :multi-select="table.multiSelect">
      <tr slot="row"  slot-scope="props" class="tr">
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
  import pages from '../../utils/base/pages'
  export default {
    name: 'MemberIndex',
    components: {TableBox,ButtonBox},
    ...pages,
    data:function () {
      return {
        info:[],
        length:0,
        query:{
          keywords:''
        },
        table:{
          url:this.$api.member_index,
          multiSelect:false,
          keyName:'id',
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
              row.sex=row.sex==1?'男':'女'
            })
          }
        }

      }
    },
    mounted:function () {
      
      let breadcrumb=[
        {
          link: '/index',
          title:'用户管理'
        },
        {
          link:'',
          title:'注册用户'
        },

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb);
      // console.log('this.$router')
      // console.log(this.$router)
      this.getuser();
    },
    methods:{
      queryData:function () {
        let tableBox=this.$refs.tableBox
        tableBox.reload()
        // let queryData={...this.query}
        // this.query=queryData
      },
      getuser(){
        var that = this;
            // let data = this.$qs.stringify(user);
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
      }
    }
  }
</script>

<style lang="less" scoped>
</style>
