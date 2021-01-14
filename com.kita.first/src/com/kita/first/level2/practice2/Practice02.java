package com.kita.first.level2.practice2;

public class Practice02 {
	
	public static void main(String[] args) {
		
		Practice02 calc = new Practice02();
		
		int n1 = sum(5,6);
		int n2 = calc.minus(4, 7);
		int n3 = calc.multiply(n1, n2);
		double n4 = calc.divide(5,3);
		
		int n5 = sum(5, 6, 7);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.printf("%.2f\n", n4);
		System.out.println(n5);
		
		//참조변수의 기본값은 null이다.
	}
	
	static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	static int sum(int num1, int num2, int num3) {
		int result = num1+num2+num3;
		return result;		
	}//오버로딩 = 같은 이름의 메소드를 사용할때 매개변수의 변수명이 다르거나 타입이 다르거나 개수가 다르거나 등의 차이가 있어야 한다.
	
	int minus(int num1, int num2) {
		return num1-num2;
	}
	int multiply(int num1, int num2) {
		return num1*num2;
	}
	double divide(int num1, int num2) {
		return num1/(double)num2;
	}
	
}
