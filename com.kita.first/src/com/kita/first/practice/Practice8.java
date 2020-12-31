package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		
		//계절  3~5는 봄 6~8은 여름 9~11가을 12~2겨울
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇월인지 입력해주세요(1~12월)");
		String month = sc.next();
		String season;
		switch(month) {
		case "3": case "4": case "5":
			season = "봄";
			break;
		case "6": case "7": case "8":
			season = "여름";
			break;
		case "9": case "10": case "11":
			season = "가을";
			break;
		case "12": case "1": case "2":
			season = "겨울";
		default:
			System.out.println("error");
		}
		System.out.printf("%s월은 %s입니다.", month, season);
		sc.close();
	}
}
