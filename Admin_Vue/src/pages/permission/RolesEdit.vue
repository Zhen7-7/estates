<template>
  <div>
    <form class="form-horizontal form-edit">
      <input type="hidden" v-model="form.data.id"/>
      <div class="form-group">
      </div>


       <div class="form-group">
        <label class="col-xs-2 control-label">昵称：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="userinfo.username"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">真实姓名：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="userinfo.realname"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">身份证号：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="userinfo.identity"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">手机号码：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="userinfo.phone"/>
        </div>
      </div>


      <div class="form-group">
        <label class="col-xs-2 control-label">性别：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="userinfo.gender"/>
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
        userid:0,
        userinfo:{},
        categories:[],
        authors:[],
        form:{
          data:{
            username:'',
            realname:'',
            identity:'',
            phone:'',
            gender:'',



            // id:'',
            // category_id1:'',
            // source:0,
            // title:'',
            // content:'',
            // desc:'',
            // playbill:'',
            // seo_words:'',
            // create_uid:''
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
      this.userid = this.$route.query.userid;
      console.log(this.userid);
      this.getuserinfo();

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
      // this.$store.commit('SET_BREADCRUMB',breadcrumb)

      // let id=this.$route.query.id
   
      // this.form.data.id=id

      // this.$network.post(this.$api.news_detail,{
      //   id:id
      // }).then((res)=>{
      //   console.log(res)
      //   if(id){
      //     this.form.data=res.detail
      //   }
      //   this.categories=res.categories
      //   this.authors=res.authors
      // })
    },
    methods:{
      getuserinfo:function(){
            var that = this;
           console.log(this.userid);
            let user = {
              userid:this.userid
            }
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/user/getUserByUserid',data)
            .then(function (response) {
                console.log(123);
                console.log(response.data.result);
                const res = response.data.result;
                that.userinfo = res;
            })
            .catch(function (error) {
                console.log(error);
            });
      },

      formSubmit:function () {
            var that = this;
            let user = this.userinfo;
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/user/updateUserInfo',data)
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
