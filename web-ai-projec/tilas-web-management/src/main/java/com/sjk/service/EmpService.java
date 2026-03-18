package com.sjk.service;

import com.sjk.mapper.EmpMapper;
import com.sjk.pojo.Emp;
import com.sjk.pojo.EmpQueryParam;
import com.sjk.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface EmpService {

//    PageResult<Emp> page(Integer page, Integer pageSize, String name, Integer gender,
//                         LocalDate begin, LocalDate end);
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    //新增员工
    void save(Emp emp);

}
