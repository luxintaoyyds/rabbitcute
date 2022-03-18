package com.lxt.springbootdubbonacos.site.user.controller;


import com.lxt.nacosdubboapi.dubboprovider.dto.UserDto;
import com.lxt.nacosdubboapi.dubboprovider.service.UserService;
import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;
import com.lxt.springbootdubbonacos.site.user.servcie.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "用户信息")
@RequestMapping("/user")
public class UserController {


    @Reference
    private UserService userService;

    @Resource
    private UserServiceImpl userServiceImpl;

    @PostMapping("/getUserInfo")
    @ApiOperation("获取用户信息")
    public List<UserDto> getUserInfo(@RequestParam String name){
        return userService.GetUserInfo(name);
    }

    @PostMapping("/batchInsert")
    @ApiOperation("批量新增用户信息")
    public Integer batchInsert(@RequestBody List<UserPojo> list){
        return userServiceImpl.batchInsert(list);
    }


}
