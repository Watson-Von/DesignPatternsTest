package com.xiaofong.abstFactory.abst;

import com.xiaofong.abstFactory.pattern.Color;
import com.xiaofong.abstFactory.pattern.Shape;

public abstract class AbstFactory {

	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);
	
}
