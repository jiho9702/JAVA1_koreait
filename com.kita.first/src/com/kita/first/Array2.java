package com.kita.first;

public class Array2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][2];  //2개짜리 배열이 3개 들어간다.
		int[][] arr2 = {
							{1,2},
							{1,2},
							{1,2}
					   };
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		int[][] arr3 = new int[3][2];
		for(int i=0; i<3; i++) {
			for(int z=0; z<2; z++) {
				arr3[i][z] = z+1;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int z=0; z<arr3[i].length; z++) {
				System.out.print(arr3[i][z] + ", ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		for(int i=0; i<2; i++) {
			System.out.println(arr2[i].length);
		}
	}

}
