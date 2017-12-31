package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import com.zhonglianxs.erp.cpw.mapper.CableInfoMapper;
import com.zhonglianxs.erp.cpw.mapper.OrderMapper;
import com.zhonglianxs.erp.cpw.service.CableInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@BaseService
public class CableInfoServiceImpl extends BaseServiceImpl<CableInfoMapper,CableInfo,CableInfoExample> implements CableInfoService{

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<String> getModelByUser(Integer userId) {
        return orderMapper.getModelByUser(userId);
    }
}
