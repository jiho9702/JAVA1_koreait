package com.kita.first.level3.practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자만 입력하세요 : ");
		String result = scan.next();
		
		int num;
		
		try {
			//문자열을 정수로 변환 시도
			num = Integer.parseInt(result);
			System.out.println("변환성공");
		}catch(Exception e) {
			e.printStackTrace(); //이유를 알려주기 위해 찍어준다.
			//변환실패 출력
			System.out.println("변환실패");
		}
	}
}
