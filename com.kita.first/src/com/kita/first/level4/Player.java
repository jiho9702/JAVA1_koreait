package com.kita.first.level4;

public class Player {

	public static void main(String[] args) {
		
		ThrowsException te = new ThrowsException();
		
		try {
			te.method1();    //예외 처리를 뒤로 미룬다.
		}catch(Exception e) {
			
		}
		
////		AkmuAlbum album = new AkmuAlbum(); //이렇게는 안된다.
//		
//		AkmuAlbum album1 = new MyMusicPlayer();
//		IUAlbum album2 = new MyMusicPlayer();	//다중상속이 가능하다..
//		
//		album1.playAkmuAlbum();
//		album1.stopAkmuAlbum();
////		album1.playIUAlbum();은 안된다           악뮤앨범을 거쳐서 마이뮤직플레이어로 들어가기 때문에 아이유는 안된다.
//		
//		album2.playIUAlbum();
//		album2.stopIUAlbum();
//		
//		
//		MyMusicPlayer myMp3 = (MyMusicPlayer)album1;  //강제형변환이 된다.
//		myMp3.playMichaelJacksonAlbum();
		
	}

}
