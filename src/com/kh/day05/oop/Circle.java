package com.kh.day05.oop;

public class Circle {
	public int radius; // 원의 반지름
	public String name; // 원의 이름
	// =================================> 필드
	public Circle() {	// 생성자(기본)
		// 초기화
		radius = 1;
		name = "아무개"; // 필드에 값을 넣음 -> 객체 초기화
	}
	// 매개변수가 있는 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	// ==================================> 생성자
	public double getArea() {	// 원의 넓이를 구해주는 메소드
		return 3.14*radius*radius;
	}
	// ===================================> 메소드
	
//	public static void main(String [] args) {
//		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name +"의 면적은 " + area);
//	}
}









