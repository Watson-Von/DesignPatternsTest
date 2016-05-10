package com.xiaofong.adapter.pattern.impl;

import com.xiaofong.adapter.pattern.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing mp4 file.name : " + fileName);
	}

}
