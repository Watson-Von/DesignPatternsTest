package com.xiaofong.facade.pattern.demo;

import com.xiaofong.facade.pattern.Shape;
import com.xiaofong.facade.pattern.impl.Circle;
import com.xiaofong.facade.pattern.impl.Rectangle;
import com.xiaofong.facade.pattern.impl.Square;

public class ShapeMaker {

	private final Shape circle;
	private final Shape rectangle;
	private final Shape square;

	public ShapeMaker() {
		// TODO Auto-generated constructor stub
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
