package com.kita.first;

public class ConditionOperator {

	public static void main(String[] args) {
		
		// 조건연산자(삼항연산자) A ? B : C;
		
		int n1 = 3;
		int n2 = 2;
		
		boolean isOdd = (n1%2 == 1) ? true : false;
		System.out.println(isOdd);
		
		String result1 = (n1>n2)? "n1이 n2보다 크다" : "n2이 n1보다 크다";
		System.out.println(result1);
	}

}
