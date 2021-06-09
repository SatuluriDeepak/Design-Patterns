package com.musicplayer;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String songName) {
		if(audioType.equals("mp3")) {
			System.out.println("Playing Mp3 file : "+songName);
		}
		
		else if(audioType.equals("mp4")|| audioType.equals("vlc")) {
			
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, songName);
		}
		else {
			System.out.println("Invalid Format");
		}
		

	}

}
