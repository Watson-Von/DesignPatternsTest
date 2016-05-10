package com.xiaofong.singleton.pattern.demo;

import com.xiaofong.singleton.pattern.SingleObject;
import com.xiaofong.singleton.pattern.SingleObject2;
import com.xiaofong.singleton.pattern.SingleObject3;
import com.xiaofong.singleton.pattern.SingleObject4;

/**
 * ����ģʽ��Singleton Pattern��:
 * �� Java ����򵥵����ģʽ֮һ���������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * 
 * ע�⣺
 * 1��������ֻ����һ��ʵ����
 * 2������������Լ������Լ���Ψһʵ����
 * 3�������������������������ṩ��һʵ����
 * 
 * ��Ҫ�����һ��ȫ��ʹ�õ���Ƶ���ش��������١�
 * 
 * �ŵ㣺 
 * 1�����ڴ���ֻ��һ��ʵ�����������ڴ�Ŀ�����������Ƶ���Ĵ���������ʵ���� 
 * 2���������Դ�Ķ���ռ�ã�����д�ļ��������� 
 * 
 * ȱ�㣺
 * û�нӿڣ����ܼ̳У��뵥һְ��ԭ���ͻ��һ����Ӧ��ֻ�����ڲ��߼�����������������ô����ʵ������
 * @author Watson_Von
 *
 */
public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		// ���Ϸ��Ĺ��캯��
		// ����ʱ���� : ���캯�� SingleObject() �ǲ��ɼ���
		//SingleObject object  = new SingleObject();
		
		// ��ȡΨһ���õĶ���
		SingleObject object = SingleObject.getInstance();
		object.showMsg();
		
		SingleObject2 object2 = SingleObject2.getInstance();
		object2.showMsg();
		
		SingleObject3 object3 = SingleObject3.getInstance();
		object3.showMsg();
		
		SingleObject4 object4 = SingleObject4.getInstance();
		object4.showMsg();
		
	}
	
}
