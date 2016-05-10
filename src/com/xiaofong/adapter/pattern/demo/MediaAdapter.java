package com.xiaofong.adapter.pattern.demo;

import com.xiaofong.adapter.pattern.AdvanceMediaPlayer;
import com.xiaofong.adapter.pattern.MediaPlayer;
import com.xiaofong.adapter.pattern.impl.Mp4Player;
import com.xiaofong.adapter.pattern.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advanceMediaPlayer = null;

	public MediaAdapter(String audioType) {
		if ("vlc".equalsIgnoreCase(audioType)) {
			advanceMediaPlayer = new VlcPlayer();
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			advanceMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMp4(fileName);
		}
	}

}
