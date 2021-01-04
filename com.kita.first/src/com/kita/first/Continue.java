package com.kita.first;

public class Continue {
	public static void main(String[] args) {
		
		for(int i=0; i<2; i++) {
			for(int z=0; z<3; z++) {
				for(int r=0; r<3; r++) {	
					if(r==1) {
						continue; //continue를 만난순간 밑의 내용을 보지 않고 반복식을 시작한다. 
					}
					System.out.printf("%d, %d, %d\n", i, z, r);
				}
			}
		}		
	}
}
