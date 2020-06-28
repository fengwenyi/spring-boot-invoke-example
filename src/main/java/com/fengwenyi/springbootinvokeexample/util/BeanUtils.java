package com.fengwenyi.springbootinvokeexample.util;

import com.fengwenyi.springbootinvokeexample.bean.ApplicationContextBean;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Erwin Feng
 * @since 2020/6/28 4:59 下午
 */
public class BeanUtils {

    public static Object invoke(String beanName, String methodName, Object [] args) {
        ApplicationContext applicationContext = ApplicationContextBean.getApplicationContext();
        Object bean = applicationContext.getBean(beanName);
        Class<?>[] argsClass = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            argsClass[i] = args[i].getClass();
        }
        Method method = null;
        Object result = null;
        try {
            method = bean.getClass().getMethod(methodName, argsClass);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            assert method != null;
            result = method.invoke(bean, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

}
