package com.kita.first.cafe;

import java.util.Scanner;

public class MenuItem {
	private String name;
	private int price;
	Scanner scan = new Scanner(System.in);
	
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%,d원", name, price);
	}
}
