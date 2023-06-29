package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1()
	{
		//  5   4   3   2   1
		// 10   9   8   7   6
		// 15  14  13  12  11
		// 20  19  18  17  16
		// 25  24  23  22  21
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
//		arrs[0][4] = 1;
//		arrs[0][3] = 2;
//		arrs[0][2] = 3;
//		arrs[0][1] = 4;
//		arrs[0][0] = 5;
//		
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
//		
//		arrs[2][4] = 11;
//		arrs[2][3] = 12;
//		arrs[2][2] = 13;
//		arrs[2][1] = 14;
//		arrs[2][0] = 15;
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void exercise2()
	{
		// 5   10   15   20   25
		// 4    9   14   19   24
		// 3    8   13   18   23
		// 2    7   12   17   22
		// 1    6   11   16   21
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int j = 0; j < arrs.length; j++) {
			for(int h = arrs.length-1; h >= 0; h--) {
				arrs[h][j] = k;
				k++;
			}
		}
//		arrs[4][0] = 1;
//		arrs[3][0] = 2;
//		arrs[2][0] = 3;
//		arrs[1][0] = 4;
//		arrs[0][0] = 5;
//		
//		arrs[4][1] = 6;
//		arrs[3][1] = 7;
//		arrs[2][1] = 8;
//		arrs[1][1] = 9;
//		arrs[0][1] = 10;
//		
//		arrs[4][2] = 11;
//		arrs[3][2] = 12;
//		arrs[2][2] = 13;
//		arrs[1][2] = 14;
//		arrs[0][2] = 15;
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void exercise3()
	{
		//  1   6   11   16   21
		//  2   7   12   17   22
		//  3   8   13   18   23
		//  4   9   14   19   24
		//  5  10   15   20   25
		int [][] arrs = new int[5][5];
		int k = 1;
		
		for(int h = 0; h < arrs.length; h++) {
			for(int s = 0; s < arrs.length; s++) {
				arrs[s][h] = k;
				k++;
			}
		}
//		arrs[0][0] = 1;
//		arrs[1][0] = 2;
//		arrs[2][0] = 3;
//		arrs[3][0] = 4;
//		arrs[4][0] = 5;
//		
//		arrs[0][1] = 6;
//		arrs[1][1] = 7;
//		arrs[2][1] = 8;
//		arrs[3][1] = 9;
//		arrs[4][1] = 10;
		
		
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}		
	}
	public void exercise4()
	{
		//  1    2    3    4    5
		// 10    9    8    7    6
		// 11   12   13   14   15
		// 20   19   18   17   16
		// 21   22   23   24   25
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int s = 0; s < 5; s++) {
			if(s % 2 == 0) {
				for(int m = 0; m < 5; m++) {
					arrs[s][m] = k;
					k++;
				}
			}else {
				for(int m = 4; m >= 0; m--) {
					arrs[s][m] = k;
					k++;
				}
			}
		}
		
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[0][4] = 5;
//		
//		arrs[2][0] = 11;
//		arrs[2][1] = 12;
//		arrs[2][2] = 13;
//		arrs[2][3] = 14;
//		arrs[2][4] = 15;
		
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
//		
//		arrs[3][4] = 16;
//		arrs[3][3] = 17;
//		arrs[3][2] = 18;
//		arrs[3][1] = 19;
//		arrs[3][0] = 20;
		
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}		
	}
	public void exercise5()
	{
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3 3.4), (3.5 3.6), (3.7 4.0), (4.1 4.2)
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
		double sum = 0;
		for(int k = 0; k < score.length; k++) {
			for(int h = 0; h < score[k].length; h++) {
//				System.out.printf("%.1f ", score[k][h]);
				sum += score[k][h];
			}
//			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);
		
		
		
	}
}
