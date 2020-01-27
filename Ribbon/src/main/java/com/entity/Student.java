package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 赵静超
 * @date : 2020/1/26
 * @description :
 */
@Data
@AllArgsConstructor //全参构造函数注解
@NoArgsConstructor  //无参构造函数注解
public class Student {
    private long id;
    private String name;
    private int age;
}
