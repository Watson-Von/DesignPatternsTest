package com.xiaofong.prototype.pattern.abst.impl;

import com.xiaofong.prototype.pattern.abst.Shape;

public class Circle extends Shape{
	
	public Circle(){
		type = "Circle";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Cicrle's draw.....");
	}

}
