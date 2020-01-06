package com.accp.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Exam;
import com.accp.domain.Kechen;
import com.accp.domain.Student;
import com.accp.service.SchoolService;

@Controller
@RequestMapping("load")
public class Load {
	
	@Autowired 
	SchoolService service;
	
	@RequestMapping("toxiala")
	public String toxiala() {
		return "xiala";
	}
	
	@RequestMapping("tojsp")
	public String toJsp() {
		return "jsp1";
	}
	
	@RequestMapping("queryAllStudent")
	@ResponseBody
	public List<Student> queryAllStudent(){
		return service.queryAllStudent();
	}
	
	@RequestMapping(value = "queryStudentInfo",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String queryStudentInfo(Integer id) {
		String name = service.selectZhuan(id);
		return name;
	}
	
	@RequestMapping("queryStudentScore")
	@ResponseBody
	public List<Kechen> queryStudentScore(Integer id) {
		return service.selectKe(id);
	}
	
	@RequestMapping("insertscore")
	@ResponseBody
	public String insertscore(@RequestBody List<Exam> exam) {
		return ""+service.insertscore(exam);
	}
}
