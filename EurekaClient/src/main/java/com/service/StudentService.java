package com.service;

import com.entity.Student;

import java.util.Collection;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 0:51
 * @description :
 */
public interface StudentService {

    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);
}
