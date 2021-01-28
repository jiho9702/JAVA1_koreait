package com.kita.first.level3.baseball;

public class Checker {  //스트라이크 볼 아웃의 수를 세어주는 클래스
	
	public Checker(int gameCnt) {
		
	}

	public static boolean check(int gameCnt, Baseball ball, MyBall myBall) {
		int sCount = 0;
		int bCount = 0;
		
		for(int i=0; i<gameCnt; i++) {
			if( MyBall.myArr[i]== Baseball.rArr[i]) {
				sCount++;
			}
		}
		for(int i=0; i<gameCnt; i++) {		
			for(int z=0; z<gameCnt; z++) {
				if(MyBall.myArr[i]== Baseball.rArr[i]) {
					continue;
				}else if(MyBall.myArr[i]== Baseball.rArr[i]){
					bCount++;
				}
			}
		}
		
		if(sCount == gameCnt) {
			return false;
		}
		return true;
	}
}
