package com.kita.first;

public class Variable3 {
	public static void main(String[] args) {
		
		int n1 = 10;
		float n2 = 5.5f;
		
		float result1 = n1 + n2;
		int result2 = n1 + (int)n2;	
		System.out.println(result1);
		System.out.println(result2);
		
		int n3 = 3; 
		int n4 = 4;
		String n5 = "5";
		
		System.out.println(n3+n4+n5);
		
		System.out.println(1+2+"3");
		System.out.println(1+"2"+3);
		System.out.println("1"+2+3); //놓여진 위치 순서에 따라 맞춰서 변한다. 오케이 해결
		
		
	}
}
