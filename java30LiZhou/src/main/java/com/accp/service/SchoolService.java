package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Exam;
import com.accp.domain.Kechen;
import com.accp.domain.Student;
import com.accp.domain.Zhuan;

@Service
public class SchoolService {

	@Autowired
	com.accp.mapper.StudentMapper studentm;
	
	@Autowired
	com.accp.mapper.ZhuanMapper zhuanm;
	
	@Autowired
	com.accp.mapper.KechenMapper kem;
	
	@Autowired
	com.accp.mapper.ExamMapper examm;
	
	public List<Student> queryAllStudent(){
		return studentm.selectByExample(null);
	}
	
	public List<Kechen> selectKe(Integer id){
		return kem.selectKe(id);
	}
	
	public Integer insertscore(List<Exam> exam) {
		return examm.insertscore(exam);
	}
	
	public String selectZhuan(Integer id) {
		return zhuanm.selectZhuan(id).getZhuanname();
	}
}
