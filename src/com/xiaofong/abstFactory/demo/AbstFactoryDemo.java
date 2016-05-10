package com.xiaofong.abstFactory.demo;

import com.xiaofong.abstFactory.abst.AbstFactory;
import com.xiaofong.abstFactory.pattern.Color;
import com.xiaofong.abstFactory.pattern.Shape;
import com.xiaofong.abstFactory.producer.FactoryProducer;

/**
 * ���󹤳�ģʽ��Abstract Factory Pattern��:
 * ��Χ��һ�������������������������ó��������ֳ�Ϊ���������Ĺ�����
 * �������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * 
 * ��Ҫ�������Ҫ����ӿ�ѡ�������
 * 
 * �ŵ㣺
 * ��һ����Ʒ���еĶ��������Ƴ�һ����ʱ�����ܱ�֤�ͻ���ʼ��ֻʹ��ͬһ����Ʒ���еĶ���
 * 
 * ȱ�㣺
 * ��Ʒ����չ�ǳ����ѣ�Ҫ����һ��ϵ�е�ĳһ��Ʒ����Ҫ�ڳ���� Creator ��Ӵ��룬��Ҫ�ھ��������Ӵ��롣
 * 
 * @author Watson_Von
 *
 */
public class AbstFactoryDemo {
	
	public static void main(String[] args) {
		
		AbstFactory shapeFactory = FactoryProducer.getFactory("Shape");
		
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		
		AbstFactory colorFactory = FactoryProducer.getFactory("Color");
		
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
		
		Color green = colorFactory.getColor("Green");
		green.fill();
		
		Color red = colorFactory.getColor("Red");
		red.fill();
		
	}

}
