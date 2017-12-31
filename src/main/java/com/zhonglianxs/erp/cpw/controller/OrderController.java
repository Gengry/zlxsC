package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import com.zhonglianxs.erp.cpw.bean.CableProvider;
import com.zhonglianxs.erp.cpw.bean.CableProviderExample;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import com.zhonglianxs.erp.cpw.service.CableProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private CableProviderService cableProviderService;
    @Autowired
    private CableInfoService cableInfoService;

    @RequestMapping("/inIndex")
    public String providerIndex(HttpSession session, ModelMap modelMap){
        CableProviderExample cableProviderExample = new CableProviderExample();
        cableProviderExample.createCriteria().andProviderUserIdEqualTo((int)session.getAttribute("userId")).andProviderDeleteEqualTo(0);
        List<CableProvider> cableProviders = cableProviderService.selectByExample(cableProviderExample);
        modelMap.put("cableProviders",cableProviders);

        return "order/orderIn.jsp";
    }

    @RequestMapping("/orderIn/create")
    public String orderInCreate(HttpSession session, ModelMap modelMap){
        CableInfoExample cableInfoExample = new CableInfoExample();
        cableInfoExample.createCriteria().andCableUserIdEqualTo((int)session.getAttribute("userId")).andCableDeleteEqualTo((short)0);
        List<String> cableModels = cableInfoService.getModelByUser((int)session.getAttribute("userId"));
        modelMap.put("cableModels",cableModels);
        return "order/orderInCreate.jsp";
    }

}
