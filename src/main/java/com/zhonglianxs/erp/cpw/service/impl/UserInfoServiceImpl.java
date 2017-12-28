package com.zhonglianxs.erp.cpw.service.impl;

import com.zhonglianxs.erp.cpw.annotation.BaseService;
import com.zhonglianxs.erp.cpw.base.BaseServiceImpl;
import com.zhonglianxs.erp.cpw.bean.UserInfo;
import com.zhonglianxs.erp.cpw.bean.UserInfoExample;
import com.zhonglianxs.erp.cpw.mapper.UserInfoMapper;
import com.zhonglianxs.erp.cpw.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@BaseService
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfoMapper,UserInfo,UserInfoExample> implements UserInfoService {
}
