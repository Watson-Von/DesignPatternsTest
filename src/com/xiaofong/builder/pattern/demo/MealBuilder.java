package com.xiaofong.builder.pattern.demo;

import com.xiaofong.builder.pattern.abst.impl.ChickenBurger;
import com.xiaofong.builder.pattern.abst.impl.Coke;
import com.xiaofong.builder.pattern.abst.impl.Pepsi;
import com.xiaofong.builder.pattern.abst.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegBurger() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
