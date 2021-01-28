package com.kita.first.level3.baseball;

public class Game {  //야구게임 실행 클래스
	public static void main(String[] args) {
		
		
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		ball.randNum(gameCnt);
		ball.printNum(gameCnt);
		
		do {
			myBall.setNumbers(gameCnt);
		}while(Checker.check(gameCnt, ball, myBall));
		
		
		
//		final int LEN = 3;
//		
//		Baseball rand = new Baseball(LEN);
//		MyBall my = new MyBall(LEN);
//		
//		rand.randNum(LEN);
//		rand.printNum(LEN);
//		
//		my.myNum(LEN);
//		
//		Checker check = new Checker(LEN);
//		
//		while(true) {
//			check.sCount(LEN);
//			check.bCount(LEN);
	}
}

