package com.briup.app02.vm;

import com.briup.app02.bean.Grade;
import com.briup.app02.bean.User;

public class ClazzVM {
	private Long id;
	private String name;
	private String description;
	private Grade grade;	//年级
	private User user; 		//班主任
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
