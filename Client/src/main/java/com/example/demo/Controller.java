package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaobaobao
 * @date 2019/7/16 18:30
 */
@RestController
public class Controller {
    @Autowired
    ServiceFeignClient serviceFeignClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return serviceFeignClient.hi(name);
    }
}
