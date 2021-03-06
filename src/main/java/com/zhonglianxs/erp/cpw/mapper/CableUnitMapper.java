package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableUnit;
import com.zhonglianxs.erp.cpw.bean.CableUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface CableUnitMapper {
    int countByExample(CableUnitExample example);

    int deleteByExample(CableUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableUnit record);

    int insertSelective(CableUnit record);

    List<CableUnit> selectByExample(CableUnitExample example);

    CableUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableUnit record, @Param("example") CableUnitExample example);

    int updateByExample(@Param("record") CableUnit record, @Param("example") CableUnitExample example);

    int updateByPrimaryKeySelective(CableUnit record);

    int updateByPrimaryKey(CableUnit record);

    @Update("update cable_unit set unit_delete = 1 where id = #{id}")
    int deleteRecordByKey(@Param("id") Integer id);
}