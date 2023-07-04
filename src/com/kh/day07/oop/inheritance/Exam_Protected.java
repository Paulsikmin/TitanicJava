package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent {
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		//super.pri = 4; // The field Parent.pri is not visible
	}
}

class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
//		super.def = 2; // The field Point.def is not visible
		super.pro = 3;
//		super.pri = 4; // The field Parent.pri is not visible
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}











