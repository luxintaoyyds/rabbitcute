package com.lxt.springbootdubbonacos.site.annotation.example03;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Boy {

    String name() default "";
}
