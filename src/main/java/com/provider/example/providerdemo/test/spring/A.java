package com.provider.example.providerdemo.test.spring;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/12 15:19
 * @Version 1.0
 */
@Data
public class A implements ApplicationContextAware, BeanNameAware {

    private B b;

    private String beanName;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }
    public String getBeanName(){
        System.out.println("BeanName:"+this.beanName);
        return this.beanName;

    }
}
