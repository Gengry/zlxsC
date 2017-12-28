package com.zhonglianxs.erp.cpw.controller;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import com.zhonglianxs.erp.cpw.mapper.CableInfoMapper;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.validator.internal.constraintvalidators.bv.NotNullValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.LengthValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/mate")
public class MateInfoController {

    @Autowired
    private CableInfoService cableInfoService;

    @RequestMapping("/cableIndex")
    public String cableInfoIndex(){
        return "mate/cable/index";
    }

    @RequestMapping(value = "/cable/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "cableModel") String cableModel,
            @RequestParam(required = false, defaultValue = "", value = "cableSpec") String cableSpec,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        CableInfoExample cableInfoExample = new CableInfoExample();
        cableInfoExample.getOredCriteria();
        CableInfoExample.Criteria criteria = cableInfoExample.createCriteria();
        criteria.andCableDeleteEqualTo((short)0);
        if(StringUtils.isNotBlank(cableModel)){
            criteria.andCableModelEqualTo(cableModel);
        }
        if(StringUtils.isNotBlank(cableSpec)){
            criteria.andCableSpecEqualTo(cableSpec);
        }
        cableInfoExample.setOrderByClause("cable_model");
        List<CableInfo> rows = cableInfoService.selectByExampleForOffsetPage(cableInfoExample, offset, limit);
        long total = cableInfoService.countByExample(cableInfoExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/cable/create", method = RequestMethod.GET)
    public String create(HttpServletRequest request,String cableModel) {
        request.setAttribute("cableModel",cableModel);
        return "mate/cable/creat";
    }


    @ResponseBody
    @RequestMapping(value = "/cable/create", method = RequestMethod.POST)
    public Object create(CableInfo cableInfo) {
        CableInfoExample cableInfoExample = new CableInfoExample();
        CableInfoExample.Criteria criteria = cableInfoExample.createCriteria();
        criteria.andCableModelEqualTo(cableInfo.getCableModel()).andCableSpecEqualTo(cableInfo.getCableSpec()).andCableDeleteEqualTo((short)0);
        int count = cableInfoService.countByExample(cableInfoExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        //查询这个规格型号的线缆是否存在
        cableInfo.setCableDelete((short)0);
        count = cableInfoService.insertSelective(cableInfo);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

}
