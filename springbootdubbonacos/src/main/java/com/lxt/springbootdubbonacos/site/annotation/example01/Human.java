package com.lxt.springbootdubbonacos.site.annotation.example01;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Human {

    private String name;
    private int age;
    private SexEnum sex;


}
