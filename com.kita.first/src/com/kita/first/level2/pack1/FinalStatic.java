package com.kita.first.level2.pack1;

public class FinalStatic {
	//final : 최종의 의미 클래스에 붙으면 상속이 안된다.  내가 계층에서 마지막이다. 다른 클래스가 extends할수 없다.  상수를 지정할수 있다.
	final int N1;  //new로 값을 넣어줄수 있다.  final만 붙어있으면 상수라고 할수 없다.
	static final int N2 = 4;  //final과 static의 위치는 상관없다.  프로그램이 시작되면 메모리에 올라가있다.
	int n3 = 1;  //스태틱이 붙지 않은 필드  
	
	FinalStatic(int n1) {
		this.N1 = n1;
		printNum(n1);
	}
	
	FinalStatic(int n1, int n2) {
		this.N1 = n1;
		printNum(n1);
		n3 = n2;
	}
	
	 void printNum(int input) {   //메소드 앞에 final을 붙이면 오버라이딩이 안된다.  이 메소드가 최종메소드가 되야하므로 오버라이딩이 안된다.
		System.out.println(input);  //static void printNum() 스태틱이 붙은 메소드는 객체를 생성하지 않아도 사용가능하다.  클래스.메소드로 사용가능하다.
//		System.out.println(n3);  //스태틱이 붙은 printNum에서 사용하려하면 빨간줄이 뜬다
		call();  //void call은 스태틱으로 메모리에 올라가지 않았는데 call을 사용하면 없는친구로 인식해서 빨간줄이 뜨게된다.
	}
	//스태틱을 남용하지 말아야하는 이유 : 메모리를 사용할수 있는 공간이 줄어든다.  전체 메모리의 양이 100일때 static이 30이면 나는 70만 사용할수 있다. 비효율적이다.
	
	void call() {	
		System.out.println("안녕");
	}
	
	
	
	
	
	
	
}