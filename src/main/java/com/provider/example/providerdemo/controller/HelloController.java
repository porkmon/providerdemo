package com.provider.example.providerdemo.controller;

import com.provider.example.providerdemo.controller.dto.common.RequestDTO;
import com.provider.example.providerdemo.controller.dto.common.ResponseDTO;
import com.provider.example.providerdemo.controller.dto.UserDTO;
import com.provider.example.providerdemo.controller.dto.UserOutDTO;
import com.provider.example.providerdemo.service.IProviderService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.TimeUnit;

/**
 * @Author wzr
 * @Description TODO
 * @Date 2022/3/8 17:25
 * @Version 1.0
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private IProviderService providerService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedissonClient redissonClient;

    @PostMapping("hello")
    public ResponseDTO<UserOutDTO> hello( @RequestBody @Valid RequestDTO<UserDTO> user,ResponseDTO<UserOutDTO> responseDTO){

        UserOutDTO out=new UserOutDTO();
        String userName = user.getBody().getUserName();
        RLock userNameLock = redissonClient.getLock(userName);
        try {
            System.out.println(Thread.currentThread().getId()+"主线程获取锁");
            userNameLock.tryLock();
            userNameLock.lock();
            Thread.sleep(10000);
            new Thread(){
                @Override
                public void run() {
                    try{
                        System.out.println(Thread.currentThread().getId()+":新线程start");
                        userNameLock.tryLock();
                        System.out.println(Thread.currentThread().getId()+"新线程获取锁");
                        System.out.println(Thread.currentThread().getId()+"新线程开始释放锁");

                        userNameLock.unlock();
                        System.out.println(Thread.currentThread().getId()+"新线程完成释放锁");
                    }catch (Exception e){
                        System.out.println(Thread.currentThread().getId()+"新线程获取锁失败");
                    }

                }
            }.start();
            /*Boolean aBoolean = stringRedisTemplate.opsForValue().setIfAbsent(userName, Thread.currentThread().getId() + "");
            String s = stringRedisTemplate.opsForValue().get(userName);
            log.info("用户名线程为:{}",s);*/

        }catch (Exception e){

        } finally{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getId()+"主线程开始释放锁");
            userNameLock.unlock();
            System.out.println(Thread.currentThread().getId()+"主线程完成释放锁");
        }
        out.setMsg(userName+"Hello World");
        responseDTO.setBody(out);
        return responseDTO;
    }
    @PostMapping("userList")
    public String userList(){
        return providerService.queryUserList().toString();
    }

}
