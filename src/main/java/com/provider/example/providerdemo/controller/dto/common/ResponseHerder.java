package com.provider.example.providerdemo.controller.dto.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/10 16:31
 * @Version 1.0
 */
@Data
public class ResponseHerder implements Serializable {
    private static final long serialVersionUID = 1281193177987545971L;
    private String code;
    private String msg;
    public ResponseHerder(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public ResponseHerder(){}

}
