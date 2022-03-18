package com.lxt.nacosconsumer.site.user.controller;


import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;
import com.lxt.nacosdubboapi.dubboprovider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "用户信息")
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @PostMapping("/getUserInfo")
    @ApiOperation("获取用户信息")
    public List<UserDto> getUserInfo(@RequestParam("name") String name){
        return userService.GetUserInfo(name);
    }

}
