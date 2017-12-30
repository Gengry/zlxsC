package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableCustomer;
import com.zhonglianxs.erp.cpw.bean.CableCustomerExample;
import com.zhonglianxs.erp.cpw.bean.CableProvider;
import com.zhonglianxs.erp.cpw.bean.CableProviderExample;
import com.zhonglianxs.erp.cpw.mapper.CableCustomerMapper;
import com.zhonglianxs.erp.cpw.mapper.CableProviderMapper;
import com.zhonglianxs.erp.cpw.service.CableCustomerService;
import com.zhonglianxs.erp.cpw.service.CableProviderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableCustomerServiceImpl extends BaseServiceImpl<CableCustomerMapper,CableCustomer,CableCustomerExample> implements CableCustomerService{


}
