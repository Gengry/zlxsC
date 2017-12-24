package com.zhonglianxs.erp.cpw.controller;

import com.github.pagehelper.PageHelper;
import com.zhonglianxs.erp.cpw.mapper.UserMapper;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Value("${login.username}")
    private String usernameSys;

    @Value("${login.password}")
    private String passwordSys;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/login")
    @ResponseBody
    public Object login(String username, String password, HttpSession session){
        if(this.usernameSys.equals(username)&&this.passwordSys.equals(password)){
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            Map user = userMapper.select(1);
            PageHelper.offsetPage(0,2);
            List<Map<String,Object>> users = userMapper.listUser();
            System.out.println(user);
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
