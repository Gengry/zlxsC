package com.zhonglianxs.erp.cpw.controller;

import com.github.pagehelper.PageHelper;
import com.zhonglianxs.erp.cpw.bean.UserInfo;
import com.zhonglianxs.erp.cpw.bean.UserInfoExample;
import com.zhonglianxs.erp.cpw.mapper.UserMapper;
import com.zhonglianxs.erp.cpw.service.UserInfoService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/login")
    @ResponseBody
    public Object login(String username, String password, HttpSession session){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUserNameEqualTo(username).andUserPassEqualTo(password).andUserDeleteEqualTo(0);
        UserInfo userInfo = userInfoService.selectFirstByExample(userInfoExample);
        if(userInfo!=null){
            session.setAttribute("userInfo",userInfo);
            session.setAttribute("userId",userInfo.getId());
            return new BaseResult(ResultConstant.SUCCESS,"/index");
        }else{
            return new BaseResult(ResultConstant.EMPTY_PASSWORD,"/index");
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("username");
        request.getSession().removeAttribute("password");
        // 跳回原地址
        String redirectUrl = "/";
        return "redirect:" + redirectUrl;
    }

    @RequestMapping("/index")
    public String index(){
        return "index.jsp";
    }
}
