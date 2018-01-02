package com.zhonglianxs.erp.cpw.controller;


import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.CableColorService;
import com.zhonglianxs.erp.cpw.service.CableStorageService;
import com.zhonglianxs.erp.cpw.util.BaseResult;
import com.zhonglianxs.erp.cpw.util.ResultConstant;
import com.zhonglianxs.erp.cpw.util.UnitConstant;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private CableStorageService cableStorageService;
    private CableColorService cableColorService;

    @RequestMapping("/index")
    public String providerIndex(HttpSession session, ModelMap modelMap){
        List<String> units = new ArrayList<String>();
        units.add(UnitConstant.MI.getUnit());
        units.add(UnitConstant.PAN.getUnit());
        modelMap.addAttribute("units",units);
        return "storage/index.jsp";
    }


    @RequestMapping(value = "/storage/list", method = RequestMethod.GET)
    @ResponseBody
    public Object houseList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                            @RequestParam(required = false, value = "searchModel") String searchModel,
                            @RequestParam(required = false, value = "searchSpec") String searchSpec,
                            @RequestParam(required = false, value = "searchUnit") String searchUnit,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableStorageExample cableStorageExample = new CableStorageExample();
        CableStorageExample.Criteria criteria = cableStorageExample.createCriteria();
        criteria.andStorageDeleteEqualTo(0).andStorageUserIdEqualTo((int)session.getAttribute("userId")).andStorageNumberGreaterThan(BigDecimal.ZERO);
        if(StringUtils.isNotBlank(searchModel)){
            criteria.andStorageModelEqualTo(searchModel);
        }
        if(StringUtils.isNotBlank(searchSpec)){
            criteria.andStorageSpecLike("%"+searchSpec+"%");
        }
        if(StringUtils.isNotBlank(searchUnit)&&!searchUnit.equals("NULL")){
            criteria.andStorageUnitEqualTo(searchUnit);
        }
        cableStorageExample.setOrderByClause("storage_update_time desc");
        List<CableStorage> rows = cableStorageService.selectByExampleForOffsetPage(cableStorageExample, offset, limit);
        long total = cableStorageService.countByExample(cableStorageExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/storage/updateNum/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Object updateNum(@PathVariable Integer id,String num){
        CableStorage cableStorage = new CableStorage();
        cableStorage.setId(id);
        cableStorage.setStorageNumber(new BigDecimal(num));
        int count = cableStorageService.updateByPrimaryKeySelective(cableStorage);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/storage/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object houseDelete(@PathVariable("ids") String ids) {
        int count = cableStorageService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }
}
