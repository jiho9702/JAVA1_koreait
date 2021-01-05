package com.kita.first.practice;

public class Practice12 {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			System.out.printf("*");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.println("*");
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=5-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=5-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>i; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print(" *");
			}
			for(int j=5-i; j>1; j--) {
				System.out.print("    ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			for(int j=i+1; j<5; j++) {
				System.out.print("    ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
	}
}
