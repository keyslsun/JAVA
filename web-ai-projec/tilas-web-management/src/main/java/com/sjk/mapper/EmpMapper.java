package com.sjk.mapper;

import com.sjk.pojo.Emp;
import com.sjk.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
    /*
    员工的操作接口
     */
public interface EmpMapper {

    //-----------------------------------------原始分页查询实现-------------------------------------------------
    /*
    查询总记录数
     */
//    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id;")
//    public Long count();

    /*
    分页查询
     */
//    @Select("select e.*, d.name as deptName from emp e left join dept d on e.dept_id = d.id " +
//            "order by e.update_time desc limit #{start}, #{pageSize};")
//    public List<Emp> list(Integer start, Integer pageSize);

//        @Select("select e.*, d.name as deptName from emp e left join dept d on e.dept_id = d.id " +
//            "order by e.update_time desc")
//        public List<Emp> list();

//        List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);
        public List<Emp> list(EmpQueryParam empQueryParam);

        /*
        新增员工基本信息
         */
//        @Options(useGeneratedKeys = true, keyProperty = "id") // 设置主键回填
//        @Insert("insert into emp(username, name, gender,phone, job, salary, image,entry_date,dept_id, create_time, update_time)\n" +
//                "    values (#{username},#{name},#{gender},#{phone}, #{job}, #{salary},#{image}, #{entry_date}, #{dept_id}, #{create_time},#{update_time})")
         void insert(Emp emp);
}
