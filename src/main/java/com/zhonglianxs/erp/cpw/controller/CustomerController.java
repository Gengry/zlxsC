package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import com.zhonglianxs.erp.cpw.bean.CableProvider;
import com.zhonglianxs.erp.cpw.bean.CableProviderExample;
import com.zhonglianxs.erp.cpw.service.CableProviderService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CableProviderService cableProviderService;

    @RequestMapping("/providerIndex")
    public String cableInfoIndex(){
        return "customer/provider/index.jsp";
    }

    @RequestMapping(value = "/provider/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(HttpSession session,
                       @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                       @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                       @RequestParam(required = false, defaultValue = "", value = "providerName") String providerName,
                       @RequestParam(required = false, defaultValue = "", value = "providerContact") String providerContact,
                       @RequestParam(required = false, defaultValue = "", value = "providerTele") String providerTele,
                       @RequestParam(required = false, value = "sort") String sort,
                       @RequestParam(required = false, value = "order") String order) {
        CableProviderExample cableProviderExample = new CableProviderExample();
        CableProviderExample.Criteria criteria = cableProviderExample.createCriteria();
        criteria.andProviderDeleteEqualTo(0).andProviderUserIdEqualTo((int)session.getAttribute("userId"));
        if(StringUtils.isNotBlank(providerName)){
            criteria.andProviderNameLike("%"+providerName+"%");
        }
        if(StringUtils.isNotBlank(providerContact)){
            criteria.andProviderContactLike("%"+providerContact+"%");
        }
        if(StringUtils.isNotBlank(providerTele)){
            criteria.andProviderTeleLike("%"+providerTele+"%");
        }
        cableProviderExample.setOrderByClause("provider_time desc");
        List<CableProvider> rows = cableProviderService.selectByExampleForOffsetPage(cableProviderExample, offset, limit);
        long total = cableProviderService.countByExample(cableProviderExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

}
