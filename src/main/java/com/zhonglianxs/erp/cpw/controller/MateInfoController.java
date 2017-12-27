package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.mapper.CableInfoMapper;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mate")
public class MateInfoController {

    @Autowired
    private CableInfoService cableInfoService;

    @RequestMapping("/cableIndex")
    public String cableInfoIndex(){
        CableInfo cableInfo = cableInfoService.selectByPrimaryKey(1);

        return "mate/cable/index";
    }


    @RequestMapping(value = "/cable/create", method = RequestMethod.GET)
    public String create() {
        return "mate/cable/creat";
    }

}
