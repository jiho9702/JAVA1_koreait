package com.kita.first;

public class Operator7 {

	public static void main(String[] args) {
		
		int n1 = 3;
		int n2 = 5;
		
		boolean result1 = (n1>n2);
		System.out.println(result1);
		
		String str1 = "안녕";   //str1과 str2는 같은 주소값을 가진다.
		String str2 = "안녕";
		String str3 = new String("안녕");
		boolean result2 = (str1 == str2);
		System.out.println(result2);
		System.out.println(str1 == str3); //주소값 비교.
		System.out.println(str1.equals(str3));  //내용과 형식까지 비교
		System.out.println(str1.contentEquals(str3));  //내용 비교, 좀더 까다롭지 않은
		
		
		boolean result3 = "안녕".contentEquals(str1);
		System.out.println(result3);
	}

}
