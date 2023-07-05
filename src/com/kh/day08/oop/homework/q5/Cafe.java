package com.kh.day08.oop.homework.q5;

public abstract class Cafe {
	String name;

	public Cafe() {}
	public Cafe(String name) {
		this.name = name;
	}
	
	// 커피를 만들어줌!!
	abstract public void makeCoffee(int money);
}
