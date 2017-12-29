package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableHouse;
import com.zhonglianxs.erp.cpw.bean.CableHouseExample;
import com.zhonglianxs.erp.cpw.mapper.CableHouseMapper;
import com.zhonglianxs.erp.cpw.service.CableHouseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableHouseServiceImpl extends BaseServiceImpl<CableHouseMapper,CableHouse,CableHouseExample> implements CableHouseService{


}
