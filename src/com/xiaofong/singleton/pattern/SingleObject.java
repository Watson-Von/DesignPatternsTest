package com.xiaofong.singleton.pattern;

/**
 * 3������ʽ
 * 
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ���
 * 
 * ������
 * ���ַ�ʽ�Ƚϳ��ã������ײ�����������
 * 
 * �ŵ㣺
 * û�м�����ִ��Ч�ʻ���ߡ�
 * 
 * ȱ�㣺
 * �����ʱ�ͳ�ʼ�����˷��ڴ档
 * 
 * 
 * @Author Watson_Von
 *
 */
public class SingleObject { 
	
	private static SingleObject instance = new SingleObject();
	
	// ���ù��캯���ķ���Ȩ��Ϊ private ��ʾ���಻�ܱ�ʵ���� �� new һ������ 
	private SingleObject(){
		
	}
	
	// Ψһ��ȡ�����;��
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMsg(){
		System.out.println("Singleton Pattern Test.....");
	}
	
}
