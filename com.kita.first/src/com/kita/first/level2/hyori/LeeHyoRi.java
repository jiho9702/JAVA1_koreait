package com.kita.first.level2.hyori;

public class LeeHyoRi {	

	//필드
	public String music;    //어디서든 사용가능하다.
	protected String sns;   //디폴트 상태의 필드는 동일 패키지 내부에서만 사용, protected도 동일패키지에서 사용가능. 또한 상속을 받게되면 사용가능하다.
	private int star;		//클래스 내부에서만
	
	//생성자
	public LeeHyoRi() {}
	
	
	protected LeeHyoRi(String sns){
		this.sns=sns;
	}
	
	private LeeHyoRi(int star) {
		this.star = star;
	}
	
	//메소드
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi(); 
		hr.music = "유고걸";	
		hr.sns = "인스타";
		hr.star = 10000000;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
		LeeHyoRi hr3 = new LeeHyoRi(10000000); //클래스 내에서는 다 생성가능하다
		
		hr.sing();
		hr.drinkTea();
		hr.dance();
	}
	
	public void sing() {}
	
	protected void drinkTea(){}
	
	private void dance() {}  //스태틱이 안붙어서 객체를 통해 접근해야한다.
	
}
