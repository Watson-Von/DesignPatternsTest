package com.xiaofong.prototype.pattern;

import com.xiaofong.prototype.pattern.abst.Shape;

/**
 * ԭ��ģʽ��Prototype Pattern��:
 * �����ڴ����ظ��Ķ���ͬʱ���ܱ�֤���ܡ�
 * �������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * 
 * ��Ҫ������������ڽ�����ɾ��ԭ�͡�
 * 
 * �ŵ㣺 
 * 1��������ߡ� 
 * 2���ӱܹ��캯����Լ���� 
 * 
 * ȱ�㣺 
 * 1���䱸��¡������Ҫ����Ĺ��ܽ���ͨ�̿��ǣ������ȫ�µ��಻�Ǻ��ѣ�
 * 	   ���������е��಻һ�������ף��ر�һ�������ò�֧�ִ��л��ļ�Ӷ��󣬻������ú���ѭ���ṹ��ʱ�� 
 * 2������ʵ�� Cloneable �ӿڡ� 
 * 3���ӱܹ��캯����Լ����
 * 
 * @Author Watson_Von
 *
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape shape = ShapeCache.getShape("1");
		System.out.println("Shape : " + shape.getType());
		shape.draw();

		Shape shape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + shape2.getType());
		shape2.draw();

		Shape shape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + shape3.getType());
		shape3.draw();
	}

}
