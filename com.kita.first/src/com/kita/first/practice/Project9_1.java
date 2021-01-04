package com.kita.first.practice;

import java.util.Scanner;

public class Project9_1 {

	public static void main(String[] args) {
//		점수를 입력해 주세요: (0~100)
//		90점 이상 A 
//		80점 이상 B
//		70점 이상 C
//		나머지는 D입니다. ( +, - 없다) 
//		 		
//		100 초과면 잘못 입력하였습니다.
//
//		일의 자리 수가 7점 이상이면 +
//		일의 자리 수가 3점 이하이면 -
//		 		
//		예를 들어, 95점: A, 97점: A+, 83점: B-  **Integer.parseInt(month);**
		
		String grade = "";
		String grd = "";
		System.out.println("점수를 입력해주세요:  (0~100)");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if(score>100 || score < 0) {
			System.out.println(" 잘못입력하셨습니다.");
			return;
		}
		
		if(score == 100) {
			grd = "+";
		}
		if(score>=70 && score <100) {
			if(score%10 >=7) {
				grd = "+";
			}else if(score%10 <= 3) {
				grd = "-";
			}
		}
		
		switch(score/10) {
		case 10: case 9:
			grade = "A";
			break;  // 가장 가까운 하나의 조건문이나 반복문에서 나가기.
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default :
			grade = "D";
		}
		System.out.printf("%s"+"%s", grade, grd);
		
		
	}

}
