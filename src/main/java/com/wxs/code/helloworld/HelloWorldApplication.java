package com.wxs.code.helloworld;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {


    @GetMapping("t")
    public String t(String name) {
        return "now："+name +" - " + System.currentTimeMillis();
    }

    @GetMapping("t1")
    public String aa(Integer age) {
        return "t1- "+age+" - " + System.currentTimeMillis();
    }

    @GetMapping("t2")
    public String t2(HttpServletRequest request) {
        return "t2" + request.getHeaderNames() + "-" + System.currentTimeMillis();
    }
//    @GetMapping("t3")
//    public String t3(HttpServletRequest request) {
//        return "t3" + request.getHeaderNames() + "-" + System.currentTimeMillis();
//    }
//
//    @GetMapping("t4")
//    public String t4(HttpServletRequest request) {
//        return "t4" + request.getRequestURL() + "-" + System.currentTimeMillis();
//    }
//
//    @GetMapping("t5")
//    public String t5(HttpServletRequest request) {
//        return "t5" + request.getRequestURL() + "-" + System.currentTimeMillis();
//    }
//    @GetMapping("t6")
//    public String t6(HttpServletRequest request) {
//        return "t6-" + request.getRequestURL() + "-" + System.currentTimeMillis();
//    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloWorldApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        System.out.println("项目启动成功！envs:\n" + environment.getSystemProperties());
    }
}
