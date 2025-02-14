package com.lc.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yz_luochong
 * @date 2021/9/18
 */
@SpringBootApplication
@ComponentScan({"com.lc.*"})
@EnableAspectJAutoProxy(exposeProxy = true)
public class StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class, args);
    }
}
