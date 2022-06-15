package com.provider.example.providerdemo.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.provider.example.providerdemo.mysql.entity.User;

import java.util.List;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/10 10:36
 * @Version 1.0
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> a();
}
