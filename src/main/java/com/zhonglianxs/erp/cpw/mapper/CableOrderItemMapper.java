package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableOrderItem;
import com.zhonglianxs.erp.cpw.bean.CableOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableOrderItemMapper {
    int countByExample(CableOrderItemExample example);

    int deleteByExample(CableOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableOrderItem record);

    int insertSelective(CableOrderItem record);

    List<CableOrderItem> selectByExample(CableOrderItemExample example);

    CableOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableOrderItem record, @Param("example") CableOrderItemExample example);

    int updateByExample(@Param("record") CableOrderItem record, @Param("example") CableOrderItemExample example);

    int updateByPrimaryKeySelective(CableOrderItem record);

    int updateByPrimaryKey(CableOrderItem record);
}