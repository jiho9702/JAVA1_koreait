package com.kita.first;

public class While1 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"입니다.");
		}
		System.out.println();
		
		int i=0;
		while(i<5) {
			i++; //증감식
			System.out.println(i+"입니다.");
		}
	}
}
