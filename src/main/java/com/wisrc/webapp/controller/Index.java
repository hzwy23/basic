package com.wisrc.webapp.controller;


import com.wisrc.webapp.entity.SysSecUser;
import com.wisrc.webapp.service.UserInfoService;
import io.servicecomb.provider.rest.common.RestSchema;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "应用首页控制器")
@RestSchema(schemaId = "test")
public class Index {

    @Autowired
    private UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "首页", notes = "应用服务首页服务")
    public String index() {
        return "hello world";
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
