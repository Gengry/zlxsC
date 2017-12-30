package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableQuality;
import com.zhonglianxs.erp.cpw.bean.CableQualityExample;
import com.zhonglianxs.erp.cpw.mapper.CableQualityMapper;
import com.zhonglianxs.erp.cpw.service.CableQualityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableQualityServiceImpl extends BaseServiceImpl<CableQualityMapper,CableQuality,CableQualityExample> implements CableQualityService {


}
