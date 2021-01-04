package com.kita.first.practice;

public class Practice12 {
	public static void main(String[] args) {
		
		int star = 3;
		
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<star; i++) {
			System.out.println("*");
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print("*");
			for(int z=0; z<5; z++) {
				System.out.println("*");
			}
		}
		
	}
}
