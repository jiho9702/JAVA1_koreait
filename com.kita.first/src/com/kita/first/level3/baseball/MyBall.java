package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall {  //내가 숫자값 입력하고 예외처리하는 클래스
	
	//필드
	private Scanner scan;
	private int[] myArr = {};
	
	//생성자
	public MyBall(int gameCnt) {
		init(gameCnt);
	}
	
	//메소드
	private void init(int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	setNumbers(){
		
	}
	
	getMyNum(int idx){
		
	}
	
	
}
