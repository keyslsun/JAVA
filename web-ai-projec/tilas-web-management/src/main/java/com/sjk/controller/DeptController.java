package com.sjk.controller;

import com.sjk.pojo.Dept;
import com.sjk.pojo.Result;
import com.sjk.service.DeptService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.html.HTMLParagraphElement;

import java.util.List;


@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
//    @RequestMapping(value = "/depts", method = RequestMethod.GET)//method 用于指定请求方式
    @GetMapping("/depts") //Get类限定
    public Result list() {
        System.out.println("查询全部数据部门数据");
        List<Dept> deptList= deptService.findAll();
        return Result.success(deptList);
    }
/*
删除部门的方法
 */
    //方式1：HttpServletRequest
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest request){
//        String idStr = request.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("根据ID删除部门：" + id);
//        return Result.success();
//    }

    //方式2：@RequestParam注解
    //注意：该方式必须传递参数
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam("id") Integer deptId){
//        System.out.println("根据id删除部门：" + deptId);
//        return Result.success();
//    }

    //方式3：如果形参名与实参名相同，直接定义方法形参即可
    @DeleteMapping("/depts")
        public Result delete(Integer id){
            System.out.println("根据id删除部门:" + id);
            deptService.deleteById(id);
            return Result.success();
        }
    /*
    增加部门
     */
    @PostMapping("/depts")
        public Result add(@RequestBody Dept dept){
        System.out.println("增加了部门：" + dept);
        deptService.add(dept);
        return Result.success();
        }
        /*
        修改部门第一步：查询回显
         */
    //根据id查询部门
    //方式1：
//    @GetMapping("/depts/{id}")
//        public Result getInfo(@PathVariable("id") Integer deptId){
//        System.out.println("根据id查询部门:" + deptId);
//        return Result.success();
//    }

    //方式2：若路径参数的参数名和方法的形参是一致的情况，可以省略
    @GetMapping("/depts/{id}")
    public Result getInfo(@PathVariable Integer id){
        System.out.println("根据id查询部门：" + id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    /*
    修改部门第二步：更新数据
    */
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        System.out.println("更新了部门：" + dept);
        deptService.update(dept);
        return Result.success();
    }
}
