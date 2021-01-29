package com.kita.first.level3;

public abstract class Animal extends Object{ //상속만 가능하다. 객체로 생성할 일이 없으면 추상클래스로 지정면 좋다.    //클래스와 메소드에서만 붙일수 있다.
	//필드
	String name = "동물";
	
	//생성자
	Animal(){
		super();
	}
	
	//메소드
	abstract void crying();   //abstract + 리턴타입 + 이름 + 변수
	
	
	void barking() {
		
	}
}
