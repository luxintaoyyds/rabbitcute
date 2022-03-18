package com.lxt.springbootdubbonacos.site.annotation.example01;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Person {

    String name() default "";

    int age() default 18;

    SexEnum sex() default SexEnum.NORMAL;




}
