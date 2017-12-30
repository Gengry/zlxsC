package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.CableCustomerService;
import com.zhonglianxs.erp.cpw.service.CableProviderService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import org.apache.commons.lang.StringUtils;
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
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CableProviderService cableProviderService;

    @Autowired
    private CableCustomerService cableCustomerService;

    @RequestMapping("/providerIndex")
    public String providerIndex(){
        return "customer/provider/index.jsp";
    }

    @RequestMapping(value = "/provider/list", method = RequestMethod.GET)
    @ResponseBody
    public Object providerList(HttpSession session,
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

    @RequestMapping(value = "/provider/create", method = RequestMethod.GET)
    public String providerCreate() {
        return "customer/provider/creat.jsp";
    }


    @ResponseBody
    @RequestMapping(value = "/provider/create", method = RequestMethod.POST)
    public Object providerCreate(CableProvider cableProvider,HttpSession session) {
        CableProviderExample cableProviderExample = new CableProviderExample();
        CableProviderExample.Criteria criteria = cableProviderExample.createCriteria();
        criteria.andProviderNameEqualTo(cableProvider.getProviderName()).andProviderDeleteEqualTo(0);
        int count = cableProviderService.countByExample(cableProviderExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableProvider.setProviderUserId((int)session.getAttribute("userId"));
        cableProvider.setProviderDelete(0);
        count = cableProviderService.insertSelective(cableProvider);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/provider/update/{id}", method = RequestMethod.GET)
    public String providerUpdate(@PathVariable("id") Integer id, ModelMap modelMap) {
        CableProvider cableProvider = cableProviderService.selectByPrimaryKey(id);
        modelMap.put("cableProvider", cableProvider);
        return "customer/provider/update.jsp";
    }

    @RequestMapping(value = "/provider/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object providerUpdate(@PathVariable("id") int id, CableProvider cableProvider) {
        cableProvider.setId(id);
        int count = cableProviderService.updateByPrimaryKeySelective(cableProvider);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/provider/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object providerDelete(@PathVariable("ids") String ids) {
        int count = cableProviderService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping("/customerIndex")
    public String customerIndex(){
        return "customer/customer/index.jsp";
    }

    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    @ResponseBody
    public Object customerList(HttpSession session,
                               @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                               @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                               @RequestParam(required = false, defaultValue = "", value = "providerName") String customerName,
                               @RequestParam(required = false, defaultValue = "", value = "providerContact") String customerContact,
                               @RequestParam(required = false, defaultValue = "", value = "providerTele") String customerTele,
                               @RequestParam(required = false, value = "sort") String sort,
                               @RequestParam(required = false, value = "order") String order) {
        CableCustomerExample cableCustomerExample = new CableCustomerExample();
        CableCustomerExample.Criteria criteria = cableCustomerExample.createCriteria();
        criteria.andCustomerDeleteEqualTo(0).andCustomerUserIdEqualTo((int)session.getAttribute("userId"));
        if(StringUtils.isNotBlank(customerName)){
            criteria.andCustomerNameLike("%"+customerName+"%");
        }
        if(StringUtils.isNotBlank(customerContact)){
            criteria.andCustomerContactLike("%"+customerContact+"%");
        }
        if(StringUtils.isNotBlank(customerTele)){
            criteria.andCustomerTeleLike("%"+customerTele+"%");
        }
        cableCustomerExample.setOrderByClause("customer_time desc");
        List<CableCustomer> rows = cableCustomerService.selectByExampleForOffsetPage(cableCustomerExample, offset, limit);
        long total = cableCustomerService.countByExample(cableCustomerExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/customer/create", method = RequestMethod.GET)
    public String customerCreate() {
        return "customer/customer/creat.jsp";
    }


    @ResponseBody
    @RequestMapping(value = "/customer/create", method = RequestMethod.POST)
    public Object customerCreate(CableCustomer cableCustomer,HttpSession session) {
        CableCustomerExample cableCustomerExample = new CableCustomerExample();
        CableCustomerExample.Criteria criteria = cableCustomerExample.createCriteria();
        criteria.andCustomerNameEqualTo(cableCustomer.getCustomerName()).andCustomerDeleteEqualTo(0);
        int count = cableCustomerService.countByExample(cableCustomerExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableCustomer.setCustomerUserId((int)session.getAttribute("userId"));
        cableCustomer.setCustomerDelete(0);
        count = cableCustomerService.insertSelective(cableCustomer);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/customer/update/{id}", method = RequestMethod.GET)
    public String customerUpdate(@PathVariable("id") Integer id, ModelMap modelMap) {
        CableCustomer cableCustomer = cableCustomerService.selectByPrimaryKey(id);
        modelMap.put("cableCustomer", cableCustomer);
        return "customer/customer/update.jsp";
    }

    @RequestMapping(value = "/customer/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object customerUpdate(@PathVariable("id") int id, CableCustomer cableCustomer) {
        cableCustomer.setId(id);
        int count = cableCustomerService.updateByPrimaryKeySelective(cableCustomer);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/customer/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object customerDelete(@PathVariable("ids") String ids) {
        int count = cableCustomerService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

}
