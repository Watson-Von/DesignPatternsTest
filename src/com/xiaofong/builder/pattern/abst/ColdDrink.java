package com.xiaofong.builder.pattern.abst;

import com.xiaofong.builder.pattern.Item;
import com.xiaofong.builder.pattern.Packing;
import com.xiaofong.builder.pattern.impl.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
