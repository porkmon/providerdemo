package com.provider.example.providerdemo.mysql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.provider.example.providerdemo.mysql.entity.User;
import com.provider.example.providerdemo.mysql.mapper.UserMapper;
import com.provider.example.providerdemo.mysql.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/10 11:12
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
