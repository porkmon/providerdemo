package com.provider.example.providerdemo.common.error;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/14 10:08
 * @Version 1.0
 */
public enum ErrorEnum {
    SUCCESS("0","成功"),
    FAIL("1","失败"),
    INTERNAL_SERVER_ERROR("-1","内部错误"),
    PARAM_INVALID_ERROR("-2","参数检验错误");

    private String code;
    private String msg;
    ErrorEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public String code(){
        return this.code;
    }
    public String msg(){
        return this.msg;
    }
}
