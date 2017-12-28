package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableProvider;
import com.zhonglianxs.erp.cpw.bean.CableProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableProviderMapper {
    int countByExample(CableProviderExample example);

    int deleteByExample(CableProviderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableProvider record);

    int insertSelective(CableProvider record);

    List<CableProvider> selectByExample(CableProviderExample example);

    CableProvider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableProvider record, @Param("example") CableProviderExample example);

    int updateByExample(@Param("record") CableProvider record, @Param("example") CableProviderExample example);

    int updateByPrimaryKeySelective(CableProvider record);

    int updateByPrimaryKey(CableProvider record);
}