package com.xiaofong.proxy.pattern.demo;

import com.xiaofong.proxy.pattern.Image;

/**
 * 在代理模式（Proxy Pattern）:
 * 一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * 
 * 主要解决：
 * 在直接访问对象时带来的问题.
 * 比如说：
 * 要访问的对象在远程的机器上。在面向对象系统中，
 * 有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
 * 直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * 
 * 优点： 
 * 1、职责清晰。 
 * 2、高扩展性。 
 * 3、智能化。
 * 
 * 缺点： 
 * 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。 
 * 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。 
 * 
 * 
 * @Author Watson_Von
 *
 */

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("text.jpg");

		image.display();
		System.out.println("");
		image.display();
	}

}
