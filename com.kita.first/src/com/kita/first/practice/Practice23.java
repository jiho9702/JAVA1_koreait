package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		
		int[] arr = {34, 67, 2, 11, 6, 90};
		int temp;
		
		for(int i=0; i<arr.length-1; i++) {   //순차정렬
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i] < arr[z]) {
					temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println(); 
		
		
		int temp1;
		for(int i=0; i<arr.length; i++) {
			int num1 = (int) (Math.random()*6)+1;
			int num2 = (int) (Math.random()*6)+1;
			if(arr[num1] < arr[num2]) {
				temp1 = arr[num1];
				arr[num1] = arr[num2];
				arr[num2] = temp1;
			}else if(arr[num1] == arr[num2]) {
				continue;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
