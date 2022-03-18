package com.lxt.springbootdubbonacos.site.kafka.provider;


import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * 单条向topic里面发送消息
     * */
    public void sendMsg(String topic,String msg){
        log.info("向主题"+topic+"发送了消息："+msg);
        kafkaTemplate.send(topic,msg);
    }

    /**
     *批量向topic发送消息
     * */
    public void sendBatchMsg(String topic, List<String> msgs){
        log.info("向主题"+topic+"批量发送了消息："+msgs);
        msgs.forEach(msg->kafkaTemplate.send(topic,msg));
    }




}
