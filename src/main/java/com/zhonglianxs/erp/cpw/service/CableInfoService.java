package com.zhonglianxs.erp.cpw.service;

import com.zhonglianxs.erp.cpw.base.BaseService;
import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;

import java.util.List;

public interface CableInfoService extends BaseService<CableInfo, CableInfoExample> {

    List<String> getModelByUser(Integer userId);

    List<String> getSpecByModel(Integer userId,String model);

}
