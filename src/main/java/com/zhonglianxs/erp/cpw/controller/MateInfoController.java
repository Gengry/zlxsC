package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.internal.constraintvalidators.hv.LengthValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        return "mate/cable/index.jsp";
    }

    @RequestMapping(value = "/cable/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(HttpSession session,
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "cableModel") String cableModel,
            @RequestParam(required = false, defaultValue = "", value = "cableSpec") String cableSpec,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order) {
        CableInfoExample cableInfoExample = new CableInfoExample();
        cableInfoExample.getOredCriteria();
        CableInfoExample.Criteria criteria = cableInfoExample.createCriteria();
        criteria.andCableDeleteEqualTo((short)0).andCableUserIdEqualTo((int)session.getAttribute("userId"));
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
        return "mate/cable/creat.jsp";
    }


    @ResponseBody
    @RequestMapping(value = "/cable/create", method = RequestMethod.POST)
    public Object create(CableInfo cableInfo,HttpSession session) {
        CableInfoExample cableInfoExample = new CableInfoExample();
        CableInfoExample.Criteria criteria = cableInfoExample.createCriteria();
        criteria.andCableModelEqualTo(cableInfo.getCableModel()).andCableSpecEqualTo(cableInfo.getCableSpec()).andCableDeleteEqualTo((short)0);
        int count = cableInfoService.countByExample(cableInfoExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableInfo.setCableUserId((int)session.getAttribute("userId"));
        cableInfo.setCableDelete((short)0);
        count = cableInfoService.insertSelective(cableInfo);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/cable/update/{cableInfoId}", method = RequestMethod.GET)
    public String update(@PathVariable("cableInfoId") Integer cableInfoId, ModelMap modelMap) {
        CableInfo cableInfo = cableInfoService.selectByPrimaryKey(cableInfoId);
        modelMap.put("cableInfo", cableInfo);
        return "mate/cable/update.jsp";
    }

    @RequestMapping(value = "/cable/update/{cableInfoId}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("cableInfoId") int cableInfoId, CableInfo cableInfo,HttpSession session) {
        cableInfo.setId(cableInfoId);
        int count = cableInfoService.updateByPrimaryKeySelective(cableInfo);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/cable/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = cableInfoService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

}
