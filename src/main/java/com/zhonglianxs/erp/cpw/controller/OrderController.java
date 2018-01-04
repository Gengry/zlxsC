package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.*;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import com.zhonglianxs.erp.cpw.util.UnitConstant;
import com.zhonglianxs.erp.cpw.vo.OrderInVo;
import com.zhonglianxs.erp.cpw.vo.OrderOutVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private CableOrderService cableOrderService;
    @Autowired
    private CableCustomerService cableCustomerService;
    @Autowired
    private CableStorageService cableStorageService;
    @Autowired
    private CableOrderItemService cableOrderItemService;

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

    @RequestMapping("getCustomerInfoById")
    @ResponseBody
    public Object getCustomerInfoById(HttpSession session,Integer id){
        CableCustomer cableCustomer = cableCustomerService.selectByPrimaryKey(id);
        return new BaseResult(1,"ok",cableCustomer);
    }

    @RequestMapping(value = "/orderIn/create",method = RequestMethod.POST)
    @ResponseBody
    public Object OrderInCreate(HttpSession session,OrderInVo orderInVo){
        return cableOrderService.createOrder(orderInVo,(int)session.getAttribute("userId"));
    }


    @RequestMapping("/outIndex")
    public String customerIndex(HttpSession session, ModelMap modelMap){
        CableCustomerExample cableCustomerExample = new CableCustomerExample();
        cableCustomerExample.createCriteria().andCustomerUserIdEqualTo((int)session.getAttribute("userId")).andCustomerDeleteEqualTo(0);
        List<CableCustomer> cableCustomer = cableCustomerService.selectByExample(cableCustomerExample);
        modelMap.put("cableCustomer",cableCustomer);
        return "order/orderOut.jsp";
    }

    @RequestMapping(value = "/orderOut/create",method = RequestMethod.GET)
    public String orderOutCreate(HttpSession session, ModelMap modelMap){
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
        return "order/orderOutCreate.jsp";
    }

    @RequestMapping(value = "/orderOut/create",method = RequestMethod.POST)
    @ResponseBody
    public Object orderOut(HttpSession session,OrderOutVo orderOutVo){
        return cableOrderService.createOutOrder(orderOutVo,(int)session.getAttribute("userId"));
    }

    @RequestMapping("/order/index")
    public String orderIndex(){
        return "order/index.jsp";
    }

    @RequestMapping(value = "/order/list", method = RequestMethod.GET)
    @ResponseBody
    public Object orderList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                            @RequestParam(required = false, value = "searchCode") String searchCode,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableOrderExample cableOrderExample = new CableOrderExample();
        CableOrderExample.Criteria criteria = cableOrderExample.createCriteria();
        criteria.andOrderDeleteEqualTo(0).andOrderUserIdEqualTo((int)session.getAttribute("userId"));
        if(StringUtils.isNotBlank(searchCode)){
            criteria.andOrderCodeLike(searchCode+"%");
        }
        cableOrderExample.setOrderByClause("order_time desc");
        List<CableOrder> rows = cableOrderService.selectByExampleForOffsetPage(cableOrderExample, offset, limit);
        long total = cableOrderService.countByExample(cableOrderExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/order/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object houseDelete(@PathVariable("ids") String ids) {
        int count = cableOrderService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/getCableStorage",method = RequestMethod.GET)
    @ResponseBody
    public Object getCableStorage(HttpSession session,String model,String spec,String qulity,String unit,String color ,String house) {
        CableStorageExample cableStorageExample = new CableStorageExample();
        cableStorageExample.createCriteria().andStorageDeleteEqualTo(0).andStorageUserIdEqualTo((int)session.getAttribute("userId"))
                .andStorageModelEqualTo(model).andStorageSpecEqualTo(spec).andStorageQualityEqualTo(qulity).andStorageUnitEqualTo(unit)
                .andStorageColorEqualTo(color).andStorageHouseEqualTo(house);
        List<CableStorage> cableStorages = cableStorageService.selectByExample(cableStorageExample);
        return new BaseResult(ResultConstant.SUCCESS, cableStorages);
    }

    @RequestMapping("/order/detail/{id}")
    public String orderDetail(HttpSession session, ModelMap modelMap,@PathVariable String id){
        modelMap.put("id",id);
        return "order/detailIndex.jsp";
    }

    @RequestMapping(value = "/detail/list", method = RequestMethod.GET)
    @ResponseBody
    public Object orderDetailList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                                  @RequestParam(required = true, value = "orderId") String orderId,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableOrderItemExample cableOrderItemExample = new CableOrderItemExample();
        CableOrderItemExample.Criteria criteria = cableOrderItemExample.createCriteria();
        criteria.andItemDeleteEqualTo(0).andItemOrderIdEqualTo(Integer.parseInt(orderId));
        cableOrderItemExample.setOrderByClause("id asc");
        List<CableOrderItem> rows = cableOrderItemService.selectByExampleForOffsetPage(cableOrderItemExample, offset, limit);
        long total = cableOrderItemService.countByExample(cableOrderItemExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }
}
