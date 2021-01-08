package com.kita.first;

public class ArrayOrder1 {
	public static void main(String[] args) {
		
		int[] arr = {7, 1, 45, 0, 2};
		
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i] > arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;	
				}
							}
		}
		
		for(int num : arr) {
			System.out.println(num + ", ");
			
		}
		System.out.println();
		System.out.println();
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
