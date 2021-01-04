package com.kita.first;

public class For2 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i=0; i<5; i++) {
			
			for(int k=0; k<3; k++) {
				
				for(int z=0; z<3; z++) {
						
						System.out.printf("%d, %d, %d\n", i, k, z);
						count++;
					
				}
			}
		}
		System.out.printf("%d",count);
	}
}
