package com.kita.first.level2.practice2;

public class PTest {
	public static void main(String[] args) {
		
		Practice03 myP = new Practice03("김멍멍", 20);
		
		myP.setName("김냥냥");
		//이름, 나이 출력
		String myName = myP.getName();
		int myAge = myP.getAge();
		System.out.println(myName);
		System.out.println(myAge);
		
		System.out.printf("이름은 %s 나이는 %d\n", myName, myAge);
		System.out.printf("이름은 %s 나이는 %d\n", myP.getName(), myP.getAge());
		
	}
}
