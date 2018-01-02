package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableOrderItem;
import com.zhonglianxs.erp.cpw.bean.CableOrderItemExample;
import com.zhonglianxs.erp.cpw.mapper.CableOrderItemMapper;
import com.zhonglianxs.erp.cpw.service.CableOrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableOrderItemServiceImpl extends BaseServiceImpl<CableOrderItemMapper,CableOrderItem,CableOrderItemExample> implements CableOrderItemService {


}
