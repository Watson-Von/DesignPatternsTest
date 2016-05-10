package com.xiaofong.singleton.pattern;

/**
 * 2、懒汉式，线程安全
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：易
 * 
 * 描述：
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 
 * 优点：
 * 第一次调用才初始化，避免内存浪费。
 * 
 * 缺点：
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @author Watson_Von
 *
 */
public class SingleObject3 {
	
	private static SingleObject3 instance;
	
	private SingleObject3(){
		
	}
	
	// synchronized Java关键字, 当它用来修饰一个方法或者一个代码块的时候, 
	// 能够保证在同一时刻最多只有一个线程执行该段代码
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
