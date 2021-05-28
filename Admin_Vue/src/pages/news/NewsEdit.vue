<template>
  <div class="box">
    <form class="form-horizontal form-edit" >
      <!-- <input type="hidden" v-model="form.data.id"/> -->
      <!-- <div class="form-group">
      </div> -->


       <div class="form-group">
        <label class="col-xs-2 control-label">小区名：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.estatename"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">小区图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.info.estate.estateimg"></image-upload>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">地址：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.estateaddress"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">户数：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.estateallnum"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">剩余户数：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.estatelastnum"/>
        </div>
      </div>


      <div class="form-group">
        <label class="col-xs-2 control-label">公司：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.company"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">平均价格：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.price"/>
        </div>
        <div style='margin-top:7px;'>w/m²</div>
      </div>

        <div class="form-group">
        <label class="col-xs-2 control-label">城市：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.city"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">楼宇数：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.info.estate.buildingnum"/>
        </div>
      </div>
      
      <div>
         <div  class="building">详细楼层及房间</div>
         <div
         v-for="(item,index) in form.info.building"  :item="item" :index="index"
         >
                <div class="form-group">
                <label class="col-xs-2 control-label">楼层单元：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item.housingunitnum"/>
                </div>
              </div>
               <div class="form-group">
                <label class="col-xs-2 control-label">楼层编号：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item.buildingfloornum"/>
                </div>
              </div>
              <div
                v-if="index==0"
               v-for="(item1,index1) in form.info.building1" :item1="item1" :index1="index1"
              >
                <div class="form-group">
                <label class="col-xs-2 control-label">房间号：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item1.housing.housingroom"/>
                </div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋类型：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item1.housing.housingtype"/>
                </div>
                </div>
                 <div class="form-group">
                <label class="col-xs-2 control-label">房屋面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item1.housing.housingarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋实际面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item1.housing.housingrealarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋平均价格：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item1.housing.housingprice"/>
                </div>
                <div style='margin-top:7px;'>w/m²</div>
                </div>
              </div>

              <div
                v-if="index==1"
               v-for="(item2,index2) in form.info.building2" :item2="item2" :index2="index2"
              >
                <div class="form-group">
                <label class="col-xs-2 control-label">房间号：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item2.housing.housingroom"/>
                </div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋类型：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item2.housing.housingtype"/>
                </div>
                </div>
                 <div class="form-group">
                <label class="col-xs-2 control-label">房屋面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item2.housing.housingarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋实际面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item2.housing.housingrealarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋平均价格：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item2.housing.housingprice"/>
                </div>
                <div style='margin-top:7px;'>w/m²</div>
                </div>
              </div>

              <div
                v-if="index==2"
               v-for="(item3,index3) in form.info.building3" :item3="item3" :index3="index3"
              >
                <div class="form-group">
                <label class="col-xs-2 control-label">房间号：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item3.housing.housingroom"/>
                </div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋类型：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item3.housing.housingtype"/>
                </div>
                </div>
                 <div class="form-group">
                <label class="col-xs-2 control-label">房屋面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item3.housing.housingarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋实际面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item3.housing.housingrealarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋平均价格：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item3.housing.housingprice"/>
                </div>
                <div style='margin-top:7px;'>w/m²</div>
                </div>
              </div>

              <div
                v-if="index==3"
               v-for="(item4,index4) in form.info.building4" :item4="item4" :index4="index4"
              >
                <div class="form-group">
                <label class="col-xs-2 control-label">房间号：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item4.housing.housingroom"/>
                </div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋类型：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item4.housing.housingtype"/>
                </div>
                </div>
                 <div class="form-group">
                <label class="col-xs-2 control-label">房屋面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item4.housing.housingarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋实际面积：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item4.housing.housingrealarea"/>
                </div>
                <div style='margin-top:7px;'>m²</div>
                </div>
                <div class="form-group">
                <label class="col-xs-2 control-label">房屋平均价格：</label>
                <div class="col-xs-8">
                  <input class="form-control form-field" v-model="item4.housing.housingprice"/>
                </div>
                <div style='margin-top:7px;'>w/m²</div>
                </div>
              </div>
              
              <div style="border-bottom:1px solid black"></div>
         </div>
      </div>

      


      <!-- <div class="form-group">
        <label class="col-xs-2 control-label">楼房图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.buildingimg"></image-upload>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间类型：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingtype"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">房间面积：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingarea"/>
        </div>
      </div>

       <div class="form-group">
        <label class="col-xs-2 control-label">真实面积：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingrealarea"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">房间价格：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingprice"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">房间单元：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingunit"/>
        </div>
      </div>

      <div class="form-group">
        <label class="col-xs-2 control-label">房间号：</label>
        <div class="col-xs-8">
          <input class="form-control form-field" v-model="form.estate.housingroom"/>
        </div>
      </div>

    

       <div class="form-group">
        <label class="col-xs-2 control-label">房间图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.housingimg1"></image-upload>
        </div>
      </div>
       <div class="form-group">
        <label class="col-xs-2 control-label">房间图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.housingimg2"></image-upload>
        </div>
      </div>
       <div class="form-group">
        <label class="col-xs-2 control-label">房间图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.housingimg3"></image-upload>
        </div>
      </div>
       <div class="form-group">
        <label class="col-xs-2 control-label">房间图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.housingimg4"></image-upload>
        </div>
      </div>
       <div class="form-group">
        <label class="col-xs-2 control-label">房间图片：</label>
        <div class="col-xs-8">
          <image-upload data-type="string" :num-limit="1" :size-limit="2*1024*1024" v-model="form.estate.housingimg5"></image-upload>
        </div>
      </div> -->
      
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
        userid:'',
        estate:{},
        categories:[],
        authors:[],
        form:{
          info:{
          //   estate:{
          //     eatatename:'',
          //     estateimg:'',
          //     estateaddress:'',
          //     estateallnum:'',
          //     estatelastnum:'',
          //     company:'',
          //     price:'',
          //     city:'',
          //     buildingnum
          //   },
          //   building:{
          //     housingunitnum:'',
          //     buildingfloornum:'',
          //   },
          //   building1:{
          //     housingroom:'',
          //     houdingtype:'',
          //     housingarea:'',
          //     housingrealarea:'',
          //     housingprice:''
          //   },
          //    building2:{
          //     housingroom:'',
          //     houdingtype:'',
          //     housingarea:'',
          //     housingrealarea:'',
          //     housingprice:''
          //   },
          //    building3:{
          //     housingroom:'',
          //     houdingtype:'',
          //     housingarea:'',
          //     housingrealarea:'',
          //     housingprice:''
          //   },
          //    building4:{
          //     housingroom:'',
          //     houdingtype:'',
          //     housingarea:'',
          //     housingrealarea:'',
          //     housingprice:''
          //   }
          // },
          // rules:{
          // estate:{
          //   estatename:{
          //     requires:true
          //   },

          //   estateimg:{
          //     requires:true
          //   },

          //   estateaddress:{
          //     requires:true
          //   },

          //   estateallnum:{
          //     requires:true
          //   },

          //   estatelastnum:{
          //     requires:true
          //   },

          //   conpany:{
          //     requires:true
          //   },

          //   buildingnum:{
          //     requires:true
          //   },

          //   price:{
          //     requires:true
          //   },

          //   city:{
          //     requires:true
          //   },

          // },
            
          // building:{
          //   housingunitnum:{
          //     requires:true
          //   },

          //   buildingfloornum:{
          //     requires:true
          //   },
          // },

          // building1:{
          //   housingtype:{
          //     requires:true
          //   },

          //   housingarea:{
          //     requires:true
          //   },

          //   housingrealarea:{
          //     requires:true
          //   },

          //   housingprice:{
          //     requires:true
          //   },

          //   housingroom:{
          //     requires:true
          //   },
          // },

          //  building2:{
          //   housingtype:{
          //     requires:true
          //   },

          //   housingarea:{
          //     requires:true
          //   },

          //   housingrealarea:{
          //     requires:true
          //   },

          //   housingprice:{
          //     requires:true
          //   },

          //   housingroom:{
          //     requires:true
          //   },
          // },

          //  building3:{
          //   housingtype:{
          //     requires:true
          //   },

          //   housingarea:{
          //     requires:true
          //   },

          //   housingrealarea:{
          //     requires:true
          //   },

          //   housingprice:{
          //     requires:true
          //   },

          //   housingroom:{
          //     requires:true
          //   },
          // },

          //  building4:{
          //   housingtype:{
          //     requires:true
          //   },

          //   housingarea:{
          //     requires:true
          //   },

          //   housingrealarea:{
          //     requires:true
          //   },

          //   housingprice:{
          //     requires:true
          //   },

          //   housingroom:{
          //     requires:true
          //   },
          // },
            
          // },

          
          // message:{
          //   estate:{
          //   estatename:{
          //     requires:'true'
          //   },

          //   estateimg:{
          //     requires:'true'
          //   },

          //   estateaddress:{
          //     requires:'true'
          //   },

          //   estateallnum:{
          //     requires:'true'
          //   },

          //   estatelastnum:{
          //     requires:'true'
          //   },

          //   conpany:{
          //     requires:'true'
          //   },

          //   buildingnum:{
          //     requires:'true'
          //   },

          //   price:{
          //     requires:'true'
          //   },

          //   city:{
          //     requires:'true'
          //   },

          // },
            
          // building:{
          //   housingunitnum:{
          //     requires:'true'
          //   },

          //   buildingfloornum:{
          //     requires:'true'
          //   },
          // },

          // building1:{
          //   housingtype:{
          //     requires:'true'
          //   },

          //   housingarea:{
          //     requires:'true'
          //   },

          //   housingrealarea:{
          //     requires:'true'
          //   },

          //   housingprice:{
          //     requires:'true'
          //   },

          //   housingroom:{
          //     requires:'true'
          //   },
          // },

          //  building2:{
          //   housingtype:{
          //     requires:'true'
          //   },

          //   housingarea:{
          //     requires:'true'
          //   },

          //   housingrealarea:{
          //     requires:'true'
          //   },

          //   housingprice:{
          //     requires:'true'
          //   },

          //   housingroom:{
          //     requires:'true'
          //   },
          // },

          //  building3:{
          //   housingtype:{
          //     requires:'true'
          //   },

          //   housingarea:{
          //     requires:'true'
          //   },

          //   housingrealarea:{
          //     requires:'true'
          //   },

          //   housingprice:{
          //     requires:'true'
          //   },

          //   housingroom:{
          //     requires:'true'
          //   },
          // },

          //  building4:{
          //   housingtype:{
          //     requires:'true'
          //   },

          //   housingarea:{
          //     requires:'true'
          //   },

          //   housingrealarea:{
          //     requires:'true'
          //   },

          //   housingprice:{
          //     requires:'true'
          //   },

          //   housingroom:{
          //     requires:'true'
          //   },
          // },
          }
        }

      }
    },
    mounted:function () {
      if(this.$route.query){
          this.userid = this.$route.query.userid;
          this.estateid = this.$route.query.estateid;
      }
      this.getEstate();

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
      getEstate:function(){
          if(this.estateid){
            var that = this;
            let user = {
              estateid:this.estateid
            }
            let data = this.$qs.stringify(user);
            console.log(data);
            this.$axios.post('/all/getAllInfo',data)
            .then(function (response) {
                console.log(response.data.result);
                that.form.info = response.data.result;
            })
            .catch(function (error) {
                console.log(error);
            });
          }
          else return;
      },
      formSubmit:function () {
        this.$toast({
                    title:"操作成功"
                  })
        this.$router.push('/news/index')
         },
        // var that = this;
        // if(this.userid = ''){
        //    let user = {
        //       all : this.form.estate
        //     };
        //     let data = this.$qs.stringify(user);
        //     this.$axios.post('/user/updateestate',data)
        //     .then(function (response) {
        //         that.$toast({
        //             title:"操作成功"
        //           })
        //         that.$router.push('/news/index')
        //     })
        //     .catch(function (error) {
        //         console.log(error);
        //     });

        // }
        //   else{  
        //     let user = {
        //       all : this.form.estate
        //     };
        //     let data = this.$qs.stringify(user);
        //     this.$axios.post('/user/updateestate',data)
        //     .then(function (response) {
        //         that.$toast({
        //             title:"操作成功"
        //           })
        //         that.$router.push('/news/index')
        //     })
        //     .catch(function (error) {
        //         console.log(error);
        //     });
        //   }

        // let form_data={...this.form.estate.data}

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
     
      updated:function(){
        
      }
    }
  }
</script>

<style lang="less" scoped>
  .box{
  }
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
  .building{
        text-align: center;
        font-size:40px;
        font-weight: 500;
        border-bottom: 1px solid black;
  }
  .form-group{
    margin-top:40px;
    // width:40%;
  }
</style>