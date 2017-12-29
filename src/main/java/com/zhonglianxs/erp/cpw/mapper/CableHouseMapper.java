package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableHouse;
import com.zhonglianxs.erp.cpw.bean.CableHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface CableHouseMapper {
    int countByExample(CableHouseExample example);

    int deleteByExample(CableHouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableHouse record);

    int insertSelective(CableHouse record);

    List<CableHouse> selectByExample(CableHouseExample example);

    CableHouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableHouse record, @Param("example") CableHouseExample example);

    int updateByExample(@Param("record") CableHouse record, @Param("example") CableHouseExample example);

    int updateByPrimaryKeySelective(CableHouse record);

    int updateByPrimaryKey(CableHouse record);

    @Update("update cable_house set cable_house_delete = 1 where id = #{id}")
    int deleteRecordByKey(@Param("id") Integer id);
}