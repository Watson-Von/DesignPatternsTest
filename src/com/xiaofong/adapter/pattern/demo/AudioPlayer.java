package com.xiaofong.adapter.pattern.demo;

import com.xiaofong.adapter.pattern.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter = null;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 file.name : " + fileName);
		} else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media." + audioType + " format not supported");
		}
	}
}
