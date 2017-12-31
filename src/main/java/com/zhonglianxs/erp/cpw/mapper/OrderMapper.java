package com.zhonglianxs.erp.cpw.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    List<String> getModelByUser(@Param("userId")Integer userId);

}
