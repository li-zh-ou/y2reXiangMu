package com.accp.mapper;

import com.accp.domain.Kechen;
import com.accp.domain.KechenExample;
import java.util.List;

import javax.validation.constraints.Past;

import org.apache.ibatis.annotations.Param;

public interface KechenMapper {
    int countByExample(KechenExample example);

    int deleteByExample(KechenExample example);

    int deleteByPrimaryKey(Integer keid);

    int insert(Kechen record);

    int insertSelective(Kechen record);

    List<Kechen> selectByExample(KechenExample example);
    
    List<Kechen> selectKe(@Param("id") Integer id);

    Kechen selectByPrimaryKey(Integer keid);

    int updateByExampleSelective(@Param("record") Kechen record, @Param("example") KechenExample example);

    int updateByExample(@Param("record") Kechen record, @Param("example") KechenExample example);

    int updateByPrimaryKeySelective(Kechen record);

    int updateByPrimaryKey(Kechen record);
}