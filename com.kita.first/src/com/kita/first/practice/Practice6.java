package com.kita.first.practice;

public class Practice6 {
	public static void main(String[] args) {
		
		//주사위 굴리기 1~6
		
		int dice = (int)(Math.random()*6)+1;
		
		System.out.println(dice);
		
		int rNum2 = (int)(Math.random()*21)+10;
		System.out.println(rNum2);
		
		//14~57
		
		int rNum3 = (int)(Math.random()*44)+14;
		System.out.println(rNum3);
		
		
		//int n = (int)(Math.randon() * (MAX - min +1)) + min;
	}

}
