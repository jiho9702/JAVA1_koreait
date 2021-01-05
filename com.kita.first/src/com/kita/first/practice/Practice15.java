package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		
		System.out.println("1");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("----------");
		int star = 4;
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			if(i%star == 0) {
				System.out.println();  
			}
		}
		System.out.println("----------");
		System.out.println();
		
		System.out.println("2");
		for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("3");
		for(int i=4; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("4");
		for(int i=0; i<4; i++) {
			for(int j=4-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("5");
		for(int i=0; i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("6");
		for(int i=0; i<4; i++) {
			for(int j=4-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("7");
		for(int i=0; i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=4; j>i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
