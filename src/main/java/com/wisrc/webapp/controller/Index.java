package com.wisrc.webapp.controller;


import com.wisrc.webapp.entity.SysSecUser;
import com.wisrc.webapp.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(value = "应用首页控制器")
public class Index {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "首页", notes = "应用服务首页服务")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getUserInfo() {
        List<SysSecUser> userList = userInfoService.getAll();
        StringBuffer sb = new StringBuffer("");
        for (SysSecUser m : userList) {
            sb.append(m.toString()).append("<br/>");
        }
        return sb.toString();
    }
}
