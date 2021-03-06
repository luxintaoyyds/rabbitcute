package com.lxt.springbootdubbonacos.site.rabbitmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class RabbitMqFanoutCConsumer {

    @RabbitListener(queues = "fanout.c")
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[fanout.c] 接收到的消息为: " + msg);
    }


}
