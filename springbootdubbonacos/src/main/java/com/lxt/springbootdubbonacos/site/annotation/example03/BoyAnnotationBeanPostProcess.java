package com.lxt.springbootdubbonacos.site.annotation.example03;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component //bean后置处理器本身就是一个bean
public class BoyAnnotationBeanPostProcess implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //利用反射机制注入属性
        Field[] fields=bean.getClass().getDeclaredFields();
        for(Field field:fields){
            Boy annotation=field.getAnnotation(Boy.class);
            if (annotation==null){
                continue;
            }else {
                field.setAccessible(true);
                try{
                    field.set(bean,annotation.name());

                }catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


}
