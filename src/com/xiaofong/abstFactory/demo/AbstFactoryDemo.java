package com.xiaofong.abstFactory.demo;

import com.xiaofong.abstFactory.abst.AbstFactory;
import com.xiaofong.abstFactory.pattern.Color;
import com.xiaofong.abstFactory.pattern.Shape;
import com.xiaofong.abstFactory.producer.FactoryProducer;

/**
 * 抽象工厂模式（Abstract Factory Pattern）:
 * 是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 
 * 主要解决：主要解决接口选择的问题
 * 
 * 优点：
 * 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 
 * 缺点：
 * 产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
 * 
 * @author Watson_Von
 *
 */
public class AbstFactoryDemo {
	
	public static void main(String[] args) {
		
		AbstFactory shapeFactory = FactoryProducer.getFactory("Shape");
		
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("Square");
		square.draw();
		
		AbstFactory colorFactory = FactoryProducer.getFactory("Color");
		
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
		
		Color green = colorFactory.getColor("Green");
		green.fill();
		
		Color red = colorFactory.getColor("Red");
		red.fill();
		
	}

}
