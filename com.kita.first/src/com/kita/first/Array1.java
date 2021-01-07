package com.kita.first;

import java.util.Scanner;

//import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		
//		int sum = 0;
//		int[] arr1 = new int[4]; 
//		arr1[0] = 1;
//		arr1[1] = 4;
//		arr1[2] = 5;
//		arr1[3] = 2;
//		
//		for(int i=0; i<4; i++) {
//			sum += arr1[i];
//		}
//		System.out.println(sum);
//		int arr[4] = {};
//		
//		boolean[] arr2 = new boolean[2];
//		System.out.println(arr2[1]);
//		
//		int[] arr4 = {1, 4, 5, 2};
//		for(int i=0; i<4; i++) {
//			System.out.println(arr4[i]);
//		}
//	
//		int[] arr5;
//		arr5 = new int[] {1, 2, 3};
//		
		Scanner scan = new Scanner(System.in);
		
		int[] arr;
		for(int i=0; i<3; i++) {
			int num = scan.nextInt();
			arr = new int[] {num};
			System.out.println(arr[i]);
		}
		scan.close();
		
		
		int[] arr6 = new int[5];
		
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = i+1;
		}
		
		for(int i=0; i<arr6.length; i++) {
			System.out.printf("%d ", arr6[i]);
		}
	}
	
}
