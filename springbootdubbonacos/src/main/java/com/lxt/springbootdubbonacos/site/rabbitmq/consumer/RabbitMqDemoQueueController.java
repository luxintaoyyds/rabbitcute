package com.lxt.springbootdubbonacos.site.rabbitmq.consumer;


import com.lxt.springbootdubbonacos.site.user.pojo.UserPojo;
import com.lxt.springbootdubbonacos.site.user.servcie.UserServicelxt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
@RabbitListener(queues = "demoQueue")
public class RabbitMqDemoQueueController {

    /**
     * 通过@RabbitListener 监听接受到的消息msg 在消费的时候可以对这个消息进行消费处理
     * */

    @Resource
    private UserServicelxt userService;

    @RabbitHandler
    public void reciveMsg(String msg){
        log.info("接收到的消息为："+msg);
    }



}
