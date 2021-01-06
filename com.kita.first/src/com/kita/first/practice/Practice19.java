package com.kita.first.practice;

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		
		//합계산기 만들기
		//숫자를 입력하세요(0입력 시 종료):1
		//숫자를 입력하세요(0입력 시 종료):3
		//숫자를 입력하세요(0입력 시 종료):7
		//숫자를 입력하세요(0입력 시 종료):2
		//숫자를 입력하세요(0입력 시 종료):0
		//합계 : 13
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("숫자를 입력하세요(0입력 시 종료):");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.printf("합계 : %d\n", sum);
				break;
			}
			sum += num;
		}
		sc.close();
	}
}
