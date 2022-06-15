package com.provider.example.providerdemo.test.spring;

import com.provider.example.providerdemo.test.proxyDemo.jdkProxy.ITeacherDao;
import com.provider.example.providerdemo.test.proxyDemo.jdkProxy.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/4 15:57
 * @Version 1.0
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        /*ProxyFactory proxyFactory = ac.getBean(ProxyFactory.class);
        ITeacherDao  teacherDao=(ITeacherDao)proxyFactory.getProxyInstance();
        teacherDao.teach();
        teacherDao.sayHello();*/
        A a = ac.getBean(A.class);
        a.getBeanName();
        B b = ac.getBean(B.class);

    }
}
