package com.provider.example.providerdemo.test.spring;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/12 15:19
 * @Version 1.0
 */
@Data
@Component
@Slf4j
public class A /*implements ApplicationContextAware, BeanNameAware */{

    private B b;

    /*private String beanName;

    private ApplicationContext applicationContext;

    public void test(){
        log.info("execute test ...");
    }*/

    /*@Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("applicationContext:{}",this.applicationContext);
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }
    public String getBeanName(){
        log.info("BeanName:{}",this.beanName);
        return this.beanName;

    }*/
}
