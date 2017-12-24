package com.zhonglianxs.erp.cpw.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("SELECT * FROM user_info WHERE id = #{id}")
    Map<String,Object> select(int id);

    @Select("SELECT * FROM user_info")
    List<Map<String,Object>> listUser();

}
