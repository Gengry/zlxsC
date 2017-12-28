package com.zhonglianxs.erp.cpw.mapper;

import com.zhonglianxs.erp.cpw.bean.CableDic;
import com.zhonglianxs.erp.cpw.bean.CableDicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CableDicMapper {
    int countByExample(CableDicExample example);

    int deleteByExample(CableDicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CableDic record);

    int insertSelective(CableDic record);

    List<CableDic> selectByExample(CableDicExample example);

    CableDic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CableDic record, @Param("example") CableDicExample example);

    int updateByExample(@Param("record") CableDic record, @Param("example") CableDicExample example);

    int updateByPrimaryKeySelective(CableDic record);

    int updateByPrimaryKey(CableDic record);
}