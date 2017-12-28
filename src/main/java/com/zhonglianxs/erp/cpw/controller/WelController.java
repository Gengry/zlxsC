package com.zhonglianxs.erp.cpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelController {

    @RequestMapping("/")
    public String welcome(){
        return "login.jsp";
    }
}
