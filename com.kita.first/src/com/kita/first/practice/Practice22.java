package com.kita.first.practice;

public class Practice22 {

	public static void main(String[] args) {
		
		//정수 배열 만들어서
		//1~100까지 값을 배열 안에 넣고
		//배열 안에 든 값을 찍어보자.
		//1, 2, 3, ,,,, , 100
		
		int[] num = new int[100];
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		for(int i=0; i<num.length; i++) {
			System.out.printf("%d", num[i]);
			if(i<num.length-1) {
				System.out.printf(",");
			}
		}
	}
}
