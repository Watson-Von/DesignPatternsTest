package com.xiaofong.mediator.pattern.demo;

import com.xiaofong.mediator.pattern.User;

/**
 * �н���ģʽ��Mediator Pattern��:
 * ���������Ͷ���������֮���ͨ�Ÿ����ԡ�����ģʽ�ṩ��һ���н��࣬
 * ����ͨ������ͬ��֮���ͨ�ţ���֧������ϣ�ʹ��������ά�����н���ģʽ������Ϊ��ģʽ��
 * 
 * ��Ҫ�����
 * ���������֮����ڴ����Ĺ�����ϵ�������Ʊػᵼ��ϵͳ�Ľṹ��úܸ��ӣ�
 * ͬʱ��һ���������ı䣬����Ҳ��Ҫ������֮������Ķ���ͬʱ������Ӧ�Ĵ���
 * 
 * �ŵ㣺 
 * 1����������ĸ��Ӷȣ���һ�Զ�ת������һ��һ�� 
 * 2��������֮��Ľ�� 
 * 3�����ϵ�����ԭ�� 
 * 
 * ȱ�㣺
 * �н��߻��Ӵ󣬱�ø�������ά����
 * @Author Watson_Von
 *
 */
public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		User xiaofong = new User("xiaofong");
		User xiaoxie = new User("xiaoxie");
		
		xiaofong.sendMessage("Hi xiaoxie");
		xiaoxie.sendMessage("Hi xiaofong");
	}

}
