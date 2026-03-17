package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatitsQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll() {
        // 测试查询所有用户
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);  // ✅ 改为 users
    }
    @Test
    public void testDeleteById() {
        // 测试根据id删除用户
        int result = userMapper.deleteById(3);
        System.out.println("删除了" + result + "行数据");
    }

    @Test
    // 测试添加用户
    public void testInsertData(){
        User user = new User(3, "admin", "123456", "管理员", 18);
        int result = userMapper.insertData(user);
        System.out.println("插入了" + result + "行数据");

   }

    @Test
    // 测试修改用户
    public void testUpdateData(){
        User user = new User(4, "Xishi", "123456", "西施", 26);
        int result = userMapper.updateData(user);
        System.out.println("修改了" + result + "行数据");
    }
    @Test
    // 测试根据id查询用户
    public void testFindById(){
        User user = userMapper.findById(1);
        System.out.println("查询到的信息：" + user);
    }

    @Test
    // 测试根据用户名查询用户
    public void testFindByUsername(){
        User user = userMapper.findByUsername("Xishi");
        System.out.println("查询到的信息：" + user);
    }
}
