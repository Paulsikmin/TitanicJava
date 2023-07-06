package com.kh.day09.exercise;

public class Exercise_Wrapper {
	public static void main(String[] args) {
		// "230515"와 "231026"인 문자열을
		// 계산해서 출력하시오
		String openDate = "230515";
		String closeDate = "231026";
		int result = Integer.parseInt(openDate) + Integer.parseInt(closeDate);
		System.out.println("결과 : " + result);
	}
}
