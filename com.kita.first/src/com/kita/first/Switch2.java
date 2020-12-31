package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과연 나의 넘버는?");
		String sNum = sc.next();
		String menu;
		switch(sNum) {
		case "1" : 
			menu = "치킨";
			break;
		case "2" : 
			menu = "피자";
			break;
		case "3" : 
			menu = "보쌈";
			break;
		case "4" : 
			menu = "떡볶이";
			break;
		case "5" : 
			menu = "회초밥";
			break;
		default: 
			menu = "스테이크";
		}
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
		sc.close();
	}
}
