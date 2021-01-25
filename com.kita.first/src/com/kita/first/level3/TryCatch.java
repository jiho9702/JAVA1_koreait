package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
		
		String str = "123.45";
		int num1;
		double num2;
		try {
			num1 = Integer.parseInt(str);
			System.out.println(num1);
			System.out.println("성공");
		}catch(Exception e) {
			e.printStackTrace();
			num2 = Double.parseDouble(str);
			System.out.println(num2);
			System.out.println("실패");
		}finally{
			System.out.println("형변환 시도종료");
		}
		
		double n1 = 3.4;
		int n2 = (int)n1; // 자동형변환
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		System.out.println("3" + 1 + 2);
		
		Animal ani = new Animal();
		Cat cat = new Cat();
		ani = cat;
		
		try {
			Dog dog = (Dog)ani;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("문제 발생.. 다시 시도하세요..");
		}finally { //옵션
			System.out.println("형변환 시도종료");
		}
	}
}
