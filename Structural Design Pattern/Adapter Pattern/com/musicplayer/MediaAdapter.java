package com.musicplayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equals("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		}
		else if(audioType.equals("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
		
	}

	@Override
	public void play(String audioType, String songName) {
		if(audioType.equals("vlc")) {
			advancedMediaPlayer.playVlc(songName);
		}
		else if(audioType.equals("mp4")){
			advancedMediaPlayer.playMp4(songName);
		}

	}
}
