package com.xiaofong.transfer.object.pattern.demo;

import com.xiaofong.transfer.object.pattern.businessObject.StudentBO;
import com.xiaofong.transfer.object.pattern.transferObject.StudentVO;

public class TransferObjectPatternDemo {
	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		
		for (StudentVO student : studentBusinessObject.getStudents()) {
			 System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		// ģ���������
		StudentVO student = studentBusinessObject.getStudent(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		
		// ��ȡ����
		System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		
	}

}
