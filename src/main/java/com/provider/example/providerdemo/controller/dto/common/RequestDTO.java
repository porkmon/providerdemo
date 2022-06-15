package com.provider.example.providerdemo.controller.dto.common;

import lombok.Data;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/10 16:29
 * @Version 1.0
 */
@Data
public class RequestDTO<T extends BaseBody> implements Serializable {
    private static final long serialVersionUID = -182351253007293915L;

    private RequestHerder header;
    @Valid
    private T body;
}
