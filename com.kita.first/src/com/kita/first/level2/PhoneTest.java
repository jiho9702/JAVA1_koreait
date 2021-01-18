package com.kita.first.level2;

public class PhoneTest {
	public static void main(String[] args) {
		
		GalaxyPhone sNote20 = new GalaxyPhone("s노트20", "파란색", 300, "갤럭시");
		System.out.println(sNote20.ai_secr);
		sNote20.sendMsg("안녕");
		
		System.out.println("회사:"+sNote20.company);
		System.out.println("기종명:"+sNote20.name);
		System.out.println("색상:"+sNote20.color);
		System.out.println("메모리:"+sNote20.memory);
		
		
//		Phone myPhone = new Phone("갤럭시 S21", "노란색", 300);
//		Phone yourPhone = new Phone("갤럭시 노트20", "빨간색", 250);
//		
//		System.out.print(myPhone.name);
//		System.out.print(myPhone.color);
//		System.out.println(myPhone.memory+"G");
//		System.out.println();
//		
//		System.out.print(yourPhone.name);
//		System.out.print(yourPhone.color);
//		System.out.println(yourPhone.memory+"G");
//		System.out.println();
//		
//		Phone phone1 = new Phone();
//		System.out.println(phone1.name);
//		System.out.println();
//		
//		Phone phone2 = new Phone("갤럭시 A80");
//		System.out.print(phone2.name);
//		System.out.print(phone2.color);
//		System.out.println(phone2.memory);
//		System.out.println();
//		
//		Phone phone3 = new Phone("갤럭시", "흰색");
//		System.out.print(phone3.name);
//		System.out.print(phone3.color);
//		System.out.println(phone3.memory);
//		System.out.println();
		
	}
}
