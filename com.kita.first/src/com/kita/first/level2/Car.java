package com.kita.first.level2;

public class Car {
	//필드
	private int speed;
	private String color;
	
	//생성자
	Car(int speed){
		this.speed = speed;
	}
	
	//메소드
	void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	int getSpeed() {
		return speed;
	}
}
