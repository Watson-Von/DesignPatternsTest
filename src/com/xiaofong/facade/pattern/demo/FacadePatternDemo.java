package com.xiaofong.facade.pattern.demo;

/**
 * 外观模式（Facade Pattern）:
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 * 
 * 主要解决：
 * 降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 * 
 * 
 * @Author Watson_Von
 *
 */
public class FacadePatternDemo {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
