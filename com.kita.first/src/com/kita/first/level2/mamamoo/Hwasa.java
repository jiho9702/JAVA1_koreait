package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi{
	
	public Hwasa(){ //디폴트는 프로텍티드를 붙이지 않으면 접근 불가능하다.
		super("인스타");
		this.sns = "";
		this.music="";
//		this.star = ;
		
		this.drinkTea();
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi(); 
		hr.music = "유고걸";	
//		hr.sns = "인스타"; //본인 패키지내의 다른 클래스에 접근 가능 == 디폴트
//		hr.star = 10000000;
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(10000000);
		
		hr.sing();
//		hr.drinkTea();
//		hr.dance();
	}

}
