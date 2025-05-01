package com.eazybytes.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class LoginError {
    @RequestMapping(value = "/login?error", method = {RequestMethod.GET})
    public String displayLoginPage() {
        return "loginError.html";
    }

}
