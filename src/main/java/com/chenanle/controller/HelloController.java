package com.chenanle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenanle on 2018/6/8.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say() {
        return "Hello springboot!";
    }

}
