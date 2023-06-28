package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) 
	{
		// 0시 0분부터 23시 59분까지 출력하기!
		for(int k = 0; k < 24; k++) {
			for(int h = 0; h < 60; h++) {
				System.out.printf("%2d시 %2d분\n", k, h);
			}
		}
	}
}
