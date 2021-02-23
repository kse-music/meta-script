package cn.hiboot.script;

import cn.hiboot.script.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 可做独立脚本启动也可以作为依赖jar使用
 *
 * @author DingHao
 * @since 2021/2/23 9:59
 */
@Slf4j
@SpringBootApplication
public class MetaScriptApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MetaScriptApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(args.length == 1){
            log.info(userService.getName(args[0]));
        }
        System.exit(0);
    }
}
