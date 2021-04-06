//package cn.zhen77.controller;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.HashMap;
//import java.util.Map;
//
//*
// * @author : zhen77
// * @date: 2021/4/6 - 04 - 06 - 17:08
// * @Description: cn.zhen77.controller
// * @version: 1.0
//
//
//public class ImageController {
//    @RequestMapping(value = "/addImg", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String,Object> addImg(HttpServletRequest request, @RequestParam("file") MultipartFile file){
//
//        Map<String, Object> result = new HashMap<>();
//        Map<String ,Object> params = new HashMap<>();
//
//        try {
//            byte[] data;
//            data = file.getBytes();
//            params.put("img", data);
//            //插入数据库
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        result.put("message", "上传成功");
//        return result;
//    }
//    @RequestMapping(value = "/getImgById", method = RequestMethod.GET)
//    public void getImgById(@RequestParam(value = "id")Long id, HttpServletResponse response){
//        try {
//            ImgTest imgTest = imgService.getImgById(id);
//            byte[] data = imgTest.getImg();
//            response.setContentType("image/jpeg");
//            response.setCharacterEncoding("UTF-8");
//            OutputStream outputSream = response.getOutputStream();
//            outputSream.write(data);
//            outputSream.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}
