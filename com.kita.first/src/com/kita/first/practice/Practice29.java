package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
		
//		숫자야구게임 시작!
//		값1 : 1
//		값2 : 2
//		값3 : 3
//		S:0/ B:0/ O:2
//		.
//		.
//		값1 : 4
//		값2 : 3
//		값3 : 9
//		END!
		
		Scanner scan = new Scanner(System.in);
		
		final int LEN = 3;
		
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		System.out.println("숫자야구게임 시작!!");
		
		for(int i=0; i<LEN; i++) {
			rArr[i] = (int)(Math.random()*9)+1;
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<LEN; i++) {
			System.out.print(rArr[i]);
		}
		System.out.println();
		
		int sCount=0;
		int bCount=0;
		
		while(true) {
			
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d:",i+1);
				myArr[i] = scan.nextInt();
				if(1 < myArr[i] || myArr[i] > 9) {
					i--;
					System.out.println(" 범위 내의 수를 입력해주세요.");
					continue;
				}
				for(int z=0; z<i; z++) {
					if(myArr[i] == myArr[z]) {
						i--;
						System.out.println("중복된 수 입니다.다시 입력해주세요.");
						break;
					}
				}
			}
//			for(int i=0; i<LEN; i++) {
//				for(int z=0; z<LEN; z++) {
//					if(myArr[i] == rArr[z]) {
//						if(i == z) {
//							sCount++;
//						}else {
//							bCount++;
//						}
//					}
//				}
//			}
			
			for(int i=0; i<LEN; i++) {
				if(myArr[i] == rArr[i]) {
					sCount++;
				}
			}
				
			for(int i=0; i<LEN; i++) {		
				for(int z=0; z<LEN; z++) {
					if(myArr[i] == rArr[i]) {
						continue;
					}else if(myArr[i] == rArr[z]){
						bCount++;
					}
				}
			}
			
			if(sCount == LEN) {
				System.out.println("END!!");
				break;
			}
			
			System.out.printf("S:%d B:%d O:%d\n", sCount, bCount, LEN-(sCount+bCount));
			sCount = 0;
			bCount = 0;
		}
		scan.close();
	}
}


















