package com.controller;

import com.entity.Student;
import com.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author : 赵静超
 * @date : 2020/1/27
 * @description :
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient feignClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignClient.findAll();
    }

    @GetMapping("/index")
    public String getIndex(){
        return feignClient.getIndex();
    }
}
