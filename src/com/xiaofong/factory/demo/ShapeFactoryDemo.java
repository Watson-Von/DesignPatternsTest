package com.xiaofong.factory.demo;

import com.xiaofong.factory.factory.ShapeFactory;
import com.xiaofong.factory.pattern.Shape;

/**
 * 工厂模式（Factory Pattern）:
 * 是 Java 中最常用的设计模式之一。 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 
 * 主要解决：主要解决接口选择的问题
 * 
 * 优点： 
 * 1、一个调用者想创建一个对象，只要知道其名称就可以了。 
 * 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
 * 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 
 * 缺点：
 * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加,
 * 在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 * 
 * @author Watson_Von
 *
 */

public class ShapeFactoryDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getFactory("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getFactory("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getFactory("Square");
		shape3.draw();
		
	}

}
