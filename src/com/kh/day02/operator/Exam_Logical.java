package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args)
	{
		System.out.println("논리연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		// 남자이면서 평균평점 4.3이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람
		result1 = (num1 == num2) && (num1 < num2); // false
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		
		// 연습문제1번-2
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100);
		//			false			true
		// aNum : 71, bNum : 55, result1 : true
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		// ** &&의 경우 앞이 false면 뒤는 계산하지 않음.
		result2 = (aNum < bNum) && (--bNum < 55);
		//          false            
		// aNum : 71, bNum : 55, result : false
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		//          true			 true
		// aNum : 72, bNum : 54, result3 : true
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		// ** ||의 경우 앞이 true면 뒤는 계산하지 않음.
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		//			true
		// aNum : 73, bNum : 54, result4 : true
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		
		
		
		
		
		
		
		
		
		
		
	}
}
