package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 祁宏钢
 * @date 2018/6/18
 */
@Controller
@EnableAutoConfiguration
public class SimpleControllor {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return SimpleService.getService();
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SimpleControllor.class,args);
    }
}
