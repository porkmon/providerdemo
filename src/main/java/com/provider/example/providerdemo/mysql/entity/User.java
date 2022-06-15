package com.provider.example.providerdemo.mysql.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/9 11:32
 * @Version 1.0
 */
@Data
@TableName(value="t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 5774979360436728385L;
    // 主键
    @TableId
    private String id;

    // 用户名
    private String name;

    // 密码
    private String password;

    public static void main(String[] args) {
        Class<?> user=null;
        try {
            user = Class.forName("com.provider.example.providerdemo.mysql.entity.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class c=User.class;
        User user1=new User();
        Class<? extends User> aClass = user1.getClass();

        System.out.println("user==c:"+(user==c)+",user==aClass:"+(user==aClass)+",c==aClass:"+(c==aClass));
        try {
            Constructor constructor = c.getDeclaredConstructor();
            try {
                Object o = constructor.newInstance();
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
