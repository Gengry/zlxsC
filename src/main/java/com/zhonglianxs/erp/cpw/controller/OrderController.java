package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.*;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.UnitConstant;
import com.zhonglianxs.erp.cpw.vo.OrderInVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private CableProviderService cableProviderService;
    @Autowired
    private CableInfoService cableInfoService;
    @Autowired
    private CableColorService cableColorService;
    @Autowired
    private CableQualityService cableQualityService;
    @Autowired
    private CableHouseService cableHouseService;


    @RequestMapping("/inIndex")
    public String providerIndex(HttpSession session, ModelMap modelMap){
        CableProviderExample cableProviderExample = new CableProviderExample();
        cableProviderExample.createCriteria().andProviderUserIdEqualTo((int)session.getAttribute("userId")).andProviderDeleteEqualTo(0);
        List<CableProvider> cableProviders = cableProviderService.selectByExample(cableProviderExample);
        modelMap.put("cableProviders",cableProviders);
        return "order/orderIn.jsp";
    }

    @RequestMapping(value = "/orderIn/create",method = RequestMethod.GET)
    public String orderInCreate(HttpSession session, ModelMap modelMap){
        CableInfoExample cableInfoExample = new CableInfoExample();
        cableInfoExample.createCriteria().andCableUserIdEqualTo((int)session.getAttribute("userId")).andCableDeleteEqualTo((short)0);
        List<String> cableModels = cableInfoService.getModelByUser((int)session.getAttribute("userId"));
        modelMap.put("cableModels",cableModels);
        CableColorExample cableColorExample = new CableColorExample();
        cableColorExample.createCriteria().andColorUserIdEqualTo((int)session.getAttribute("userId")).andColorDeleteEqualTo(0);
        List<CableColor> cableColors = cableColorService.selectByExample(cableColorExample);
        modelMap.put("cableColors",cableColors);
        CableQualityExample cableQualityExample = new CableQualityExample();
        cableQualityExample.createCriteria().andQualityUserIdEqualTo((int)session.getAttribute("userId")).andQualityDeleteEqualTo(0);
        List<CableQuality> cableQualities = cableQualityService.selectByExample(cableQualityExample);
        modelMap.put("cableQualities",cableQualities);
        List<String> units = new ArrayList<String>();
        units.add(UnitConstant.MI.getUnit());
        units.add(UnitConstant.PAN.getUnit());
        modelMap.put("units",units);
        CableHouseExample cableHouseExample = new CableHouseExample();
        cableHouseExample.createCriteria().andCableHouseUserIdEqualTo((int)session.getAttribute("userId")).andCableHouseDeleteEqualTo(0);
        List<CableHouse> cableHouses = cableHouseService.selectByExample(cableHouseExample);
        modelMap.put("cableHouses",cableHouses);
        return "order/orderInCreate.jsp";
    }

    @RequestMapping("getSpecByModel")
    @ResponseBody
    public Object getSpecByModel(HttpSession session,String model){
        List<String> specs = cableInfoService.getSpecByModel((int)session.getAttribute("userId"),model);
        return new BaseResult(1,"ok",specs);
    }

    @RequestMapping("getProviderInfoById")
    @ResponseBody
    public Object getProviderInfoById(HttpSession session,Integer id){
        CableProvider cableProvider = cableProviderService.selectByPrimaryKey(id);
        return new BaseResult(1,"ok",cableProvider);
    }

    @RequestMapping(value = "/orderIn/create",method = RequestMethod.POST)
    public Object OrderInCreate(OrderInVo orderInVo){
        System.out.println(orderInVo);
        return null;
    }
}
