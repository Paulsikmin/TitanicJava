package com.kh.day03.array;

public class Exam_InsertionSort {
	public static void main(String [] args)
	{
		// 삽입정렬이란?
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!!
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// {2, 5, 4, 1, 3}
		// 1 : 2하고 5 비교 -> X
		// {2, 5, 4, 1, 3} => 1번째 결과
		// 2 : 5하고 4 비교 -> 교환
		// {2, 4, 5, 1, 3} => 2번째 결과
		// 3 : 5하고 1 비교 -> 교환
		// {2, 4, 1, 5, 3}
		// 4하고 1 비교 -> 교환
		// {2, 1, 4, 5, 3}
		// 2하고 1 비교 -> 교환
		// {1, 2, 4, 5, 3} => 3번째 결과
		// 4 : 5하고 3 비교 -> 교환
		// {1, 2, 4, 3, 5}
		// 4하고 3 비교 -> 교환
		// {1, 2, 3, 4, 5} => 4번째 결과
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}
		}
		// 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		//{2, 5, 4, 1, 3}
		// j = 1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}		
		// j = 2
//		//{2, 4, 5, 1, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		// j = 3
//		//{2, 4, 5, 1, 3}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		//{2, 4, 1, 5, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		//{2, 1, 4, 5, 3}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		//{1, 2, 4, 5, 3}
		// j = 4
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
//		//{1, 2, 4, 3, 5}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		//{1, 2, 3, 4, 5}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		//{1, 2, 3, 4, 5}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
		
	}
}
