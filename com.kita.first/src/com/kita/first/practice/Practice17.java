package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		
		System.out.println("11111111111");
		for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		System.out.println("222222222222");
		int star = 4;
		int line = 1;
		int st = 0;
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			st++;
			if(st == line) {
				System.out.println();
				line++;
				st = 0;
			}
			if(line > star) {
				break;
			}
		}System.out.println();
		
		
		
		System.out.println("333333333333");
		for(int i=1, j=1; i<=star*(star+1) / 2; i++) {
			System.out.print("*");
			if(i==j*(j+1)/2) {
				System.out.println();
				j++;
			}
		}System.out.println();
		
		
		
		System.out.println("444444444444");
		for(int i=1; i<=star; i++) {
			for(int z=star; z>0; z--) {
//				if(i<z) {
//					System.out.print(" ");
//				}else {
//					System.out.print("* ");
//				}
				System.out.print(i<z? "" : "*");
			}
			System.out.println();
		}
		
	}
}
