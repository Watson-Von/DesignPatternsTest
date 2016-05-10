package com.xiaofong.abstFactory.impl;

import com.xiaofong.abstFactory.abst.AbstFactory;
import com.xiaofong.abstFactory.pattern.Color;
import com.xiaofong.abstFactory.pattern.Shape;

public class ShapeFactory extends AbstFactory {

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
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
