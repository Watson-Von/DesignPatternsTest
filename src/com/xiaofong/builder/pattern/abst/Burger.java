package com.xiaofong.builder.pattern.abst;

import com.xiaofong.builder.pattern.Item;
import com.xiaofong.builder.pattern.Packing;
import com.xiaofong.builder.pattern.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
