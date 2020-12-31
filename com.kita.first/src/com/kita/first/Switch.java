package com.kita.first;

public class Switch {

	public static void main(String[] args) {
		
		
		int dice = (int)(Math.random()*6) + 1;
		String menu;
		
		switch(dice) {
		case 1 : 
			menu = "치킨";
			break;
		case 2 : 
			menu = "피자";
			break;
		case 3 : 
			menu = "보쌈";
			break;
		case 4 : 
			menu = "떡볶이";
			break;
		case 5 : 
			menu = "회초밥";
			break;
		default: 
			menu = "스테이크";
		}
		System.out.println(menu);

	}

}
