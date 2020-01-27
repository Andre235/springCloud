package com.feign;

import com.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author : 赵静超
 * @date : 2020/1/27
 * @description :
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String getIndex();
}
