package com.provider.example.providerdemo.test.proxyDemo.jdkProxy;

import lombok.Data;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/5/3 22:36
 * @Version 1.0
 */
@Data
public class TeacherDao implements ITeacherDao {
    private String name;
    //@Override
    public void teach() {
        System.out.println("teaching ...");
    }

    //@Override
    public void sayHello() {
        System.out.println("hello,"+name);
    }
}
