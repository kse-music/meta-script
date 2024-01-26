package cn.hiboot.script;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * MetaScriptApplication
 *
 * @author DingHao
 * @since 2024/1/26 12:58
 */
@SpringBootApplication
public class MetaScriptApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MetaScriptApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
