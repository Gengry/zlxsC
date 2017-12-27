package com.zhonglianxs.erp.cpw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mate")
public class MateInfoController {

    @RequestMapping("/cableIndex")
    public String cableInfoIndex(){
        return "mate/cable/index";
    }

}
