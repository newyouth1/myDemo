package com.example.demo.controller;

import com.example.demo.config.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/test")
public class ConfigController {
    private static final Logger LOGGER =  LoggerFactory.getLogger(ConfigController.class);
    @Value("${url.orderUrl}")
    private String orderUrl;
    @Resource
    private MicroServiceUrl microServiceUrl;
    @RequestMapping("/config")
    public String testConfig(){
        LOGGER.info("=====获取的订单服务地址为:{}", orderUrl);
        //LOGGER.info("{}", orderUrl);
        // 使用配置类来获取
        LOGGER.info("=====获取的订单服务地址为:{}",microServiceUrl.getOrderUrl());
        LOGGER.info("=====获取的用户服务地址为:{}", microServiceUrl.getUserUrl());
        LOGGER.info("=====获取的购物车服务地址为:{}", microServiceUrl.getShoppingUrl());

        LOGGER.debug("=====测试日志debug级别打印====");
        LOGGER.info("======测试日志info级别打印=====");
        LOGGER.error("=====测试日志error级别打印====");
        LOGGER.warn("======测试日志warn级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str = "Spring Boot!";
        LOGGER.info("======Welcome to the world of {}",str);
        return "success";
    }
}

