package com.xiaofong.facade.pattern.demo;

/**
 * ���ģʽ��Facade Pattern��:
 * ����ϵͳ�ĸ����ԣ�����ͻ����ṩ��һ���ͻ��˿��Է���ϵͳ�Ľӿڡ�
 * �������͵����ģʽ���ڽṹ��ģʽ���������е�ϵͳ���һ���ӿڣ�������ϵͳ�ĸ����ԡ�
 * 
 * ��Ҫ�����
 * ���ͷ��ʸ���ϵͳ���ڲ���ϵͳʱ�ĸ��Ӷȣ��򻯿ͻ�����֮�Ľӿڡ�
 * 
 * 
 * @Author Watson_Von
 *
 */
public class FacadePatternDemo {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
