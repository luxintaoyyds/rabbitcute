package com.lxt.springbootdubbonacos.site.annotation.example01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Example01 {

    private Human human1;

    private Human human2;


    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Example01 example01=new Example01();


        initFiled(example01);

        System.out.println(example01.human1);
        System.out.println(example01.human2);



    }


    public static void initFiled(Example01 example01) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class clazz=example01.getClass();
        Field field1=clazz.getDeclaredField("human1");
        Field field2=clazz.getDeclaredField("human2");

        Person person1=field1.getDeclaredAnnotation(Person.class);
        Person person2=field2.getDeclaredAnnotation(Person.class);

        Class clz=field2.getType();
        Constructor constructor=clz.getConstructor();
        Human human1=(Human) constructor.newInstance();
        Human human2=(Human) constructor.newInstance();

        human1.setName(person1.name());
        human1.setAge(person1.age());
        human1.setSex(person1.sex());

        human2.setName(person2.name());
        human2.setAge(person2.age());
        human2.setSex(person2.sex());

        field1.set(example01,human1);
        field2.set(example01,human2);

    }

}
