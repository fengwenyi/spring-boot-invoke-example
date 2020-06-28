package com.fengwenyi.springbootinvokeexample.service;

import org.springframework.stereotype.Service;

/**
 * @author Erwin Feng
 * @since 2020/6/28 4:23 下午
 */
@Service
public class TestService {

    public String say(String name) {
        return "Hello " + name;
    }

}
