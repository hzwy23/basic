package com.wisrc.webapp.controller;

import com.wisrc.webapp.service.FeignUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfo {
    @Autowired
    private FeignUserInfoService feignUserInfoService;

    @RequestMapping(value = "/feign/user/info", method = RequestMethod.GET)
    @ResponseBody
    public String getAllUser(){
        return feignUserInfoService.getAllUser();
    }
}
