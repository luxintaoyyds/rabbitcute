package com.lxt.springbootdubbonacos.site.rabbitmq.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMqProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsgToDemoQueue(String msg){
        log.info("发送到demoQueue的消息为:"+msg);
        amqpTemplate.convertAndSend("demoQueue",msg);
    }

    public void sentFanout(String msg){
        log.info("发送到fanouot的消息为:"+msg);
        amqpTemplate.convertAndSend("fanoutExchange", "", msg);
    }




}
