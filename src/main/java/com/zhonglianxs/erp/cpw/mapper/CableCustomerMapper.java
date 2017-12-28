package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableCustomer;
import com.zhonglianxs.erp.cpw.bean.CableCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableCustomerMapper {
    int countByExample(CableCustomerExample example);

    int deleteByExample(CableCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableCustomer record);

    int insertSelective(CableCustomer record);

    List<CableCustomer> selectByExample(CableCustomerExample example);

    CableCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableCustomer record, @Param("example") CableCustomerExample example);

    int updateByExample(@Param("record") CableCustomer record, @Param("example") CableCustomerExample example);

    int updateByPrimaryKeySelective(CableCustomer record);

    int updateByPrimaryKey(CableCustomer record);
}