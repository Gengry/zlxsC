package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableStorage;
import com.zhonglianxs.erp.cpw.bean.CableStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableStorageMapper {
    int countByExample(CableStorageExample example);

    int deleteByExample(CableStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableStorage record);

    int insertSelective(CableStorage record);

    List<CableStorage> selectByExample(CableStorageExample example);

    CableStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableStorage record, @Param("example") CableStorageExample example);

    int updateByExample(@Param("record") CableStorage record, @Param("example") CableStorageExample example);

    int updateByPrimaryKeySelective(CableStorage record);

    int updateByPrimaryKey(CableStorage record);
}