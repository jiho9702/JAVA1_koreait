package com.kita.first.practice;

public class Practice13 {
	public static void main(String[] args) {
		
		//2단 ~ 9단 단이 하나 바뀔때 추가로 개행 한번 더
		for(int i=2; i<10; i++) {
			System.out.printf("[%d]단\n", i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, (i*j));
			}
			System.out.println();
		}
	}
}
