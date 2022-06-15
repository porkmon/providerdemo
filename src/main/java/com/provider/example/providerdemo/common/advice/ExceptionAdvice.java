package com.provider.example.providerdemo.common.advice;

import com.provider.example.providerdemo.common.error.ErrorEnum;
import com.provider.example.providerdemo.controller.dto.common.ResponseDTO;
import com.provider.example.providerdemo.controller.dto.common.ResponseHerder;
import org.springframework.util.StringUtils;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/14 10:13
 * @Version 1.0
 */
public abstract class ExceptionAdvice {
    protected ResponseDTO<?> toResponseDTO(String code,String msg){
        ResponseHerder header=new ResponseHerder();
        if(StringUtils.hasText(code)){
            header.setCode(code);
        }else{
            header.setCode(ErrorEnum.FAIL.code());
        }
        if(StringUtils.hasText(msg)){
            header.setMsg(msg);
        }else{
            header.setMsg(ErrorEnum.FAIL.msg());
        }
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setHeader(header);
        return responseDTO;
    }
}
