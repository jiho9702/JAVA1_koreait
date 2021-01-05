package com.kita.first.practice;

public class Practice01 {
	
	public static void main(String[] args) {
		
		/* 
		 * 안녕하세요.
		 * 저는 이지호입니다.
		 * 만나서 반갑습니다.
		 * */
		
		
		String[] arr = {"안녕하세요", "저는 이지호입니다.", "만나서 반갑습니다."};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]);
			i++;
		}

		System.out.println("안녕하세요");
		System.out.println("저는 이지호입니다.");
		System.out.println("만나서 반갑습니다.");
		
		System.out.print("안녕하세요.\n저는 이지호 입니다.\n만나서 반갑습니다.\n");

	}

}
