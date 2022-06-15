package com.provider.example.providerdemo.test.spring.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/28 11:09
 * @Version 1.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        System.out.println("beanNamesIterator:"+beanNamesIterator.toString());
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        System.out.println("beanDefinitionNames:"+beanDefinitionNames.toString());
        for (String beanDefinitionName:beanDefinitionNames){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            System.out.println("增强beanDifinition");
        }

    }
}
