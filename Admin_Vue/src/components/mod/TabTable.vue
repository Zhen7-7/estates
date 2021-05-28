<template>
  <div class="tab">
    <!-- <ul class="tab-toggles">
      <li v-for="(toggle,index) in toggles" :class="{active:index==currentIndex}" @click="toggleTab(index)">{{toggle}}</li>
    </ul> -->
    <div class="tab-content">
      <div class="tab-panel" v-for="(table,index) in contents"  v-show="index==currentIndex">
        <keep-alive>
          <table-box :ref="'tableBox'+index"  :notinfo='notinfo' :yesinfo='yesinfo' :url="table.url" :params="params" :columns="table.columns" :key-name="table.keyName" :parse-data="table.parseData" :auto-load="false" :multi-select="table.multiSelect">
                
                  <tr  slot="row"  slot-scope="props" class="tr" @click='getIndex(props.item.suggestid || props.item.reportid)'>
                    <td v-if="(props.item.suggestid)" class="tc" style="line-height:60px">{{props.item.suggestid}}</td>
                    <td v-if="(props.item.suggesttype)" class="tc" style="line-height:60px">{{props.item.suggesttype}}</td>
                    <td v-if="(props.item.suggestcontent)" class="tc" style="line-height:60px">{{props.item.suggestcontent}}</td>
                    <!-- <td v-if="(props.item.suggestimg1)" class="tc"><img :src="props.item.suggestimg1" width="50" height="50"/></td> -->
                    <td v-if="(props.item.reportid)" class="tc" style="line-height:60px">{{props.item.reportid}}</td>
                    <td v-if="(props.item.reporttype)" class="tc" style="line-height:60px">{{props.item.reporttype}}</td>
                    <td v-if="(props.item.reportcontent)" class="tc" style="line-height:60px">{{props.item.reportcontent}}</td>
                    <!-- <td v-if="(props.item.reportimg1)" class="tc"><img :src="props.item.reportimg1" width="50" height="50"/></td> -->
                    <td class="tc" style="line-height:60px">
                      <div v-if="(props.item.issolve)==false"  @click='handleSolve(props.index)'>
                          <a class="btn btn-info btn-sm" >未解决</a>
                      </div>
                      <div v-else>
                          <a class="btn btn-info btn-sm" >已解决</a>
                      </div>
                    </td>
                   </tr>
         
          </table-box>
          
       
        </keep-alive>
      </div>
    </div>
  </div>
</template>

<script>
  import TableBox from './TableBox'
  export default {
    name:'TabTable',
    components:{TableBox},
    props:{
      yesinfo:Array,
      notinfo:Array,
      activeIndex:Number,
      toggles:Array,
      contents:Array,
      params:Object
    },
    data:function () {
      return {
        Index:'',
        currentIndex:this.activeIndex,
        loadStatus:[]
      }
    },
    mounted:function () {
      
    },
    methods:{
      // init(){
      //   this.resetLoadStatus()
      //   this.reload()

      // },
      // resetLoadStatus(){
      //   for(let i=0;i<this.toggles.length;i++){
      //     this.loadStatus[i]=false //所有的表格都未加载
      //   }
      // },
      // reload(){
      //   let tableBox=this.$refs['tableBox'+this.currentIndex]
      //   tableBox[0].reload()
      //   this.loadStatus[this.currentIndex]=true
      // },
      // refresh(){
      //   let tableBox=this.$refs['tableBox'+this.currentIndex]
      //   tableBox[0].refresh()
      //   this.resetLoadStatus()
      //   this.loadStatus[this.currentIndex]=true
      // },
      // getSelectedRowId(){
      //   let tableBox=this.$refs['tableBox'+this.currentIndex]
      //   return tableBox[0].getSelectedRowId()
      // },
      // getSelectedRowParam(field){
      //   let tableBox=this.$refs['tableBox'+this.currentIndex]
      //   return tableBox[0].getSelectedRowParam(field)
      // },
      // getSelectedRowData(){
      //   let tableBox=this.$refs['tableBox'+this.currentIndex]
      //   return tableBox[0].getSelectedRowData()
      // },
      toggleTab(index) {
        this.currentIndex=index;
         this.$emit('S',index);
          // if(!this.loadStatus[index]){
          //   this.reload()
          // }
      },
      handleSolve(e){
        let data = e;
        this.$emit('handleissolve',data);
      },
      getIndex(e){
        let data = e;
        this.$emit("getIndex",data);
      }
    }
  }
</script>

<style scoped lang="less">
  @import "../../less/variable";

  .tab{
    .tab-toggles{
      border-bottom: 1px solid #ddd;
      li{
        display: inline-block;
        list-style: none;
        padding: 0 25px;
        line-height: 36px;
        height: 36px;
        border-radius: 2px;
        background-color: #fff;
        box-shadow: 0 2px 2px 0 rgba(225,225,225,.5);
        font-size: 14px;
        color: #686768;
        cursor: pointer;
        &.active{
          color: #fff;
          background-color: @brand-color;
        }
      }
    }

    .tab-content{

    }
    #content{
     display: -webkit-box;
     overflow: hidden;
    -webkit-box-orient: vertical;
      -webkit-line-clamp: 3;
      line-height:26px;
      text-indent:20px;
      padding:0;
    }
  }
</style>
