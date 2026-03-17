package com.sjk.mapper;

import com.sjk.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    //方式1：手动结果映射
//    @Results({
//            @Result(column = "create_time", property = "createTime"),   // 将数据库中的字段名映射为实体类中的属性名
//            @Result(column = "update_time", property = "updateTime")
//    })
    /*
    查询所有部门
     */
    //第二种方式：起别名
    //@Select("select id, name, create_time createTime, update_time updateTime from dept order by update_time desc")

    //方式3：在yml内配置开关

    @Select("select id, name, create_time , update_time  from dept order by update_time desc")
    List<Dept> findAll();

    /*
    删除部门
     */
    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    /*
    添加部门
     */
    @Insert("insert into dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
    void add(Dept dept);

    /*
    根据id查询部门
     */
    @Select("select * from dept where id = #{id}")
    Dept getById(Integer id);

    /*
    修改部门
     */
    @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void update(Dept dept);
}
