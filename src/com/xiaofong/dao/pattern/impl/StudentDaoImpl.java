package com.xiaofong.dao.pattern.impl;

import java.util.ArrayList;
import java.util.List;

import com.xiaofong.dao.pattern.Student;
import com.xiaofong.dao.pattern.StudentDao;

public class StudentDaoImpl implements StudentDao{
	
	// 模拟从数据库中读取数据
	List<Student> students = null;
	
	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
		Student student1 = new Student("xiaofong", 0);
		Student student2 = new Student("xiaoxie", 1);
		students.add(student1);
		students.add(student2);
	}

	// 模拟从数据库从读取全部数据
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student : Roll No " + student.getRollNo() + ", updated in database");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getRollNo());
		System.out.println("Student : Roll No " + student.getRollNo() + ", deleted from database");
	}

}
