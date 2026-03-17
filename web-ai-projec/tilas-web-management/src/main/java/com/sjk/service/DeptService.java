package com.sjk.service;

import com.sjk.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DeptService {
    /*
    查询所有部门
     */
    List<Dept> findAll();
    /*
    根据id删除部门
     */
    void deleteById(Integer id);
    /*
    添加部门
     */
    void add(Dept dept);
    /*
    根据id查询部门
     */
    Dept getById(Integer id);

    void update(Dept dept);
}
