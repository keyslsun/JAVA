package com.sjk;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class jdbcTest {
        /*
        JDBC入门程序
         */
        @Test
        public void testUpdate() throws ClassNotFoundException, SQLException {
            //1.注册驱动
//            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接
            String url = "jdbc:mysql://localhost:3306/web01";
            String user = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url, user, password);
            //3.获取数据库的执行对象
            Statement statement = connection.createStatement();
            //4.执行sql语句
            int i = statement.executeUpdate("update user set age = 25 where id = 1");
            System.out.println("SQL语句执行完毕影响的记录数为：" + i);
            //5.释放资源
            statement.close();
            connection.close();
        }

        @Test
        public void testSelect(){
             String URL = "jdbc:mysql://localhost:3306/web01";
             String USER = "root";
             String PASSWORD = "1234";
        }

}
