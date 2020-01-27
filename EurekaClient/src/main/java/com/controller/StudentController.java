package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 1:05
 * @description :
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }
}
