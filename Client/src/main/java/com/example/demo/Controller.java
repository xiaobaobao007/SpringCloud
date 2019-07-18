package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobaobao
 * @date 2019/7/16 18:30
 */
@RestController
//@RefreshScope
public class Controller {
    @Autowired
    ServiceFeignClient serviceFeignClient;

    @Autowired
    ServiceAFeignClient serviceAFeignClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return serviceFeignClient.hi(name);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return serviceAFeignClient.hello(name);
    }


//    @Value("${name}")
//    private String name;
//
//    @RequestMapping("/name")
//    public String name() {
//        return name;
//    }

    @Value("${bmy}")
    private String bmy;

    @RequestMapping("/bmy")
    public String getProperties() {
        return bmy;
    }
}
