package com.wisrc.webapp.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// basic-eureka 是eureka注册中心注册的应用名称
@FeignClient("basic-eureka")
public interface FeignUserInfoService {

    /**
     * 通过feign访问basic-eureka应用中的/user接口
     * */
    @RequestMapping("/user")
    String getAllUser();
}
