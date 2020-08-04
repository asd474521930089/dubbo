package cn.hxk.service.Impl;

import cn.hxk.CommonInterface;
import cn.hxk.pojo.User;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Service(interfaceClass = CommonInterface.class)
@Component
public class UserServiceImpl implements CommonInterface {
    public void findUser() {
        System.out.println(new User(1,"1","1"));
    }
}
