package com.kita.first.level2;

public class Phone extends Object {//모든 객체는 최상위 클래스인 오브젝트를 상속받는다 
	
	//설계도(class)의 객체 new를 붙여서 만든 객체 = class의 instance
	//필드 : 속성 , 변수와 비슷하다    ||(타입)(변수명); ->변수를 선언 초기화 x || (타입)(변수명) = (값); ->초기화||
	//메인을 만들기 전에 생긴 변수들을 필드라고 한다.
	String company;
	String name;
	String color;
	int memory;
	
	//생성자 : Scanner scan = new "Scanner(System.in);" Calc instance를 생성하는 생성자이다.
	Phone(){
		super(); //부모클래스
	}
	
	Phone(String company){
		this(company, "휴대폰", "검은색", 200);
	}
	
	Phone(String company, String name){
//		this.name = name; 맨 첫줄에만 this를 사용가능하다.
		this(company, name, "검정색", 200);
	}
	
	Phone(String company, String name, String color){
		this(company, name, color, 200);
	}
	
	Phone/*클래스명과 똑같이*/ (String company, String name, String color, int memory/*매개변수 선언*/){  //필드를 초기화시켜주는 역할
		/* this : 내가 속해있는 객체를 가리키고 있다. 내가 속해있는 객체의 이름*/
		this.company = company;
		this.name = name;
		this.color = color;
		this.memory = memory;
	}
	//기본 생성자 : Phone(){ super }  ->  생성자를 정의하지 않았을때 컴퓨터가 자동으로 만들어준다.
	
	
	//메소드 : 동작  ||핸드폰으로 할수 있는 동작들...
	
	String/*리턴타입*/ sendMsg(String str) {
		String result = str; //String sendMsg(String str)의 전역변수
//		String blank = "";   //String sendMsg(String str)의 전역변수
//		if("".equals(str)) {
//			//int result1;     //String sendMsg(String str)의 지역변수
//			result = blank;
//		}
//		System.out.println(blank);  
		System.out.println(str);
		return result;
	}
	
	void call() {
		
	}
}
//public은 파일의 명과 같을때만 사용할수 있다.
class computer{  // 만들수는 있지만 접근제한자를 사용할수 없다.
	//하나의 파일안에 class가 두개가 들어있어도 두개로 나뉘어져서 저장이 된다.
}
