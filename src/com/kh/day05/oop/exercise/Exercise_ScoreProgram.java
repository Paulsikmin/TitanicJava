package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	public static void main(String [] args)
	{
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
//		Exercise_ScoreProgram score = new Exercise_ScoreProgram();
//		score.kor = 
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					inputScore();
					break;
				case 2 : 
					printScore();
					break;
				case 3 : 
					showGoodBye(); 
					break finish;
				default : printException();
			}
		}		
	}
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
//		====== 성적 입력 =======
//		국어 : 100
//		영어 : 90
//		수학 : 80
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 =======");
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
//		====== 성적 출력 ======
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		총점 : 270
//		평균 : 90.00
		System.out.println("====== 성적 출력 ======");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", kor+eng+math);
		System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다."); 
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
