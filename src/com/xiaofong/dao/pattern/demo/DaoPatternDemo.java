package com.xiaofong.dao.pattern.demo;

import com.xiaofong.dao.pattern.Student;
import com.xiaofong.dao.pattern.StudentDao;
import com.xiaofong.dao.pattern.impl.StudentDaoImpl;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		// 打印所有数据
		System.out.println("打印所有数据 : ");
		for(Student student : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		// 更新数据
		System.out.println("更新的数据 : ");
		Student student = studentDao.getStudent(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		// 打印更新的数据
		// System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		
		// 打印所有数据
		System.out.println("更新后, 打印所有数据 : ");
		for(Student student1 : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
		
		System.out.println("删除的数据 : ");
		studentDao.deleteStudent(studentDao.getStudent(0));
		
		System.out.println("删除后, 打印所有数据 : ");
		for(Student student2 : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student2.getRollNo() + ", Name : " + student2.getName() + " ]");
		}
		
	}
}
