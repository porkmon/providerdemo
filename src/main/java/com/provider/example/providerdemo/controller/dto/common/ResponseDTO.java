package com.provider.example.providerdemo.controller.dto.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/10 16:29
 * @Version 1.0
 */
@Data
public class ResponseDTO<T> implements Serializable {
    private static final long serialVersionUID = -294380575542947306L;
    private ResponseHerder header;
    private T body;

    public ResponseDTO(T body){
        this.body=body;
        this.header=new ResponseHerder();
    }
    public ResponseDTO(ResponseHerder header,T body){
        this.header=header;
        this.body=body;
    }
    public ResponseDTO(){
        this.header=new ResponseHerder();
    }
}
