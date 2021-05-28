<template>
  <div>
    <div class="row h44">
      <div class="col-xs-6">

      </div>
      <div class="col-xs-6 flex-end-center">
        <!-- <button-box type="edit" @click="editItem"></button-box> -->
        <button-box type="delete" @click="deleteItem"></button-box>
      </div>
    </div>
    <tab-table  :notinfo='notinfo' :yesinfo='yesinfo' @getIndex='getreportid' :length='length'   @handleissolve="handleSolve"  ref="tabTable" :active-index="tab.activeIndex" :toggles="tab.toggles" :contents="tab.contents" :columns="table.columns">
    
    </tab-table>
  </div>
</template>

<script>

  import helper from '../../utils/base/helper'

  import TabTable from '../../components/mod/TabTable'
  import ButtonBox from  '../../components/mod/ButtonBox'

  let table_tpl={
    keyName:'id',
      columns:[
      {
        title:"举报类型",
        field:"position",
        width:'80'
      },
      {
        title:"举报内容",
        field:"image",
        width:'500'
      },
      // {
      //   title:"举报图片",
      //   field:"time",
      //   width:'120'
      // },
      {
        title:"是否解决",
        field:"sort",
        width:'40'
      },
      // {
      //   title:"状态",
      //   field:"status",
      //   width:'60'
      // },
      // {
      //   title:"创建时间",
      //   field:"create_at",
      //   width:'140'
      // },

    ],
  }

  export default {
    name: 'RolesIndex',
    components: {TabTable,ButtonBox},
    data:function () {
      return {
        length:'',
        reportid:'',
        // changeinfo:false,
        reportinfo:[],
        notinfo:[],
        yesinfo:[],
        table:{
          url:this.$api.member_index,
          multiSelect:false,
          keyName:'id',
          columns:[
            {
              title:"举报类型",
              field:"position",
              width:'80'
            },
            {
              title:"举报内容",
              field:"image",
              width:'500'
            },
            {
              title:"举报图片",
              field:"time",
              width:'120'
            },
          ]
        },
        tab:{
          activeIndex:0,
          toggles:['未解决',"已解决"],
          contents:[
            {
              url:this.$api.banner_index+'?status=0&valid=1',
              ...table_tpl
            },
            {
              url:this.$api.banner_index+'?status=1&valid=1',
              ...table_tpl
            },
            {
              url:this.$api.banner_index+'?valid=0',
              ...table_tpl
            },
          ]

        }
      }
    },
    mounted:function () {
      let breadcrumb=[
        {
          link: '#',
          title:'举报管理'
        },
        {
          link:'',
          title:'用户举报'
        },

      ]
      this.$store.commit('SET_BREADCRUMB',breadcrumb);
      this.getbanner();
    },
    methods:{
      getbanner:function(){
        var that = this;
            this.$axios.post('/report/getAllReport')
            .then(function (response) {
                console.log(response.data.result);
                const not = response.data.result.notresolve;
                const yes = response.data.result.yesresolve;
                that.notinfo = not;
                that.yesinfo = yes;
                that.length = notinfo.length +yesinfo.length;
            })
            .catch(function (error) {
                console.log(error);
            });
      },
      getreportid:function(e){
        this.reportid = e;
      },
      handleSolve(e){
         if(this.reportid){
          this.$confirm({
          content:"请确认是否已解决",
          success: ()=> {
            var that = this;
                let user = {
              reportid : this.reportid
            }
            let data = this.$qs.stringify(user);
                  this.$axios.post('/report/updateReport',data)
                  .then(function (response) {
                       alert('操作成功')
                  })
                  .catch(function (error) {
                      console.log(error);
                  });

          },
        })
        }
        else{
          alert('请选择数据')
        } 
      },

      deleteItem:function () {
        console.log(this.reportid);
         if(this.reportid){
          this.$confirm({
          content:"删除操作不能恢复，您确定要删除吗",
          success: ()=> {
            var that = this;
            let user = {
              reportid : this.reportid
            }
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/report/deleteReport',data)
            .then(function (response) {
    
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
      onlineItem:function () {
        let tabTable=this.$refs.tabTable
        let id=tabTable.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据',
          })
          return
        }
        let post_data={
          id: id,
          status:1,
          operation:'updateStatus'
        }
        this.$network.post(this.$api.banner_save,post_data).then((res)=>{
          tabTable.refresh()
        })
      },
      offlineItem:function () {
        let tabTable=this.$refs.tabTable
        let id=tabTable.getSelectedRowId()[0]
        if(!id){
          this.$toast({
            title: '请选择一行数据',
          })
          return
        }
        let post_data={
          id: id,
          status:0,
          operation:'updateStatus'
        }
        this.$network.post(this.$api.banner_save,post_data).then((res)=>{
          tabTable.refresh()
        })
      }

    }
  }
</script>

<style lang="less">


</style>
