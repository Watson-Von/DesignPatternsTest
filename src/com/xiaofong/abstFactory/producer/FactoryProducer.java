package com.xiaofong.abstFactory.producer;

import com.xiaofong.abstFactory.abst.AbstFactory;
import com.xiaofong.abstFactory.impl.ColorFactory;
import com.xiaofong.abstFactory.impl.ShapeFactory;

public class FactoryProducer {

	public static AbstFactory getFactory(String choice) {

		if ("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		} else if ("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}

}
