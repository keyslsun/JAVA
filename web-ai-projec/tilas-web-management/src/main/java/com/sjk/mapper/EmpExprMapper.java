package com.sjk.mapper;

import com.sjk.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpExprMapper {
    /*
    批量保存员工工作经历的操作接口
     */
    void insertBatch(List<EmpExpr> empExprList);
}
