package com.fengwenyi.springbootinvokeexample.controller;

import com.fengwenyi.springbootinvokeexample.util.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2020/6/28 4:25 下午
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("test")
    public String test() {
        String beanName = "testService";
        String methodName = "say";
        Object [] params = new Object[] {"Juice"};
        return (String) BeanUtils.invoke(beanName, methodName, params);
    }

}
