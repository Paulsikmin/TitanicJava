package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator calc = new Calculator();
		Calculator calc = new GoodCalc(); // 업캐스팅
		// 추상클래스는 객체 생성 안됌..
		// Cannot instantiate the type Calculator
		int [] a = {11,25,30,43,54};
		System.out.printf("합 : %d\n", calc.add(1,2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
		System.out.printf("평균 : %.2f\n", calc.average(a));
	}

}
