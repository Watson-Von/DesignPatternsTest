package com.xiaofong.factory.factory;

import com.xiaofong.factory.impl.Circle;
import com.xiaofong.factory.impl.Rectangle;
import com.xiaofong.factory.impl.Square;
import com.xiaofong.factory.pattern.Shape;

public class ShapeFactory {

	public Shape getFactory(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
