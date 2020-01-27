package com.service.impl;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 0:53
 * @description :
 */

@Service
public class StudentServiceImpl implements StudentService {

    private  static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",18));
        studentMap.put(2L,new Student(2L,"李四",19));
        studentMap.put(3L,new Student(3L,"王五",20));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
