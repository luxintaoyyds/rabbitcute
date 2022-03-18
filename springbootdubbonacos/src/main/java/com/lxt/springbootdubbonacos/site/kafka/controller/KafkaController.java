package com.lxt.springbootdubbonacos.site.kafka.controller;


import com.lxt.springbootdubbonacos.site.kafka.provider.KafkaProducer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * kafka监控类
 * @author lxt
 * */

@Api(tags = "kafka控制器")
@RequestMapping("/kafka")
@RestController
@Slf4j
public class KafkaController {

    @Resource
    private KafkaProducer kafkaProducer;

    @ApiOperation("向主题topic发送消息")
    @PostMapping("/sendMsg")
    public void sendMsg(String topic,String msg){
        log.info("发送的消息为："+msg);
        kafkaProducer.sendMsg(topic,msg);
    }

    @ApiOperation("向主题topic批量发送消息")
    @PostMapping("/sendBatchMsg")
    public void sendBatchMsg(String topic, List<String> msg){
        log.info("发送的消息为："+msg);
        kafkaProducer.sendBatchMsg(topic,msg);
    }

}
