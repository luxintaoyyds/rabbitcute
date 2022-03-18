package com.lxt.springbootdubbonacos.site.annotation.main;

import org.apache.kafka.common.protocol.types.Field;

public class LxtMain {

    @Lxt("XIAOTAO")
    static String name;

    public static void main(String[] args) {
        get();
/*
        try {
            Field field = MyAno.class.getDeclaredField("value");//获取成员变量value
            field.setAccessible(true);//将value设置成可访问的
            if(field.isAnnotationPresent(Lxt.class)){//判断成员变量是否有注解
                Lxt myAnnotation = field.getAnnotation(Lxt.class);//获取定义在成员变量中的注解MyAnnotation
                String value = myAnnotation.value();//获取定义在MyBean的MyAnnotation里面属性值
                MyAno myBean=new MyAno();
                field.set(myBean, value);//将注解的值20可以赋给成员变量value
                System.out.println(myBean);//验证结果
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }

    public static void get(){
        MyAno myAno=new MyAno();
        myAno.setName(name);
        System.out.println(name);
    }



}
