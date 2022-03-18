package com.lxt.springbootdubbonacos.site.annotation.example03;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "annotation信息")
@RestController
@RequestMapping("/boyannotation")
public class BoyController {

    @PostMapping("/getAnnotation")
    @ApiOperation("获取boy注解内容")
    public void getAnnotation(){
        Hello hello=new Hello();
        hello.say();
    }


}
