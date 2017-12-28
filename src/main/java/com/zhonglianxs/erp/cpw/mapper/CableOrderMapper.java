package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableOrder;
import com.zhonglianxs.erp.cpw.bean.CableOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableOrderMapper {
    int countByExample(CableOrderExample example);

    int deleteByExample(CableOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableOrder record);

    int insertSelective(CableOrder record);

    List<CableOrder> selectByExample(CableOrderExample example);

    CableOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableOrder record, @Param("example") CableOrderExample example);

    int updateByExample(@Param("record") CableOrder record, @Param("example") CableOrderExample example);

    int updateByPrimaryKeySelective(CableOrder record);

    int updateByPrimaryKey(CableOrder record);
}