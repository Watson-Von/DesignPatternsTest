package com.xiaofong.builder.pattern.abst.impl;

import com.xiaofong.builder.pattern.abst.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
