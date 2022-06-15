package com.provider.example.providerdemo.service;

import com.provider.example.providerdemo.mysql.entity.User;

import java.util.List;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/10 11:20
 * @Version 1.0
 */
public interface IProviderService {
    List<User> queryUserList();
}
