package com.lxt.springbootdubbonacos.site.annotation.example03;


import org.springframework.stereotype.Service;

@Service
public class Hello {

    @Boy(name = "小明")
    String name;

    public void say(){
        System.out.println("hello"+name);
    }
}
