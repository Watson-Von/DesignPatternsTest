package com.xiaofong.transfer.object.pattern.businessObject;

import java.util.ArrayList;
import java.util.List;

import com.xiaofong.transfer.object.pattern.transferObject.StudentVO;

public class StudentBO {

	// 模拟数据库
	List<StudentVO> students;

	public StudentBO() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("xiaofong", 0);
		StudentVO student2 = new StudentVO("xiaoxie", 1);
		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student : Roll No " + student.getRollNo() + "delete from database");
	}

	// 模拟从数据库中获取数据
	public List<StudentVO> getStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student : Roll No " + student.getRollNo() + ", update from database");
	}

}
