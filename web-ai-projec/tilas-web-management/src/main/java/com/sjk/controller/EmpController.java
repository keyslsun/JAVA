package com.sjk.controller;

import com.sjk.pojo.Emp;
import com.sjk.pojo.EmpQueryParam;
import com.sjk.pojo.PageResult;
import com.sjk.pojo.Result;
import com.sjk.service.EmpService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

/*
员工管理的controller
 */
@Slf4j  // 日志
@RequestMapping("/emps")
@Controller // 控制器
@ResponseBody
public class EmpController {
    @Autowired
    private EmpService empService;
    /*
    分页查询
     */
    @GetMapping
    /*
    老的配置方法
     */
//    public Result page(@RequestParam (defaultValue = "1") Integer page,
//                       @RequestParam (defaultValue = "10") Integer pageSize,
//                       String name, Integer gender,
//                       @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate begin,
//                       @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate end) {
//        PageResult<Emp> pageResult = empService.page(page, pageSize,name, gender, begin, end);
//        log.info("分页查询： {},{},{},{},{},{}", page, pageSize, name, gender, begin, end);
//        return Result.success(pageResult);
//    }
    // 新的配置方法
    public Result page(EmpQueryParam empQueryParam) {
        PageResult<Emp> pageResult = empService.page(empQueryParam);
        log.info("分页查询： {} ", empQueryParam);
        return Result.success(pageResult);
    }

    //新增员工
    @PostMapping
    public Result save(@RequestBody Emp emp){
        log.info("新增员工： {}", emp);
        empService.save(emp);
        return Result.success();
    }
}
