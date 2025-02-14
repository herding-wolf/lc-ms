package com.lc.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lc")
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String test(String request) {
        return "hello " + request;
    }
}
