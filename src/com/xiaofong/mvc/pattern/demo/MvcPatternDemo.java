package com.xiaofong.mvc.pattern.demo;

import com.xiaofong.mvc.pattern.controller.StudentController;
import com.xiaofong.mvc.pattern.model.Student;
import com.xiaofong.mvc.pattern.view.StudentView;

public class MvcPatternDemo {

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("xiao_fong");
		student.setRollNo("1");
		return student;
	}

	public static void main(String[] args) {

		// 模拟从数据库从取出数据
		Student student = retriveStudentFromDatabase();

		// 创建视图
		StudentView studentView = new StudentView();

		StudentController studentController = new StudentController(student, studentView);

		studentController.updateView();
		
		System.out.println("-----------------------");

		// 模拟更新数据
		studentController.setStudentName("xiao_xie");

		studentController.updateView();

	}

}
