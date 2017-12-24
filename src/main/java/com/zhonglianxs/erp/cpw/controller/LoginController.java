package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Value("${login.username}")
    private String username;

    @Value("${login.password}")
    private String password;

    @RequestMapping("/login")
    @ResponseBody
    public Object login(String username,String password){
        if(this.username.equals(username)&&this.password.equals(password)){
            return new BaseResult(ResultConstant.SUCCESS,"/index");
        }else{
            return new BaseResult(ResultConstant.EMPTY_PASSWORD,"/index");
        }
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
