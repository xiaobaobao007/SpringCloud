package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaobaobao
 * @date 2019/7/16 18:29
 */
@Component
@FeignClient(value = "service-hi")
public interface ServiceFeignClient {

    @RequestMapping(value = "/hi")
    String hi(@RequestParam("name") String name);

}