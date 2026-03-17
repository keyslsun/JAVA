package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor // 添加全参构造
@NoArgsConstructor  // 添加无参构造

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
}