package com.kita.first.level3.baseball;

public class Baseball {  //컴퓨터가 랜덤으로 숫자 뽑는 클래스
	
	private int[] rArr = {};
	static int max = 9;
	static int min = 1;
	
	public Baseball(int gameCnt) {
		init(gameCnt);
	}
	public void init(int gameCnt) {
		rArr = new int[gameCnt];
		setRandom();
	}
	
	
	public int getRNum(int idx) {
		return rArr[idx];
	}
	
	private void setRandom() {
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random()*(max - min + 1)+ min);
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	
	void printNum(){
		for(int i=0; i<rArr.length; i++) {
			System.out.print(rArr[i]);
		}
		System.out.println();
	}
}
