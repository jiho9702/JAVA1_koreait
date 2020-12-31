package com.kita.first.practice;

public class Practice7 {

	public static void main(String[] args) {
		
		
		//1~6 총 6개의 메뉴 랜덤 뽑기
		
		int dice = (int)(Math.random()*6) + 1;
		
		String menu;
		if(dice == 1) {
			menu = "치킨";
		}else if(dice == 2) {
			menu = "피자";
		}else if(dice == 3) {
			menu = "보쌈";
		}else if(dice == 4) {
			menu = "떡볶이";
		}else if(dice == 5) {
			menu = "회초밥";
		}else{
			menu = "스테이크";
		}
		System.out.printf("오늘의 메뉴는 %s입니다", menu);
	}

}
