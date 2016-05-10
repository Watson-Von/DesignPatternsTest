package com.xiaofong.abstFactory.impl;

import com.xiaofong.abstFactory.abst.AbstFactory;
import com.xiaofong.abstFactory.pattern.Color;
import com.xiaofong.abstFactory.pattern.Shape;

public class ColorFactory extends AbstFactory{

	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if (colorType == null) {
			return null;
		}
		
		if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
