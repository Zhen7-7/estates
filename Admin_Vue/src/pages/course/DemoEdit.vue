<template>
  <div>
    <form class="form-horizontal form-edit">
      <input type="hidden" v-model="form.data.id"/>


      <div class="form-group">
        <label class="col-xs-2 control-label">小区名：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.estatename"/>
        </div>
      </div>


        <div class="form-group">
        <label class="col-xs-2 control-label">小区地址：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.estateaddress"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">小区平均价格：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.estateprice"/>
        </div>
         <div style='margin-top:7px;'>w/m²</div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间价格：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.roballprice"/>
        </div>
        <div style='margin-top:7px;'>w/m²</div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">折扣：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robdiscount"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间面积：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robarea"/>
        </div>
        <div style='margin-top:7px;'>m²</div>
      </div>

        <div class="form-group">
        <label class="col-xs-2 control-label">楼房：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robbuildingid"/>
        </div>
      </div>
      
        <div class="form-group">
        <label class="col-xs-2 control-label">单元：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robunitid"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间号：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robroomid"/>
        </div>
      </div>

        <div class="form-group">
        <label class="col-xs-2 control-label">联系电话：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robphone"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">信息：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.information"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">推荐原因：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.reason"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">折扣剩余天数：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.lastday"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">折扣剩余房间数：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.lastnum"/>
        </div>
      </div>


      

      <!-- <div class="form-group">
        <label class="col-xs-2 control-label">楼房图片：</label>
        <label class="col-xs-2 control-label">楼房图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="robinfo.robimg"></image-upload>
        </div>
      </div> -->


       <div class="form-group">
        <label class="col-xs-2 control-label">房间类型：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robtype"/>
        </div>
      </div>

      

      

      


      <form-submit @formSubmit="formSubmit"></form-submit>
    </form>
  </div>
</template>

<script>
  import FormSubmit from "../../components/mod/FormSubmit"

  import formValidation from '../../utils/base/formValidation'



  export default {
    name: 'DemoEdit',
    components: {FormSubmit},

    data:function () {
      return {
        robid:'',
        robinfo:{
          estatename:'',
          estateaddress:'',
          estateprice:'',
          robdiscount:'',
          lastday:'',
          lastnum:'',
          reason:'',
          robbuildingid:'',
          robunitid:'',
          robroomid:'',
          robtype:'',
          robarea:'',
          roballprice:'',
          robphone:'',
          information:'',
          reason:'',
        },
        form:{
          data:{
            id:'',
            name:'',
            content:'',
          },
          rules:{
            name:{
              required:true
            },
            content:{
              required:true
            },
          },
          message:{
            name:{
              required:"名称不能为空"
            },
            content:{
              required:"内容不能为空"
            },

          }
        }

      }
    },
    mounted:function () {
      this.robid = this.$route.query.robid;
      console.log( this.robid)
    },
    methods:{
      formSubmit:function () {
        var that = this;
            let user = {
              robtype:this.robinfo.robtype,
              estatename:this.robinfo.estatename,
              estateaddress:this.robinfo.estateaddress,
              estateprice:this.robinfo.estateprice,
              roballprice:this.robinfo.roballprice,
              robdiscount:this.robinfo.robdiscount,
              robarea:this.robinfo.robarea,
              robbuildingid:this.robinfo.robbuildingid,
              robunitid:this.robinfo.robunitid,
              robroomid:this.robinfo.robroomid,
              robphone:this.robinfo.robphone,
              information:this.robinfo.information,
              reason:this.robinfo.reason,
              lastnum:this.robinfo.lastnum,
              lastday:this.robinfo.lastday,
            };
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/robhousing/insertRobhousing',data)
            .then(function (response) {
                alert('添加成功')
                this.$router.push('/course/index')
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
