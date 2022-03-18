package com.lxt.nacosconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
@MapperScan("com.lxt.nacosconsumer.site.**.mapper")
public class NacosconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosconsumerApplication.class, args);
	}

}
