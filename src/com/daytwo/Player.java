package com.daytwo;

public class Player {
	
	private String name;
	private String value;
	
	public Player() {	
	}
	
	public Player(String name, String value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", value=" + value + "]";
	}
}
