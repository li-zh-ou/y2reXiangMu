package com.accp.mapper;

import com.accp.domain.Zhuan;
import com.accp.domain.ZhuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhuanMapper {
    int countByExample(ZhuanExample example);

    int deleteByExample(ZhuanExample example);

    int deleteByPrimaryKey(Integer zhuanid);

    int insert(Zhuan record);

    int insertSelective(Zhuan record);

    List<Zhuan> selectByExample(ZhuanExample example);
    
    Zhuan selectZhuan(@Param("id") Integer id);

    Zhuan selectByPrimaryKey(Integer zhuanid);

    int updateByExampleSelective(@Param("record") Zhuan record, @Param("example") ZhuanExample example);

    int updateByExample(@Param("record") Zhuan record, @Param("example") ZhuanExample example);

    int updateByPrimaryKeySelective(Zhuan record);

    int updateByPrimaryKey(Zhuan record);
}