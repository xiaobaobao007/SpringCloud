package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobaobao
 * @date 2019/7/26 9:32
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${test1}")
    private String test1;
//    @Value("${test2}")
    private String test2;
//    @Value("${test3}")
    private String test3;

    @RequestMapping("/from")
    public String from() {
        return "test1:" + test1 +
                "\ntest2:" + test2 +
                "\ntest3:" + test3;
    }
}