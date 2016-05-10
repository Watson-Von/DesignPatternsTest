package com.xiaofong.builder.pattern.demo;

/**
 * 建造者模式（Builder Pattern）:
 * 使用多个简单的对象一步一步构建成一个复杂的对象。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 
 * 主要解决：
 * 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
 * 由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 * 
 * 优点： 
 * 1、建造者独立，易扩展。 
 * 2、便于控制细节风险。 
 * 
 * 缺点： 
 * 1、产品必须有共同点，范围有限制。 
 * 2、如内部变化复杂，会有很多的建造类。
 * @Author Watson_Von
 *
 */
public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegBurger = mealBuilder.prepareVegBurger();
		System.out.println("Veg Meal");
		vegBurger.showItems();
		System.out.println("Total Cost : " + vegBurger.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost : " + nonVegMeal.getCost());
		
	}

}
