package com.kita.first.level4;

public interface AkmuAlbum {
	//상수 필드만 들어갈수 있다.
//	public static final String SONG_WRITER = "이찬혁";
	String SONG_WRITER = "이찬혁";  //위에것이 자동으로 들어가있다
	int price = 20_000;           //(0_0)
	
	//추상메소드
//	public abstract void playAkmuAlbum();
	void playAkmuAlbum();
	
	void stopAkmuAlbum();
}
