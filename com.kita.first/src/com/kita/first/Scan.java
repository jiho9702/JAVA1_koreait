package com.kita.first;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요:");
		int num = scan.nextInt();
		System.out.println(num);
		
		String str = scan.next();
		System.out.println(str);
		
		scan.close();

	}

}
