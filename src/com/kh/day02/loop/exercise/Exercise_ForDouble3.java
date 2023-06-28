package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		int count = 1;
		for(int j = 0; j < 10; j++) {
			for(int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			count++;
			System.out.println();
		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print("*");
//		}
		
	}
}
