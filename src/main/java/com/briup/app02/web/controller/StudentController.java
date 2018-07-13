package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	// 注入studentService的实例
	@Autowired
	private IStudentService studentService;
	
	@GetMapping("deleteStudentById")
	public MsgResponse deleteStudentById(long id){
		try {
			// 调用service层代码删除学生信息
			studentService.deleteById(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			// 先打印错误信息，让后台开发者知道问题所在；返回错误信息，让前端开发者知道错误所在
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateStudent")
	public String updateStudent(Student student){
		try {
			studentService.update(student);
			return "修改成功！";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	/**
	 * 保存学生信息
	 * @author 李春雨
	 * @param student 
	 * @return 
	 * */
	@PostMapping("saveStudent")
	public void saveStudent(Student student){
		try {
			studentService.save(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudent(){
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findStudentById")
	public Student findStudentById(long id){
		try {
			Student student = studentService.findById(id);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













