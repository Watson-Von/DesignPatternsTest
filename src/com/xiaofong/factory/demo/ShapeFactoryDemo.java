package com.xiaofong.factory.demo;

import com.xiaofong.factory.factory.ShapeFactory;
import com.xiaofong.factory.pattern.Shape;

/**
 * ����ģʽ��Factory Pattern��:
 * �� Java ����õ����ģʽ֮һ�� �������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * 
 * ��Ҫ�������Ҫ����ӿ�ѡ�������
 * 
 * �ŵ㣺 
 * 1��һ���������봴��һ������ֻҪ֪�������ƾͿ����ˡ� 
 * 2����չ�Ըߣ����������һ����Ʒ��ֻҪ��չһ��������Ϳ��ԡ� 
 * 3�����β�Ʒ�ľ���ʵ�֣�������ֻ���Ĳ�Ʒ�Ľӿڡ�
 * 
 * ȱ�㣺
 * ÿ������һ����Ʒʱ������Ҫ����һ��������Ͷ���ʵ�ֹ�����ʹ��ϵͳ����ĸ����ɱ�����,
 * ��һ���̶���������ϵͳ�ĸ��Ӷȣ�ͬʱҲ������ϵͳ��������������Ⲣ����ʲô���¡�
 * 
 * @author Watson_Von
 *
 */

public class ShapeFactoryDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getFactory("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getFactory("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getFactory("Square");
		shape3.draw();
		
	}

}
