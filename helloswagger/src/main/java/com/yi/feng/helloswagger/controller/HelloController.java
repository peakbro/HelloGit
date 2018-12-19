package com.yi.feng.helloswagger.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "欢迎使用Swagger2",tags = "欢迎使用Swagger2")
@RequestMapping
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }
}
