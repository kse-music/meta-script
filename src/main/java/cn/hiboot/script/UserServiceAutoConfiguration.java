package cn.hiboot.script;

import cn.hiboot.script.service.UserService;
import cn.hiboot.script.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class UserServiceAutoConfiguration {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }

}
