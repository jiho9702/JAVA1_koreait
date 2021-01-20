package com.kita.first.level2.hyori;

public class LeeSangSun {
	
	LeeSangSun(){
		super();
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi(); 
		hr.music = "유고걸";	
		hr.sns = "인스타";
//		hr.star = 10000000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");// 디폴트는 같은패키지 다른 클래스 사용가능
//		LeeHyoRi hr3 = new LeeHyoRi(10000000);// 같은패키지 다른 클래스는 프라이빗 사용불가능
		
		hr.sing();
		hr.drinkTea();
//		hr.dance();
	}
}
