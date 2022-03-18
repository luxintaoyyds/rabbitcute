package com.lxt.springbootdubbonacos.site.rabbitmq.controller;


import com.lxt.springbootdubbonacos.site.rabbitmq.provider.RabbitMqProvider;
import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Api(tags = "rabbitmq消息中心")
@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqController {


    @Resource
    private RabbitMqProvider rabbitMqProvider;

    @ApiOperation("发送消息到demoQueue")
    @PostMapping("/sendMsgToDemoQueue")
    public void sendMsgToDemoQueue(@RequestParam String msg){
        rabbitMqProvider.sendMsgToDemoQueue(msg);
    }

    @PostMapping("/sendFanoutMessage")
    @ApiOperation("广播(多个队列)模式发送消息")
    public Object sendFanout(@RequestParam String msg) {
        rabbitMqProvider.sentFanout(msg);
        return "success";
    }



}
