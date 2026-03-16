package com.example.mapper;

// 删除这一行
// import org.apache.catalina.User;

// 添加正确的导入
import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}