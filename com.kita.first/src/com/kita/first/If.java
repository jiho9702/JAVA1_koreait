package com.kita.first;

public class If {
	public static void main(String[] args) {
		
		int n1 = 3141592;
//		int n2 = 2;
//		boolean isOdd = (n1%2 == 1) ? true : false;
		
		String oddNum;
		
		if(n1%2 == 1) {
			oddNum = "홀수"; 
		}else {
			oddNum = "짝수";
		}
	
		System.out.printf("%d은(는) %s입니다.", n1, oddNum);
	}

}
