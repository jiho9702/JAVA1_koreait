package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		//1부터 6까지 랜덤으로 메뉴 뽑기를 한번 한 후에!
		//뽑힌 메뉴: ㅇㅇ
		//마음에 들면 Y를 눌러서 반복 끝내고
		//"오늘의 메뉴는 ㅇㅇ입니다"
		//마음에 안들면 다시 랜덤 뽑기
		
		
		
		
//		if(rNum == 1) {
//			menu = "치킨";
//		}else if(rNum == 2) {
//			menu = "피자";
//		}else if(rNum == 3) {
//			menu = "보쌈";
//		}else if(rNum == 4) {
//			menu = "떡볶이";
//		}else if(rNum == 5) {
//			menu = "회초밥";
//		}else{
//			menu = "스테이크";
//		}
//		System.out.printf("오늘의 메뉴는 %s입니다", menu);
		
		
		Scanner sc = new Scanner(System.in);
		String menu;
		
		do{
			int rNum = (int)(Math.random()*3) + 1;
			
			if(rNum == 1) {
				menu = "치킨";
			}else if(rNum == 2) {
				menu = "피자";
			}else {
				menu = "보쌈";
			}			
			System.out.println("뽑힌 메뉴 : " + menu);	
			System.out.print("마음에 듭니까?(Y/N)");
			String result = sc.next();
			if("Y".equals(result)) {
				break;
			}else if("N".equals(result)) {
				System.out.println("다시 뽑습니다.");
			}else {
				System.out.println("잘못된 문자를 입력했습니다.");
			}
			
		}while(true) ;
			
		System.out.println("오늘의 메뉴는"+menu+"입니다");
		
		sc.close();
	}
}
		


