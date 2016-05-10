package com.xiaofong.singleton.pattern;

/**
 * JDK 版本：JDK1.5 起
 * 
 * 是否 Lazy 初始化：是
 * 
 * 是否多线程安全：是
 * 
 * 实现难度：较复杂
 * 
 * 描述：
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 
 * @Author Watson_Von
 *
 */
public class SingleObject4 {
	
	// 用来确保将变量的更新操作通知到其他线程, 保证了新值能立即同步到主内存,
	// 以及每次使用前立即从主内存刷新. 当把变量声明为volatile类型后,
	// 编译器与运行时都会注意到这个变量是共享的.
	private volatile static SingleObject4 instance;
	
	private SingleObject4(){
		
	}
	
	public static SingleObject4 getInstance(){
		if (instance == null) {
			// 表示线程在执行的时候会将对象上锁
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
