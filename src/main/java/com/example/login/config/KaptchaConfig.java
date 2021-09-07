package com.example.login.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.context.annotation.*;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;


import java.util.Properties;
/**
 * @author hxf
 * @create 2021-09-07 20:52
 */
@Configuration
public class KaptchaConfig {
    /**
     * 设置验证码的大小和格式
     * @return
     */
    @Bean
    public Producer kaptchaProducer() {
        Properties properties = new Properties();
        properties.setProperty("kaptcha.image.width", "100");
        properties.setProperty("kaptcha.image.height", "40");
        properties.setProperty("kaptcha.textproducer.font.size", "32");
        properties.setProperty("kaptcha.textproducer.font.color", "0,0,0");
        properties.setProperty("kaptcha.textproducer.char.string", "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYAZ");
        properties.setProperty("kaptcha.textproducer.char.length", "4");//随机字符个数
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");//无噪声干扰

        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }
}
