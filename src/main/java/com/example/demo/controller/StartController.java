package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StartController {
    @RequestMapping("/springboot")
    public String startSpringBoot() {
        System.out.println("本地修改！");
        return "Welcome to the world of Spring Boot! 哈哈哈哈冲突测试！";
    }
}
