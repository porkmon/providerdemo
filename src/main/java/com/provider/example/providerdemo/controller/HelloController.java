package com.provider.example.providerdemo.controller;

import com.provider.example.providerdemo.controller.dto.common.RequestDTO;
import com.provider.example.providerdemo.controller.dto.common.ResponseDTO;
import com.provider.example.providerdemo.controller.dto.UserDTO;
import com.provider.example.providerdemo.controller.dto.UserOutDTO;
import com.provider.example.providerdemo.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/8 17:25
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private IProviderService providerService;

    @PostMapping("hello")
    public ResponseDTO<UserOutDTO> hello(@RequestBody @Valid RequestDTO<UserDTO> user){
        UserOutDTO out=new UserOutDTO();
        out.setMsg(user.getBody().getUserName()+"Hello World");
        //out.setMsg(user.getUserName()+"Hello World");
        return new ResponseDTO<>(out);
    }
    @PostMapping("userList")
    public String userList(){
        return providerService.queryUserList().toString();
    }
}
