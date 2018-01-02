package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.CableStorage;
import com.zhonglianxs.erp.cpw.bean.CableStorageExample;
import com.zhonglianxs.erp.cpw.mapper.CableStorageMapper;
import com.zhonglianxs.erp.cpw.service.CableStorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class CableStorageServiceImpl extends BaseServiceImpl<CableStorageMapper,CableStorage,CableStorageExample> implements CableStorageService {


}
