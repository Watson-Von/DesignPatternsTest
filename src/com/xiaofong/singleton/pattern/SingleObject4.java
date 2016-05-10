package com.xiaofong.singleton.pattern;

/**
 * JDK �汾��JDK1.5 ��
 * 
 * �Ƿ� Lazy ��ʼ������
 * 
 * �Ƿ���̰߳�ȫ����
 * 
 * ʵ���Ѷȣ��ϸ���
 * 
 * ������
 * ���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
 * 
 * @Author Watson_Von
 *
 */
public class SingleObject4 {
	
	// ����ȷ���������ĸ��²���֪ͨ�������߳�, ��֤����ֵ������ͬ�������ڴ�,
	// �Լ�ÿ��ʹ��ǰ���������ڴ�ˢ��. ���ѱ�������Ϊvolatile���ͺ�,
	// ������������ʱ����ע�⵽��������ǹ����.
	private volatile static SingleObject4 instance;
	
	private SingleObject4(){
		
	}
	
	public static SingleObject4 getInstance(){
		if (instance == null) {
			// ��ʾ�߳���ִ�е�ʱ��Ὣ��������
			synchronized (SingleObject4.class) {
				if (instance == null) {
					instance = new SingleObject4();
				}
			}
		}
		return instance;
	}
	
	public void showMsg(){
		System.out.println("Singleton Pattern Test4.....");
	}

}
