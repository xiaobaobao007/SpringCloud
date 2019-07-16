package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author xiaobaobao
 * @date 2019/7/16 20:43
 */

@Component
public class ServiceFeignClientFallback implements ServiceFeignClient {

    @Override
    public String hi(String id) {
        return "hi, " + id + ", error!";
    }
}