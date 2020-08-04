package cn.hxk.controller;


import cn.hxk.CommonInterface;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference(version = "1.0.0")
    private CommonInterface userService;
    @GetMapping("find")
    public void findUser(){
    userService.findUser();
    }
}
