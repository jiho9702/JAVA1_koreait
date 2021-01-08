package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 {
	public static void main(String[] args) {
		
//		자판기 게임
//		메뉴 : 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
//		가격 : 900, 700, 400,  500,  600, 1000
//		
//		--메뉴--
//		1.콜라 900원
//		2.사이다 700원
//		.
//		.
//		6.웰치스 1000원
//		
//		메뉴를 입력하세요(0입력 시 종료): 1
//		콜라 : 900원
//		메뉴를 입력하세요(0입력 시 종료): 1
//		캔커피400원
//		
//		
//		메뉴를 입력하세요(0입력 시 종료): 0
//		합계 3700원
		
		String[] menuArr;
		int[] priceArr;
		int num;
		int total = 0;
		
		menuArr = new String[] {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		priceArr = new int[] {900, 700, 400, 500, 600, 1000};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--메뉴--");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d.%s %d\n", i+1, menuArr[i], priceArr[i]);
		
		
			while(true) {
				System.out.print("메뉴를 입력하세요(0입력시 종료): ");
				num = scan.nextInt();
				if(num<0 || num>6) {
					System.out.println("범위 내의 숫자를 입력하세요");
				continue;
				}else if(num == 0) {
					break;
				}
			}
		
		total += priceArr[num-1];
		System.out.printf("%s : %d\n", menuArr[num-1], priceArr[num-1]);
		
		}
		scan.close();
		System.out.printf("합계:%d원\n", total);
	}
}
	

//		while(true) {
//			System.out.print("메뉴를 입력하세요(0입력시 종료):");
//			num = scan.nextInt();
//			System.out.printf("%s : %d\n", menuArr[num-1], priceArr[num-1]);
//			
//			total += priceArr[num-1];
//			if(num > 6 || num < 0) {
//				System.out.println("잘못된 숫자입니다.");
//				continue;
//			}else if(num == 0) {
//				System.out.println("합계 :" + total);
//				break;
//			}
//			
//		}
//	}
//}




