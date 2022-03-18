package com.lxt.springbootdubbonacos.site.annotation.main;


import java.lang.annotation.*;


/**
 * @description 给属性赋值，与@{LoadProperty}配套使用
 */
/*
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.PARAMETER})
public @interface Lxt {
    int value();
}*/
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Lxt {
    String value();
}