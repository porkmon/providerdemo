package com.provider.example.providerdemo.controller.dto;

import com.provider.example.providerdemo.controller.dto.common.BaseBody;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/6/9 17:47
 * @Version 1.0
 */
@Data
public class UserDTO  extends BaseBody {
    private static final long serialVersionUID = 1058706117662380590L;
    @NotBlank(message = "参数为空")
    private String userName;
}
