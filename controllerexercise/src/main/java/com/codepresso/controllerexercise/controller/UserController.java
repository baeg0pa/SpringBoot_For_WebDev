package com.codepresso.controllerexercise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/paid")
    public String getPaindUser() {
        return "I'm a paid user.";
    }

    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }
}
