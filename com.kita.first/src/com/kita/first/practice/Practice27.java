package com.kita.first.practice;

public class Practice27 {
	public static void main(String[] args) {
		
		//{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}
		
		int[][] arr = new int[4][3];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				
				arr[i][z] = num++;
			}
		}
		System.out.print("{");
		for(int i=0; i<arr.length; i++) {
			System.out.print("{");
			for(int z=0; z<arr[i].length; z++) {
				System.out.printf(" %d ", arr[i][z] );
			}
			System.out.print("}");
		}
		System.out.print("}");
		
		
	}
}
