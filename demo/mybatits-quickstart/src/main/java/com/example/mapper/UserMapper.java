package com.example.mapper;

// 删除这一行
// import org.apache.catalina.User;

// 添加正确的导入
import com.example.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    /*
    查询所有用户
     */
//    @Select("select * from user")
    List<User> findAll();
    /*
    根据id删除用户
     */
    @Delete("delete from user where id=#{id}")
    int deleteById(int id);
    /*
    添加用户
     */
    @Insert("insert into user(id,username,password,name,age) values(#{id},#{username},#{password},#{name},#{age})")
    public int insertData(User user);
    /*
    修改用户
     */
    @Update("update user set username=#{username},password=#{password},name=#{name},age=#{age} where id=#{id}")
    public int updateData(User user);
    /*
    根据id查询用户
     */
    @Select("select * from user where id=#{id}")
    public User findById(int id);
    /*
    根据用户名查询用户
     */
    @Select("select * from user where username = #{username}")
    public User findByUsername(String username);
}