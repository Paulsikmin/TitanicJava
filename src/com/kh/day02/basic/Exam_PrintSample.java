package com.kh.day02.basic;

public class Exam_PrintSample {
	public static void main(String[] args) {
		System.out.println("개행 포함된 출력 메소드");
		System.out.print("개행이 없이 출력 메소드");
		System.out.println("<- 바로 옆으로 붙어 버림");
		
		// %d : 정수, %f : 실수, %s : 문자열, %c : 문자
		// \n : 개행, \t : 탭
		System.out.printf("정수 출력 : %3d\n", 11);
		System.out.printf("실수 출력 : %.3f\n", 10.26);
		System.out.printf("문자열 출력 : %s\n", "자바 printf 문자열 출력");
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 %b입니다\n"
				, 'F', "공공데이터 개발자", 5.15, 10.26, true);
	}

}
