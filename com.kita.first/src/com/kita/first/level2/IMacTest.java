package com.kita.first.level2;

public class IMacTest {
	public static void main(String[] args) {
		
		IMac myIMac = new IMac(500, "sapcegray");
		
		myIMac.setMemory(1000);//원하는 값으로 세팅.  보이드는 리턴값이 없어서 다른 변수에 저장 불가능
		myIMac.setMemory(600);
		
//		myIMac.memory();가 안되기 때문에 get으로 받아준다.
		int myMemory = myIMac.getMemory();//겟으로 받아줘    겟또다제~~
		System.out.println(myMemory);
		
		
	}
	
}
