package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableQuality;
import com.zhonglianxs.erp.cpw.bean.CableQualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableQualityMapper {
    int countByExample(CableQualityExample example);

    int deleteByExample(CableQualityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableQuality record);

    int insertSelective(CableQuality record);

    List<CableQuality> selectByExample(CableQualityExample example);

    CableQuality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableQuality record, @Param("example") CableQualityExample example);

    int updateByExample(@Param("record") CableQuality record, @Param("example") CableQualityExample example);

    int updateByPrimaryKeySelective(CableQuality record);

    int updateByPrimaryKey(CableQuality record);
}