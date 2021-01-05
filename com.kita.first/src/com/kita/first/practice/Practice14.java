package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d X %d = %2d  ", j, i, (i*j));   // \t는 탭이 된다 일정 간격으로 띄어짐
			}
			System.out.println();
		}
		
	}
}
