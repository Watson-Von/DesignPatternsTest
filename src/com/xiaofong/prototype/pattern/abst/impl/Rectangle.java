package com.xiaofong.prototype.pattern.abst.impl;

import com.xiaofong.prototype.pattern.abst.Shape;

public class Rectangle extends Shape{
	
	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle's draw.....");
	}

}
