package com.sjk.controller;


import com.sjk.pojo.Result;
import com.sjk.utils.AliyunOSSOperator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RestController
public class UploadController {
    /*
    本地磁盘存储方法
     */
//    @PostMapping("/upload")
//    public Result upload(String name, Integer age, MultipartFile file){
//    log.info("上传数据： name={}, age={}, file={}", name, age, file);
//    return Result.success();
//    }
    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        log.info("上传数据： file={}", file.getOriginalFilename() );
        //将文件交给OSS 进行存储管理
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
        log.info("文件上传成功，url：{}", url);

        return Result.success(url);
    }
}
