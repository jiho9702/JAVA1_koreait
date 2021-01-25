package com.kita.first.level3;

public class Dog extends Animal{
	
//	Dog(){
//		super();
//	}
	
	@Override
	void crying() {
		System.out.println("개가 멍멍 운다.");
	}
	
	@Override
	void barking() {
		System.out.println("개가 왕왕 짖는다.");
	}
}
