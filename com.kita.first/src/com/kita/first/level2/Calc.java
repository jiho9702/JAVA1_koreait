package com.kita.first.level2;

public class Calc {
	
	//필드
	
	
	//생성자
	
	
	//메소드. 영어의 동사로 만드는 것이 좋다
	public static void main(String[] args) {
		
		Calc myCalc1 = new Calc();
//		Calc myCalc2 = new Calc();
//		Calc myCalc3 = new Calc(); //같은 설계도로 만든 계산기 3개.
		
		myCalc1.powerOn();
		
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		
		int num1 = myCalc1.sum(2,3);
		int num2 = myCalc1.minus(2,3);
		int num3 = myCalc1.multiply(2, 3);
		float num4 = myCalc1.divide(3, 2);		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		myCalc1.powerOff();
		
	}
	
	public void powerOn(/*매개변수*/) {
		
		System.out.println("전원을 켭니다.");
		
	}
	
	//void 형일때는 이렇게 생겼다.
	//void는 리턴(값을 돌려준다)을 해주지 않는다.
	//비 보이드형 => public static int(리턴 형식) sum(){
	//					return (리턴 해줘야 하는 변수);
	//			 }
	
	public int sum(int n1, int n2) {
		int result = n1+n2;
		System.out.println(result);
		return result;
		
		//return n1+n2;
	}
	
	public int minus(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	
	public int multiply(int n1, int n2) {
		return n1*n2;
	}
	
	public float divide(int n1, int n2) {
		return (float)n1/n2;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}






















