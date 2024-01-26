package cn.hiboot.script.service;

import cn.hiboot.mcn.core.util.JacksonUtils;
import cn.hiboot.mcn.core.util.McnAssert;
import cn.hiboot.script.bean.ScriptConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * ScriptService
 *
 * @author DingHao
 * @since 2024/1/26 12:58
 */
@Slf4j
@Service
public class ScriptService implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        McnAssert.state(args.length == 1, "args must be only one parameters");
        log.info("input parameter = {}", args[0]);
        ScriptConfig scriptConfig = JacksonUtils.fromJson(args[0], ScriptConfig.class);

        String name = scriptConfig.getName();

        if(StringUtils.hasText(name)){
            log.info("name = {}", name);
        }

    }

}
