package com.xiaofong.prototype.pattern.abst.impl;

import com.xiaofong.prototype.pattern.abst.Shape;

public class Square extends Shape{
	
	public Square(){
		type = "Square";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square's draw.....");
	}

}
