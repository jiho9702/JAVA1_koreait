package com.kita.first;

public class Printf {

	public static void main(String[] args) {
			
//		System.out.print("\n");
//		System.out.println();  //같은 내용.
		
//		int age = 10;
//		String name = "김땡땡";
//		System.out.println("김땡땡은 10살이다.");
//		System.out.println(name+"은 "+age+"살이다.");
//		System.out.printf("%s은 %d살이다.", name, age);
		
		//올해로 20살이 된 김땡땡은 알바를 시작하여 매달 123만원을 받게 되었다. 김땡땡은 월급의 50%인 615000원을 떼어 A저축은행의 연 이자율 2.33%짜리 적금에 넣기로 결심했다.
			
		int age = 20;
		int salary = 1230000;
		String name = "김땡땡";
		int per = 50;
		int savings = 615_000;
		char bank = 'A';
		double rateOfInterest = 2.3333333333333;
		
		System.out.printf("올해로 %d살이 된 %s은 알바를 시작하여 매달 %,d원을 받게 되었다.\n", age, name, salary);
		System.out.printf("%s은 월급의 %d%%인 %d원을 떼어 %c저축은행의 연 이자율 %.2f%%짜리 적금에 넣기로 결심했다.\n", name, per, savings, bank, rateOfInterest);
	
	}
	
}
