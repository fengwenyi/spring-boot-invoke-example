package com.fengwenyi.springbootinvokeexample.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Erwin Feng
 * @since 2020/6/28 4:26 下午
 */
@Component
public class ApplicationContextBean implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    private ApplicationContextBean() {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextBean.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
