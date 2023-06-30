package com.kh.day05.oop.exercise;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!!"); // (1)
	}

	public Suit(int size, String brand) {
		this(size, brand, 100000);
		System.out.println("Suit(int,String)호출"); // (2)
	}

	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,String,int)호출");// (3)
	}
	
	public static void main(String [] args) {
		Suit suit = new Suit(100);
	}
}