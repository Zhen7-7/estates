<template>
  <div>
    <form class="form-horizontal form-edit">
      <input type="hidden" v-model="form.data.id"/>
      <div class="form-group">
      </div>

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


      <div class="form-group">
        <label class="col-xs-2 control-label">环境：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.reason"/>
        </div>
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

      <!-- <div class="form-group">
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

       <div class="form-group">
        <label class="col-xs-2 control-label">房间面积：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robarea"/>
        </div>
        <div style='margin-top:7px;'>m²</div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间价格：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.roballprice"/>
        </div>
        <div style='margin-top:7px;'>w/m²</div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">管理员手机号码：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="robinfo.robphone"/>
        </div>
      </div>

     



      <form-submit @formSubmit="formSubmit"></form-submit>
    </form>
  </div>
</template>

<script>
  import FormSubmit from "../../components/mod/FormSubmit"
  import Ueditor from "../../components/mod/Ueditor"
  import ImageUpload from "../../components/mod/ImageUpload"

  import formValidation from '../../utils/base/formValidation'


  export default {
    name: 'RolesEdit',
    components: {ImageUpload, FormSubmit,Ueditor},
     props:{
      info:Array,
    },
    data:function () {
      return {
        robid:'',
        robinfo:{},
        categories:[],
        authors:[],
        form:{
          data:{
            username:'',
            realname:'',
            identity:'',
            phone:'',
            gender:'',



           
          },
          rules:{
            username:{
              required:true
            },
            realname:{
              required:true
            },
            identity:{
              required:true
            },
            phone:{
              required:true
            },
            gender:{
              required:true
            },
            // category_id1:{
            //   required:true
            // },
            // title:{
            //   required:true
            // },
            // content:{
            //   required:true
            // },
            // desc:{
            //   required:true
            // },
            // playbill:{
            //   required:true
            // },
            // seo_words:{
            //   required:true
            // },
            // create_uid:{
            //   required:true
            // },

          },
          message:{
            username:{
              required:'用户名不能为空'
            },
            realname:{
              required:'真实姓名不能为空'
            },
            identity:{
              required:'身份证号不能为空'
            },
            phone:{
              required:'电话不能为空'
            },
            gender:{
              required:'性别不能为空'
            },
          }
        }

      }
    },
    mounted:function () {
      this.robid = this.$route.query.robid;
      console.log( this.robid)
      this.getRobInfo();

      let breadcrumb=[
        {
          link: '#',
          title:'房产管理'
        },
        {
          link:'/news/index',
          title:'小区信息'
        },
        {
          link:'',
          title:'编辑信息'
        },

      ]
    },
    methods:{
      getRobInfo:function(){
            var that = this;
            let user = {
              robid:this.robid
            }
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/robhousing/getRobByRobid',data)
            .then(function (response) {
                console.log(response.data.result);
                const res = response.data.result;
                that.robinfo = res;
            })
            .catch(function (error) {
                console.log(error);
            });
      },

      formSubmit:function () {
            var that = this;
            let user = this.robinfo;
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/robhousing/insertRobhousing',data)
            .then(function (response) {
                alert('修改成功')
            })
            .catch(function (error) {
                console.log(error);
            });
        // let form_data={...this.form.data}

        // let validation=formValidation.validate(this.form.rules,form_data,this.form.message)
        // if(validation.code=='FAIL'){
        //   this.$toast({
        //     title:validation.msg,
        //     type:'error'
        //   })
        //   return false
        // }

        // let obj =this.$refs.category
        // let index = obj.selectedIndex; // 选中索引
        // let category_text = obj.options[index].text; // 选中文本
        // form_data.category_text1=category_text

        // this.$network.post(this.$api.news_save,{
        //   ...form_data

        // }).then((res)=>{
        //   this.$toast({
        //     title:"保存成功"
        //   })
        //   this.$router.push('/news/index')
        // })
      },
      updated:function(){
        
      }
    }
  }
</script>

<style lang="less" scoped>

  .permissions{
    .checkbox-area{
      label{
        padding-left: 4px;
        margin-right: 10px;
        padding-top: 8px;
        min-height: 20px;
        margin-bottom: 0;
        font-weight: 400;
        input{
          margin-right: 4px;
        }
      }
    }
  }
  .form-group{
    margin-top:40px;
  }
</style>
