package com.xiaofong.singleton.pattern.demo;

import com.xiaofong.singleton.pattern.SingleObject;
import com.xiaofong.singleton.pattern.SingleObject2;
import com.xiaofong.singleton.pattern.SingleObject3;
import com.xiaofong.singleton.pattern.SingleObject4;

/**
 * 单例模式（Singleton Pattern）:
 * 是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 
 * 注意：
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 * 
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * 
 * 优点： 
 * 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例。 
 * 2、避免对资源的多重占用（比如写文件操作）。 
 * 
 * 缺点：
 * 没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 * @author Watson_Von
 *
 */
public class SingletonPatternDemo {
	
	public static void main(String[] args) {
		
		// 不合法的构造函数
		// 编译时错误 : 构造函数 SingleObject() 是不可见的
		//SingleObject object  = new SingleObject();
		
		// 获取唯一可用的对象
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
