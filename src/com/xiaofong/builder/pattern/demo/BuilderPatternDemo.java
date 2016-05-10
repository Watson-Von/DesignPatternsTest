package com.xiaofong.builder.pattern.demo;

/**
 * ������ģʽ��Builder Pattern��:
 * ʹ�ö���򵥵Ķ���һ��һ��������һ�����ӵĶ���
 * �������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
 * 
 * ��Ҫ�����
 * ��Ҫ��������ϵͳ�У���ʱ��������"һ�����Ӷ���"�Ĵ�����������ͨ���ɸ������ֵ��Ӷ�����һ�����㷨���ɣ�
 * ��������ı仯��������Ӷ���ĸ������־��������ž��ҵı仯�����ǽ����������һ����㷨ȴ����ȶ���
 * 
 * �ŵ㣺 
 * 1�������߶���������չ�� 
 * 2�����ڿ���ϸ�ڷ��ա� 
 * 
 * ȱ�㣺 
 * 1����Ʒ�����й�ͬ�㣬��Χ�����ơ� 
 * 2�����ڲ��仯���ӣ����кܶ�Ľ����ࡣ
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
