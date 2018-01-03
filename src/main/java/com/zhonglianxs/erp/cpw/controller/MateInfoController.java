package com.zhonglianxs.erp.cpw.controller;

import com.zhonglianxs.erp.cpw.bean.*;
import com.zhonglianxs.erp.cpw.service.CableColorService;
import com.zhonglianxs.erp.cpw.service.CableHouseService;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import com.zhonglianxs.erp.cpw.service.CableQualityService;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/mate")
public class MateInfoController {

    @Autowired
    private CableInfoService cableInfoService;
    @Autowired
    private CableHouseService cableHouseService;
    @Autowired
    private CableColorService cableColorService;
    @Autowired
    private CableQualityService cableQualityService;

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
        CableInfoExample.Criteria criteria = cableInfoExample.createCriteria();
        criteria.andCableDeleteEqualTo((short)0).andCableUserIdEqualTo((int)session.getAttribute("userId"));
        if(StringUtils.isNotBlank(cableModel)){
            criteria.andCableModelLike("%"+cableModel+"%");
        }
        if(StringUtils.isNotBlank(cableSpec)){
            criteria.andCableSpecLike("%"+cableSpec+"%");
        }
        cableInfoExample.setOrderByClause("cable_time desc");
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
    public Object update(HttpSession session,@PathVariable("cableInfoId") int cableInfoId, CableInfo cableInfo) {
        CableInfo info = cableInfoService.selectByPrimaryKey(cableInfoId);
        cableInfo.setId(cableInfoId);
        cableInfo.setCableUserId(info.getCableUserId());
        cableInfo.setCableDelete((short)0);
        cableInfo.setCableTime(info.getCableTime());
        int count = cableInfoService.updateByPrimaryKey(cableInfo);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/cable/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = cableInfoService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping("/houseIndex")
    public String houseInfoIndex(){
        return "mate/house/index.jsp";
    }

    @RequestMapping(value = "/house/list", method = RequestMethod.GET)
    @ResponseBody
    public Object houseList(HttpSession session,
                       @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                       @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                       @RequestParam(required = false, value = "sort") String sort,
                       @RequestParam(required = false, value = "order") String order) {
        CableHouseExample cableHouseExample = new CableHouseExample();
        CableHouseExample.Criteria criteria = cableHouseExample.createCriteria();
        criteria.andCableHouseDeleteEqualTo(0).andCableHouseUserIdEqualTo((int)session.getAttribute("userId"));
        cableHouseExample.setOrderByClause("cable_house_time desc");
        List<CableHouse> rows = cableHouseService.selectByExampleForOffsetPage(cableHouseExample, offset, limit);
        long total = cableHouseService.countByExample(cableHouseExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/house/create", method = RequestMethod.GET)
    public String houseCreate() {
        return "mate/house/creat.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/house/create", method = RequestMethod.POST)
    public Object houseCreate(CableHouse cableHouse,HttpSession session) {
        CableHouseExample cableHouseExample = new CableHouseExample();
        CableHouseExample.Criteria criteria = cableHouseExample.createCriteria();
        criteria.andCableHouseNameEqualTo(cableHouse.getCableHouseName()).andCableHouseAddressEqualTo(cableHouse.getCableHouseAddress()).andCableHouseDeleteEqualTo(0);
        int count = cableHouseService.countByExample(cableHouseExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableHouse.setCableHouseUserId((int)session.getAttribute("userId"));
        cableHouse.setCableHouseDelete(0);
        count = cableHouseService.insertSelective(cableHouse);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/house/update/{id}", method = RequestMethod.GET)
    public String houseUpdate(@PathVariable("id") Integer id, ModelMap modelMap) {
        CableHouse cableHouse = cableHouseService.selectByPrimaryKey(id);
        modelMap.put("cableHouse", cableHouse);
        return "mate/house/update.jsp";
    }

    @RequestMapping(value = "/house/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object houseUpdate(@PathVariable("id") int id, CableHouse cableHouse,HttpSession session) {
        cableHouse.setId(id);
        int count = cableHouseService.updateByPrimaryKeySelective(cableHouse);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/house/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object houseDelete(@PathVariable("ids") String ids) {
        int count = cableHouseService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping("/colorIndex")
    public String colorInfoIndex(){
        return "mate/color/index.jsp";
    }

    @RequestMapping(value = "/color/list", method = RequestMethod.GET)
    @ResponseBody
    public Object colorList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableColorExample cableColorExample = new CableColorExample();
        CableColorExample.Criteria criteria = cableColorExample.createCriteria();
        criteria.andColorDeleteEqualTo(0).andColorUserIdEqualTo((int)session.getAttribute("userId"));
        cableColorExample.setOrderByClause("color_time desc");
        List<CableColor> rows = cableColorService.selectByExampleForOffsetPage(cableColorExample, offset, limit);
        long total = cableColorService.countByExample(cableColorExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/color/create", method = RequestMethod.GET)
    public String colorCreate() {
        return "mate/color/creat.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/color/create", method = RequestMethod.POST)
    public Object colorCreate(CableColor cableColor,HttpSession session) {
        CableColorExample cableColorExample = new CableColorExample();
        CableColorExample.Criteria criteria = cableColorExample.createCriteria();
        criteria.andColorColorEqualTo(cableColor.getColorColor()).andColorDeleteEqualTo(0);
        int count = cableColorService.countByExample(cableColorExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableColor.setColorUserId((int)session.getAttribute("userId"));
        cableColor.setColorDelete(0);
        count = cableColorService.insertSelective(cableColor);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/color/update/{id}", method = RequestMethod.GET)
    public String colorUpdate(@PathVariable("id") Integer id, ModelMap modelMap) {
        CableColor cableColor = cableColorService.selectByPrimaryKey(id);
        modelMap.put("cableColor", cableColor);
        return "mate/color/update.jsp";
    }

    @RequestMapping(value = "/color/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object colorUpdate(@PathVariable("id") int id, CableColor cableColor,HttpSession session) {
        cableColor.setId(id);
        int count = cableColorService.updateByPrimaryKeySelective(cableColor);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/color/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object colorDelete(@PathVariable("ids") String ids) {
        int count = cableColorService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping("/qualityIndex")
    public String qualityInfoIndex(){
        return "mate/quality/index.jsp";
    }

    @RequestMapping(value = "/quality/list", method = RequestMethod.GET)
    @ResponseBody
    public Object qualityList(HttpSession session,
                            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
                            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
                            @RequestParam(required = false, value = "sort") String sort,
                            @RequestParam(required = false, value = "order") String order) {
        CableQualityExample cableQualityExample = new CableQualityExample();
        CableQualityExample.Criteria criteria = cableQualityExample.createCriteria();
        criteria.andQualityDeleteEqualTo(0).andQualityUserIdEqualTo((int)session.getAttribute("userId"));
        cableQualityExample.setOrderByClause("quality_time desc");
        List<CableQuality> rows = cableQualityService.selectByExampleForOffsetPage(cableQualityExample, offset, limit);
        long total = cableQualityService.countByExample(cableQualityExample);
        Map<String, Object> result = new HashMap<>();
        result.put("rows", rows);
        result.put("total", total);
        return result;
    }

    @RequestMapping(value = "/quality/create", method = RequestMethod.GET)
    public String qualityCreate() {
        return "mate/quality/creat.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/quality/create", method = RequestMethod.POST)
    public Object qualityCreate(CableQuality cableQuality,HttpSession session) {
        CableQualityExample cableQualityExample = new CableQualityExample();
        CableQualityExample.Criteria criteria = cableQualityExample.createCriteria();
        criteria.andQualityQualityEqualTo(cableQuality.getQualityQuality()).andQualityDeleteEqualTo(0);
        int count = cableQualityService.countByExample(cableQualityExample);
        if(count!=0){
            return new BaseResult(ResultConstant.INVALID_LENGTH, count);
        }
        cableQuality.setQualityUserId((int)session.getAttribute("userId"));
        cableQuality.setQualityDelete(0);
        count = cableQualityService.insertSelective(cableQuality);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/quality/update/{id}", method = RequestMethod.GET)
    public String qualityUpdate(@PathVariable("id") Integer id, ModelMap modelMap) {
        CableQuality cableQuality = cableQualityService.selectByPrimaryKey(id);
        modelMap.put("cableQuality", cableQuality);
        return "mate/quality/update.jsp";
    }

    @RequestMapping(value = "/quality/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object qualityUpdate(@PathVariable("id") int id, CableQuality cableQuality,HttpSession session) {
        cableQuality.setId(id);
        int count = cableQualityService.updateByPrimaryKeySelective(cableQuality);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

    @RequestMapping(value = "/quality/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object qualityDelete(@PathVariable("ids") String ids) {
        int count = cableQualityService.deleteByPrimaryKeys(ids);
        return new BaseResult(ResultConstant.SUCCESS, count);
    }

}
