package com.kita.first.level2;

public class IMac {
	private int memory = 500;
	private String color = "space gray";
	
	
	public IMac(int memory, String color) {
		this.setMemory(memory);
		this.color = color;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getMemory() {
		return memory;
	}
	public String getColor() {
		return color;
	}
		
	
	
	
}
