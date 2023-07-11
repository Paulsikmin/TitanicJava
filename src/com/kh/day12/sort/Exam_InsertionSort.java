package com.kh.day12.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		int [] nums = {5, 7, 2, 1, 4};
		// 5, 7, 2, 1, 4 // 1번째 결과
		
		// 5, 2, 7, 1, 4 
		// 2, 5, 7, 1, 4 // 2번째 결과
		
		// 2, 5, 1, 7, 4
		// 2, 1, 5, 7, 4
		// 1, 2, 5, 7, 4 // 3번째 결과
		
		// 1, 2, 5, 4, 7
		// 1, 2, 4, 5, 7
		// 1, 2, 4, 5, 7
		// 1, 2, 4, 5, 7 // 4번째 결과
		// 삽입정렬
		for(int i = 1; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// 출력
		for(int i : nums) {
			System.out.print(i + " ");
		}
	}
}









