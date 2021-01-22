package com.kita.first.level3;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.crying();
		cat.crying();
		
//		animal = new Animal();
		
		animal = cat;   //이렇게 하면 animal은 cat의 주소값을 가지게 된다.  //animal = new Cat();
		animal.crying();//띠용!!! 객체의 타입을 부모타입으로 지정하면 그안에 어떤 자식을 넣더라도 오버라이딩이 된 재 정의된 여러가지 다양한 메소드를 호출할수 있다.
		
		animal = new Dog();  //부모자식간에서만 사용가능하다.  부모타입의 변수 안에는 자식타입의 변수를 넣어도 알아서 형변환을 시켜준다.  다형성
		animal.crying();
//		animal.barking();  //애니멀타입의 통로를 통해서 도그타입으로 들어가는것이라 애니멀에 없는것필드 혹은 메소드를 실행하려하면 되지않는다.  animal to animal's method to dog
		
//		System.out.println(animal);
//		System.out.println(cat);
//		
//		System.out.println(animal == cat);
	}
}
