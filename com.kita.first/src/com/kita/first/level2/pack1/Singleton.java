package com.kita.first.level2.pack1;

public class Singleton {
	
	private static Singleton sg = null;  //주소값 없이 스태틱으로 올려준다
	
	private Singleton() {} // private = 내 클래스 내부에서만 사용가능하다. 외부에서 접근 ㄴㄴ  new singleton을 생성할수 없다.
	
		  /*메모리에 올려놔야지 따로 객체를 생성해서 접근하지 않아도 가져와서 쓸수있다.*/
	public static Singleton getInstance() {
		if(sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}