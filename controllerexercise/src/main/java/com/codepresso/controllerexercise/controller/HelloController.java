package com.codepresso.controllerexercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @RestController
// public class HelloController {
    
//     @RequestMapping(value = "/")
//     public String hello() {
//         return "Hello";
//     }
// }


@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}