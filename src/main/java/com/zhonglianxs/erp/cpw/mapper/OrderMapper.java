package com.zhonglianxs.erp.cpw.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderMapper {

    List<String> getModelByUser(@Param("userId")Integer userId);

    List<String> getSpecByModel(@Param("userId")Integer userId,@Param("model") String model);

    List<Map<String,Object>> getOrderItemByOrderId(@Param("orderId")Integer orderId);
}
