package com.accp.mapper;

import com.accp.domain.Exam;
import com.accp.domain.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {
    int countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int insert(Exam record);

    int insertSelective(Exam record);
    
    int insertscore(@Param("list") List<Exam> exam);

    List<Exam> selectByExample(ExamExample example);
    
    List<Exam> queryAllExam(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);
}