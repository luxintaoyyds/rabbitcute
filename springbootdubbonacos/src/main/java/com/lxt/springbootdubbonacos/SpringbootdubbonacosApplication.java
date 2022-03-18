package com.lxt.springbootdubbonacos;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.lxt.springbootdubbonacos.site.**.mapper")
@SpringBootApplication
@EnableKafka
@EnableSwagger2
@EnableDubbo
//开启@Asycn 注解扫描
@EnableAsync
public class SpringbootdubbonacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdubbonacosApplication.class, args);
    }

}
