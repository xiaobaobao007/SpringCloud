package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author xiaobaobao
 * @date 2019/7/16 20:43
 */

@Component
public class ServiceAFeignClientFallback implements ServiceAFeignClient {

    @Override
    public String hello(String id) {
        return "hello, " + id + ", error!";
    }
}