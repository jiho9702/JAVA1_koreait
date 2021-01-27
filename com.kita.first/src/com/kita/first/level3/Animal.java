package com.kita.first.level3;

public abstract class Animal extends Object{ //상속만 가능하다. 객체로 생성할 일이 없으면 추상클래스로 지정면 좋다.
	
	Animal(){
		super();
	}
	
	void crying() {
		System.out.println("동물이 운다");
	}
	void barking() {
		
	}
}
