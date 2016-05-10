package com.xiaofong.singleton.pattern;

/**
 * 2������ʽ���̰߳�ȫ
 * 
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ���
 * 
 * ������
 * ���ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
 * 
 * �ŵ㣺
 * ��һ�ε��òų�ʼ���������ڴ��˷ѡ�
 * 
 * ȱ�㣺
 * ������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
 * @author Watson_Von
 *
 */
public class SingleObject3 {
	
	private static SingleObject3 instance;
	
	private SingleObject3(){
		
	}
	
	// synchronized Java�ؼ���, ������������һ����������һ��������ʱ��, 
	// �ܹ���֤��ͬһʱ�����ֻ��һ���߳�ִ�иöδ���
	public static synchronized SingleObject3 getInstance(){
		if (instance == null) {
			instance = new SingleObject3();
		}
		return instance;
	}
	
	public void showMsg(){
		System.out.println("Singleton Pattern Test3.....");
	}

}
