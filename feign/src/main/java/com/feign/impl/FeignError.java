package com.feign.impl;

import com.entity.Student;
import com.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

/**
 * @author : 赵静超
 * @date : 2020/1/27
 * @description :
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return Collections.emptyList();
    }

    @Override
    public String getIndex() {
        return "服务器维护中...";
    }
}
