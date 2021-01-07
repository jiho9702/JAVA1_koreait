package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		
		//up & down
		//컴퓨터가 뽑은 랜덤 수(10~90)
		//맞췄을때 Great!
		
		System.out.println("Let's play Up&Down Game!!");
		Scanner scan = new Scanner(System.in);
		int max = 90;
		int min = 10;
		int com = (int)(Math.random()*(max-min+1))+min;
		
		
		while(true) {
			System.out.print("Your Number:");
			
			int num = scan.nextInt();
			
			if(num > max || num < min) {     //범위 밖의 수를 입력했을때 컨티뉴를 사용해서 가장 가까운 반복문으로 이동해준다.
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
				continue;
			}
			
			if(num > com) {     // 숫자가 com보다 클경우 down을 출력한다.
				System.out.println("DOWN");	
			}else if(num < com) {      // 숫자가 com보다 작을경우 up을 출력한다.
				System.out.println("UP");
			}else {     //입력한 숫자가 com과 같을때 반복문을 탈출해준다.
				break;
			}
		}
		
		System.out.print("Great!!");
		scan.close();
		
	}
}
