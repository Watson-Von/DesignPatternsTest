package com.xiaofong.singleton.pattern;

/**
 * 3、饿汉式
 * 
 * 是否 Lazy 初始化：否
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：易
 * 
 * 描述：
 * 这种方式比较常用，但容易产生垃圾对象。
 * 
 * 优点：
 * 没有加锁，执行效率会提高。
 * 
 * 缺点：
 * 类加载时就初始化，浪费内存。
 * 
 * 
 * @Author Watson_Von
 *
 */
public class SingleObject { 
	
	private static SingleObject instance = new SingleObject();
	
	// 设置构造函数的访问权限为 private 表示该类不能被实例化 即 new 一个对象 
	private SingleObject(){
		
	}
	
	// 唯一获取对象的途径
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMsg(){
		System.out.println("Singleton Pattern Test.....");
	}
	
}
