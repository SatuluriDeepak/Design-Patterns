package com.musicplayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String songname) {
		System.out.println("Playing vlc file : "+songname);

	}

	@Override
	public void playMp4(String songname) {
		// TODO Auto-generated method stub

	}


}
