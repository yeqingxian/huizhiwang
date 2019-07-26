package com.edu.huizhi.mapper;

import com.edu.huizhi.pojo.HuizhiUser;
import com.edu.huizhi.pojo.HuizhiUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface HuizhiUserMapper {
    int countByExample(HuizhiUserExample example);

    int deleteByExample(HuizhiUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HuizhiUser record);

    int insertSelective(HuizhiUser record);

    List<HuizhiUser> selectByExample(HuizhiUserExample example);

    HuizhiUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HuizhiUser record, @Param("example") HuizhiUserExample example);

    int updateByExample(@Param("record") HuizhiUser record, @Param("example") HuizhiUserExample example);

    int updateByPrimaryKeySelective(HuizhiUser record);

    int updateByPrimaryKey(HuizhiUser record);
}