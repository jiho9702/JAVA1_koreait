package com.kita.first;

public class NamedLoop {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Parent:
		for(int i=0; i<5; i++) {
			Child:
			for(int z=0; z<3; z++) {
				if(z==1) {
					//break;
					//continue Child;
					break Parent;
				}
				System.out.printf("%d, %d\n", i, z);
			}
		}
	}
}
