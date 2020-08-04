package cn.hxk;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackageClasses = cn.hxk.service.Impl.UserServiceImpl.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
