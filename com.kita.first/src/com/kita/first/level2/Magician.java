package com.kita.first.level2;

public class Magician extends Adventurer{
	int mp;	
	
	Magician(int strength,int intellegence,int dexterity,int luck, int mp){
		super(strength, intellegence, dexterity, luck);
		this.mp = mp;
	}
	
	@Override //부모객체에 같은 이름의 메소드가 있는지 확인한다.
	void attack() {//오버라이딩한다... 올라탄다, 덮어쓴다
		System.out.println("마법공격을 합니다.");
	}
	void teleport(){
		System.out.println("텔레포트를 합니다.");
	}
	
//	@Override
//	void jump() {
//		System.out.println("마법점프를 한다.");
//	}
}
