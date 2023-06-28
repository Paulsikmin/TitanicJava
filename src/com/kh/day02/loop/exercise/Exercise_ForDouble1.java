package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) 
	{
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		// 구구단 출력
		for(int k = 1; k < 10; k++) {
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * "+k+" = "+h+"\t");
			}
			System.out.println();
		}
//		System.out.println();
//		for(int h = 2; h < 10; h++) {
//			System.out.print(h + " * 2 = "+h+"\t");
//		}
//		System.out.println();
//		for(int h = 2; h < 10; h++) {
//			System.out.print(h + " * 3 = "+h+"\t");
//		}
//		System.out.println();
//		for(int h = 2; h < 10; h++) {
//			System.out.print(h + " * 4 = "+h+"\t");
//		}
	}
}
