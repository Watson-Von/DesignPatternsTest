package com.xiaofong.adapter.pattern.impl;

import com.xiaofong.adapter.pattern.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file.name : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		// 什么也不做
	}

}
