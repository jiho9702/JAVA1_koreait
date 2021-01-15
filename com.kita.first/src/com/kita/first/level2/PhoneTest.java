package com.kita.first.level2;

public class PhoneTest {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone("갤럭시 S21", "노란색", 300);
		Phone yourPhone = new Phone("갤럭시 노트20", "빨간색", 250);
		
		System.out.println(myPhone.name);
		System.out.println(myPhone.color);
		System.out.println(myPhone.memory+"G");
		
		System.out.println(yourPhone.name);
		System.out.println(yourPhone.color);
		System.out.println(yourPhone.memory+"G");
		
		Phone phone1 = new Phone();
		System.out.println(phone1.name);
		
		Phone phone2 = new Phone("갤럭시 A80");
		System.out.print(phone2.name);
		System.out.print(phone2.color);
		System.out.println(phone2.memory);
		
		Phone phone3 = new Phone("갤럭시", "흰색");
		System.out.print(phone3.name);
		System.out.print(phone3.color);
		System.out.println(phone3.memory);
	}
}
