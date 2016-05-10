package com.xiaofong.mvc.pattern.controller;

import com.xiaofong.mvc.pattern.model.Student;
import com.xiaofong.mvc.pattern.view.StudentView;

public class StudentController {

	private Student model;
	private StudentView view;

	public StudentController(Student model, StudentView view) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printStudentDetail(model.getName(), model.getRollNo());
	}

}
