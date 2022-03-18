package com.lxt.springbootdubbonacos.site.annotation.example03;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.lxt.springbootdubbonacos.site.annotation.example03")
public class Example {





    public static void main(String[] args) throws ClassNotFoundException {
        //4种获取类成员结构的方法

        /*Class<?> clazz1=new Example().getClass();

        Class<?> clazz2=Class.forName("com.lxt.springbootdubbonacos.site.annotation.example03.Example");

        Class<?> clazz3=Main.class.getClassLoader().loadClass("com.hncboy.corejava.reflection.Boy");

        Class<?> clazz4=Example.class;*/


        ApplicationContext context=new AnnotationConfigApplicationContext(new Example().getClass());
        Hello hello=context.getBean(Hello.class);
        hello.say();
    }
}
