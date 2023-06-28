package com.kh.day02.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args)
	{
		// 삼항연산자
		// (조건식) ? 참일때 : 거짓일때
		// - 조건식은 반드시 true/false로 반환
		// - 비교/논리연산자 주로 사용
		// 예제
		// 정수를 입력받아 짝수인지 홀수인지 판별하는
		// 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		// if문 대신 삼항연산자를 이용하여 짝홀판별 가능!
		String result = (input % 2 == 0) ? "짝수" : "홀수";
//		if(input % 2 == 0) {
//			result = "짝수";
//			//System.out.println("짝수입니다.");
//		}else {
//			result = "홀수";
//			//System.out.println("홀수입니다.");
//		}
		System.out.println(input + "은/는" + result + "입니다.");
	}
}
