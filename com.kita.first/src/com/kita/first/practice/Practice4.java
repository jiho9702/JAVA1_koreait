package com.kita.first.practice;

import java.util.Scanner;  //

public class Practice4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요:");
		int num = scan.nextInt();
		
		String str = "짝수";
		if(num%2 == 1) {
			str = "홀수";
		}
		System.out.printf("%s입니다.", str);
		
		scan.close();
	
	}

}
