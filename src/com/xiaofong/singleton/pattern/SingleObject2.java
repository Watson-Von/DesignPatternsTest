package com.xiaofong.singleton.pattern;

/**
 * 1������ʽ���̲߳���ȫ
 * 
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ���
 * 
 * ������
 * ���ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳�
 * ��Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
 * �ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
 *
 * @author Watson_Von
 *
 */
public class SingleObject2 {
	
	private static SingleObject2 instance;
	
	private SingleObject2(){
		
	}
	
	public static SingleObject2 getInstance(){
		if (instance == null) {
			instance = new SingleObject2();
		}
		return instance;
	}
	
	public void showMsg(){
		System.out.println("Singleton Pattern Test2.....");
	}

}
