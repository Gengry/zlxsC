package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableInfo;
import com.zhonglianxs.erp.cpw.bean.CableInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface CableInfoMapper {
    int countByExample(CableInfoExample example);

    int deleteByExample(CableInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableInfo record);

    int insertSelective(CableInfo record);

    List<CableInfo> selectByExample(CableInfoExample example);

    CableInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableInfo record, @Param("example") CableInfoExample example);

    int updateByExample(@Param("record") CableInfo record, @Param("example") CableInfoExample example);

    int updateByPrimaryKeySelective(CableInfo record);

    int updateByPrimaryKey(CableInfo record);

    @Update("update cable_info set cable_delete = 1 where id = #{id}")
    int deleteRecordByKey(@Param("id") Integer id);
}