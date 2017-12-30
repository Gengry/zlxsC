package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableColor;
import com.zhonglianxs.erp.cpw.bean.CableColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableColorMapper {
    int countByExample(CableColorExample example);

    int deleteByExample(CableColorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableColor record);

    int insertSelective(CableColor record);

    List<CableColor> selectByExample(CableColorExample example);

    CableColor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableColor record, @Param("example") CableColorExample example);

    int updateByExample(@Param("record") CableColor record, @Param("example") CableColorExample example);

    int updateByPrimaryKeySelective(CableColor record);

    int updateByPrimaryKey(CableColor record);
}