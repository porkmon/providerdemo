package com.provider.example.providerdemo.test.proxyDemo.jdkProxy;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/3 22:37
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao target=new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();

        proxyInstance.sayHello();
    }
}
