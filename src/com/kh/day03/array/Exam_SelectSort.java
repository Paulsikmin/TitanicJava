package com.kh.day03.array;

public class Exam_SelectSort {
	public static void main(String[] args) {
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬 알고리즘.
		// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함.
		// {2, 5, 4, 1, 3}
		// 첫번째 : {1, 5, 4, 2, 3}
		// {1, 5, 4, 2, 3}
		// 두번째 : {1, 2, 4, 5, 3}
		// {1, 2, 4, 5, 3}
		// 세번째 : {1, 2, 3, 5, 4}
		// {1, 2, 3, 5, 4}
		// 네번째 : {1, 2, 3, 4, 5}

		// 1. 최소값의 값을 구하는 방법으로
		// 2. 배열의 값을 교환.
		// 3. min값은 최소값이 아니라 인덱스값을 저장해야함.
		// 4. 최소값을 찾는 범위가 시작은 1이 되고 1씩 증가해야했었고
		// 바꿔야 하는 자리는 0부터 시작해서 1씩 증가해야했음.
		// 5. 만족하는 변수를 선언하여 1씩 증가하는 for문 작성 후 코드를 이동
		int[] arrs = { 2, 5, 4, 1, 3 };
		int min = 0;

		for (int j = 0; j < arrs.length-1; j++) {
			min = j;
			for (int i = j + 1; i < arrs.length; i++) {
				if (arrs[min] > arrs[i]) {
					min = i;
				}
			}
			int temp = arrs[j];
			arrs[j] = arrs[min];
			arrs[min] = temp;
		}

//		int [] arrs = {2, 5, 4, 1, 3};
//		int min = 0; // min은 최소값 저장하면 안되고 최소인 인덱스값을 저장해야함.ㅇㅇ
//		for(int i = 0; i < arrs.length-1; i++) {
//			min = i;
//			for(int j = i+1; j < arrs.length; j++) {
//				if(arrs[min] > arrs[j]) {
//					min = j;
//				}
//			}
//			int temp = arrs[i];
//			arrs[i] =arrs[min];
//			arrs[min] = temp;
//		}
		// 배열출력
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

		// {2, 5, 4, 1, 3}
		// j=1, min = 0;
		// 첫번째 : {1, 5, 4, 2, 3}
		// {1, 5, 4, 2, 3}
		// j=2, min = 1;
		// 두번째 : {1, 2, 4, 5, 3}
		// {1, 2, 4, 5, 3}
		// j=3, min = 2;
		// 세번째 : {1, 2, 3, 5, 4}
		// {1, 2, 3, 5, 4}
		// j=4, min = 3;
		// 네번째 : {1, 2, 3, 4, 5}

	}
}
