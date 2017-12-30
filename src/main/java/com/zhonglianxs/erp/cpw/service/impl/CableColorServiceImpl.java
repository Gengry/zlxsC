package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableColor;
import com.zhonglianxs.erp.cpw.bean.CableColorExample;
import com.zhonglianxs.erp.cpw.mapper.CableColorMapper;
import com.zhonglianxs.erp.cpw.service.CableColorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableColorServiceImpl extends BaseServiceImpl<CableColorMapper,CableColor,CableColorExample> implements CableColorService {


}
