package com.xiaofong.dao.pattern.demo;

import com.xiaofong.dao.pattern.Student;
import com.xiaofong.dao.pattern.StudentDao;
import com.xiaofong.dao.pattern.impl.StudentDaoImpl;

public class DaoPatternDemo {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		// ��ӡ��������
		System.out.println("��ӡ�������� : ");
		for(Student student : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		// ��������
		System.out.println("���µ����� : ");
		Student student = studentDao.getStudent(0);
		student.setName("Michael");
		studentDao.updateStudent(student);
		
		// ��ӡ���µ�����
		// System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		
		// ��ӡ��������
		System.out.println("���º�, ��ӡ�������� : ");
		for(Student student1 : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");
		}
		
		System.out.println("ɾ�������� : ");
		studentDao.deleteStudent(studentDao.getStudent(0));
		
		System.out.println("ɾ����, ��ӡ�������� : ");
		for(Student student2 : studentDao.getStudents()){
			System.out.println("Student : [RollNo : " + student2.getRollNo() + ", Name : " + student2.getName() + " ]");
		}
		
	}
}
