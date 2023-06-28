package com.kh.day03.array;

public class Exam_BubbleSort {
	public static void main(String [] args)
	{
		// 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해서는 속도가 느린편이며 역순으로 정렬할 때 가장 느림
		// {2, 5, 4, 1, 3}
		
		// {2, 4, 1, 3, 5}
		
		// {2, 1, 3, 4, 5}
		
		// {2, 1, 3, 4, 5}
		
		// {1, 2, 3, 4, 5}
		int [] arrs = {2, 5, 4, 1, 3};
		// j=0 ~ 3
		for(int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}			
			}
		}
		// 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
//		//{2, 5, 4, 1, 3}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;			
//		}
//		//{2, 4, 5, 1, 3}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[3];
//			arrs[3] = temp;			
//		}
//		//{2, 4, 1, 5, 3}
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[4];
//			arrs[4] = temp;			
//		}
		// ============================================
//		//{2, 4, 1, 3, 5}
//		// j = 0 ~ 2
//		if(arrs[j] > arrs[j+1]) {
//			int temp = arrs[j];
//			arrs[j] = arrs[j+1];
//			arrs[j+1] = temp;			
//		}
//		//{2, 4, 1, 3, 5}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;			
//		}
//		//{2, 1, 4, 3, 5}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[3];
//			arrs[3] = temp;			
//		}
		//{2, 1, 3, 4, 5}
		// =============================================
//		// j = 0 ~ 1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[0];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;			
//		}
//		//{1, 2, 3, 4, 5}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;			
//		}
		//{1, 2, 3, 4, 5}
		// ==============================================
		// j = 0
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[0];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;			
//		}
//		//{1, 2, 3, 4, 5}
	}
}






