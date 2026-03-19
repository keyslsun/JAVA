package com.sjk.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sjk.mapper.EmpExprMapper;
import com.sjk.mapper.EmpMapper;
import com.sjk.pojo.Emp;
import com.sjk.pojo.EmpExpr;
import com.sjk.pojo.EmpQueryParam;
import com.sjk.pojo.PageResult;
import com.sjk.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;
/*
原始分页查询的操作
 */
//    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize) {
//        // 计算起始索引
//        Integer start = (page - 1) * pageSize;
//
//        // 查询总记录数
//        Long total = empMapper.count();
//
//        // 分页查询数据
//        List<Emp> rows = empMapper.list(start, pageSize);
//
//        return new PageResult<>(total, rows);
//    }

    /*
    基于pageHelper分页查询
     */
    @Override
//    public PageResult<Emp> page(Integer page, Integer pageSize,String name, Integer gender,
//                                @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate begin,
//                                @DateTimeFormat (pattern = "yyyy-MM-dd") LocalDate end){
//        //1.设置分页参数
//        PageHelper.startPage(page, pageSize);
//        //2.执行查询
//        List<Emp> empList = empMapper.list(name,gender,begin,end);
//        //3.封装结果并返回
//        Page<Emp> p = (Page<Emp>)empList;
//        return new PageResult<Emp>(p.getTotal(),p.getResult());
//    }
    public PageResult<Emp> page(EmpQueryParam empQueryParam){
        //1.设置分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
        //2.执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        //3.封装结果并返回
        Page<Emp> p = (Page<Emp>)empList;
        return new PageResult<Emp>(p.getTotal(),p.getResult());
    }


    @Override
    @Transactional
    public void save(Emp emp){
        // 1.保存员工基本信息
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
        // 2.保存员工工作经历信息
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList)){
            //遍历集合，为empId赋值
            exprList.forEach(expr -> expr.setEmpId(emp.getId()));
            empExprMapper.insertBatch(exprList);
        }

    }

}

