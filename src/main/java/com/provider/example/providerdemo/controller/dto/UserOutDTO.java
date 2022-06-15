package com.provider.example.providerdemo.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/10 16:38
 * @Version 1.0
 */
@Data
public class UserOutDTO implements Serializable {
    private static final long serialVersionUID = -8673894957646459278L;

    private String msg;
}
