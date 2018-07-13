package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Student;

public interface StudentMapper {
	// 查询所有学生信息
	List<Student> findAll();
	
	// 通过id查询学生信息
	Student findById(long id);
	
	// 保存学生信息
	void save(Student student);
	
	// 修改学生信息
	void update(Student student);
	
	//删除学生信息
	void deleteById(long id);
}
