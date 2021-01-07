package com.kita.first.practice;

public class PracticeHomework {
	public static void main(String[] args) {
		
//		while문에 조건식을 사용하여
//		1~100을 모두 더한 값이 출력되도록 하세요
//		합계:5050
		int sum = 0;
		int i=1;
		
		while(i<=100) {
			sum += i++;
		}
		System.out.printf("합계 : %d\n", sum);
		
		sum=0;
		for(int z=1; z<=100; z++) {
			sum += z;
			
		}System.out.printf("합계 : %d", sum);
	}
}
