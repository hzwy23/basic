package com.wisrc.basic;

import com.wisrc.webapp.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登陆系统使用，获取token信息，仅用于开发环境
 * 发布到生产环境后，此段代码不会被使用
 * */
@FeignClient(value = "ZUUL-SERVER")
public interface LoginService {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Result login(@RequestParam("username") String username, @RequestParam("password") String password);
}
