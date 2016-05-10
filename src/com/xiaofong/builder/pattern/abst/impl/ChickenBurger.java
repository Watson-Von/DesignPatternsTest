package com.xiaofong.builder.pattern.abst.impl;

import com.xiaofong.builder.pattern.abst.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Chicken Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.5f;
	}

}
