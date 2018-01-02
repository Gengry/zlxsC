package com.zhonglianxs.erp.cpw.controller;


import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.CableStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private CableStorageService cableStorageService;

    @RequestMapping("/index")
    public String providerIndex(HttpSession session, ModelMap modelMap){
        return "storage/index.jsp";
    }

    @RequestMapping("/houseIndex")
    public String houseInfoIndex(){
        return "mate/house/index.jsp";
    }

    @RequestMapping(value = "/storage/list", method = RequestMethod.GET)
    @ResponseBody
    public Object houseList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableStorageExample cableStorageExample = new CableStorageExample();
//        CableHouseExample.Criteria criteria = cableHouseExample.createCriteria();
//        criteria.andCableHouseDeleteEqualTo(0).andCableHouseUserIdEqualTo((int)session.getAttribute("userId"));
        cableStorageExample.setOrderByClause("storage_update_time desc");
        List<CableStorage> rows = cableStorageService.selectByExampleForOffsetPage(cableStorageExample, offset, limit);
        long total = cableStorageService.countByExample(cableStorageExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }
}
