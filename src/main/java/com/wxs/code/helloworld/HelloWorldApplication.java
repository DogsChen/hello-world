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


    @GetMapping("t1")
    public String aa() {
        return "update-t1" + System.currentTimeMillis();
    }

    @GetMapping("t2")
    public String t2(HttpServletRequest request) {
        return "t2" + request.getHeaderNames() + "-" + System.currentTimeMillis();
    }
    @GetMapping("t3")
    public String t3(HttpServletRequest request) {
        return "t3" + request.getHeaderNames() + "-" + System.currentTimeMillis();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloWorldApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        System.out.println("项目启动成功！envs:\n" + environment.getSystemProperties());
    }
}
