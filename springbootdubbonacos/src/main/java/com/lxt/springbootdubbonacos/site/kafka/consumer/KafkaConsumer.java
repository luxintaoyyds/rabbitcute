package com.lxt.springbootdubbonacos.site.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class KafkaConsumer {

    /**
     * 监听topic1主题,单条消费
     */
    @KafkaListener(topics = "topic1")
    public void listen0(ConsumerRecord<String, String> record) {
        consumer(record);
    }

    /**
     * 监听topic2主题,单条消费
     */
    @KafkaListener(topics = "topic2")
    public void listen1(ConsumerRecord<String, String> record) {
        consumer(record);
    }

    /**
     * 监听topic3和topic4,单条消费
     */
    @KafkaListener(topics = {"topic3", "topic4"})
    public void listen2(ConsumerRecord<String, String> record) {
        consumer(record);
    }


    /**
     * 单条消费
     */
    public void consumer(ConsumerRecord<String, String> record) {
        log.debug("主题:{}, 内容: {}", record.topic(), record.value());
    }

    /**
     * 批量消费
     */
    @KafkaListener(topics = "topic1")
    public void batchConsumer(List<ConsumerRecord<String, String>> records) {
        records.forEach(record -> consumer(record));
    }
}
