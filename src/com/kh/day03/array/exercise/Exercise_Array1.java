package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1() 
	{
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		int [] nums = new int[5];
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
	}
	
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라.(단 배열의 크기는 5이다.)
		int [] arrs = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arrs.length; i++)
		{
			arrs[i] = sc.nextInt();
		}
		
		// 배열에 저장된 값을 이용하여 평균구하기!
		// for, arrs.length, typeTrans, 누적합
		int sum = 0;
		for(int j = 0; j < arrs.length; j++) {
			sum += arrs[j];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
	}

	public void arryCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 : ");
		String memberNum = sc.next();
		if(memberNum.length() != 14) {
			System.out.println("14자리를 입력해주세요.");
			return;
		}
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사의 시작!
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i]; // 성별자리 전까지 차례대로 값을 대입
			}else {
				copy[i] = '*';		// 성별자리 이후엔 *로 값 대입
			}
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}
	
	// 끝판왕 ^^
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		int [] lottoNums = new int[6];
		Random rand = new Random();
		// rand.nextInt(10) -> 0부터 9까지
		// 1 부터 45까지 -> ??
		// 0 부터 44까지 => rand.nextInt(45)+1
		
		// 22 16 22 45 6 29 
		// 22 1 39 14 14 19
		// 0  1 2  3  4  5
//		int count = 1;
//		int check = 1;
		// 중복없이 1 ~ 45 사이의 랜덤한 수를 6개 뽑는 것
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			for(int e = 0; e < i; e++) {
				if(lottoNums[i]==lottoNums[e]) {
					//다시 뽑아야지!!
					i--;
					break;
				}
			}
//			count++;
//			check++;
//			if(lottoNums[1]==lottoNums[0]) {
//				//다시 뽑아야지!!
//			}
//			//============================= 1
//			if(lottoNums[2]==lottoNums[1]) {
//				//다시 뽑아야지!!
//			}
//			if(lottoNums[2]==lottoNums[0]) {
//				//다시 뽑아야지!!
//			}
//			//============================= 2
//			if(lottoNums[3]==lottoNums[2]) {
//				//다시 뽑아야지!!
//			}
//			if(lottoNums[3]==lottoNums[1]) {
//				//다시 뽑아야지!!
//			}
//			if(lottoNums[3]==lottoNums[0]) {
//				//다시 뽑아야지!!
//			}
//			//============================= 3
		}

		// 버블정렬 해보기!
		// for의 변수가 증가하기만 하면됨 그래서 쉬움!!
		// 단, 안에 있는 for문의 조건식의 최대값은 감소(-i)해야함!!
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
				// 왼쪽이 크면 자리 바꾸기!!
				if(lottoNums[j] > lottoNums[j+1]) {
					int tmp = lottoNums[j];	// 왼쪽에 있는 값이 지워지기 전에 킵해 놓음
					lottoNums[j] = lottoNums[j+1]; // 오른쪽에 있는 놈을 왼쪽에 대입함.
					lottoNums[j+1] = tmp;	// 킵해놓은 것을 오른쪽에 대입함.
				}
			}
		}
		
//		lottoNums[0] = rand.nextInt(45)+1;
//		lottoNums[1] = rand.nextInt(45)+1;
//		lottoNums[2] = rand.nextInt(45)+1;
//		lottoNums[3] = rand.nextInt(45)+1;
//		lottoNums[4] = rand.nextInt(45)+1;
//		lottoNums[5] = rand.nextInt(45)+1;
		
		// 배열 출력하기
		for(int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
