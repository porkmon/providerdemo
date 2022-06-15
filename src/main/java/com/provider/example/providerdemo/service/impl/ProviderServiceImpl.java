package com.provider.example.providerdemo.service.impl;

import com.provider.example.providerdemo.mysql.entity.User;
import com.provider.example.providerdemo.mysql.mapper.UserMapper;
import com.provider.example.providerdemo.mysql.service.IUserService;
import com.provider.example.providerdemo.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/10 11:22
 * @Version 1.0
 */
@Service
public class ProviderServiceImpl implements IProviderService {
    @Autowired
    private IUserService userService;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUserList() {
        userMapper.a();
        List<User> users = userService.list(null);
        return users;
    }
}
