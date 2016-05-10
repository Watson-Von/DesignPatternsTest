package com.xiaofong.proxy.pattern.impl;

import com.xiaofong.proxy.pattern.Image;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display " + fileName);
	}

	public void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

}
