package com.xiaofong.composite.pattern.demo;

import com.xiaofong.composite.pattern.Employee;

/**
 * ���ģʽ��Composite Pattern��: 
 * �ֽв�������ģʽ�������ڰ�һ�����ƵĶ�����һ����һ�Ķ���,
 * ���ģʽ�������νṹ����϶���������ʾ�����Լ�������, �������͵����ģʽ���ڽṹ��ģʽ��
 * �������˶���������νṹ��
 * 
 * ��Ҫ����� 
 * �����������ͽṹ�������У�ģ���˼�Ԫ�غ͸���Ԫ�صĸ��
 * �ͻ�������������Ԫ��һ����������Ԫ�أ��Ӷ�ʹ�ÿͻ������븴��Ԫ�ص��ڲ��ṹ���
 * 
 * �ŵ㣺 
 * 1���߲�ģ����ü򵥡� 
 * 2���ڵ��������ӡ�
 * 
 * ȱ�㣺 
 * ��ʹ�����ģʽʱ����Ҷ�Ӻ���֦����������ʵ���࣬�����ǽӿڣ�Υ������������ԭ��
 * 
 * @Author Watson_Von
 * 
 */
public class CompositePatternDemo {

	public static void main(String[] args) {
		
		Employee ceo = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);

		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);

		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		ceo.add(headSales);
		ceo.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		System.out.println(ceo);
		for (Employee headEmployee : ceo.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
