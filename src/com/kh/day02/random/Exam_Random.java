package com.kh.day02.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args)
	{
		// Math.random()
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			// nextInt(n) -> 0부터 n-1까지의 랜덤한 수 리턴!
			System.out.println(rand.nextInt(11) + 25);
			// 1부터 10까지의 수 중에서 랜덤한 값을 출력하고 싶으면?
			// 0부터 9까지 -> nextInt(10)
			// 1부터 10까지 -> nextInt(10) + 1;
			// 25부터 35사이의 랜덤한 수 출력하기
			// 0부터 10사이 -> nextInt(11)
			// 25부터 35사이 -> nextInt(11)+25;
		}
	}
}








