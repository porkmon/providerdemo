package com.provider.example.providerdemo.common.advice;

import com.provider.example.providerdemo.common.error.ErrorEnum;
import com.provider.example.providerdemo.controller.dto.common.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Locale;

@Slf4j
@ControllerAdvice
public class RestExceptionAdvice extends ExceptionAdvice {

    /**
     * Controller参数校验异常处理
     * <p>
     * modify by liangmin 20210813
     *
     * @param validException 参数校验异常
     * @param locale         本地化
     * @return
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody
    public ResponseDTO<?> methodArgumentExceptionHandler(MethodArgumentNotValidException validException, Locale locale) {
        final List<?> errors = validException.getBindingResult().getAllErrors();
        StringBuilder messages = new StringBuilder();
        for (final Object error : errors) {
            FieldError fieldError = (FieldError) error;
            // 参数名称
            String paramName = fieldError.getField().replace("body.", "");
            messages.append("[").append(paramName).append("]").append(fieldError.getDefaultMessage()).append("|");
        }

        messages.deleteCharAt(messages.length() - 1);
        return toResponseDTO(ErrorEnum.PARAM_INVALID_ERROR.code(), messages.toString());
    }

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public ResponseDTO<?> defaultExceptionHandler(Throwable e, Locale locale) {
        log.error("Intercept exception", e);
        return toResponseDTO(ErrorEnum.INTERNAL_SERVER_ERROR.code(), ErrorEnum.INTERNAL_SERVER_ERROR.msg());
    }

    @ModelAttribute
    public ResponseDTO<?> resetParam(ResponseDTO<?> responseDTO){
        responseDTO.getHeader().setCode("123");
        responseDTO.getHeader().setMsg("我日你哥");
        return responseDTO;
    }
}
