package com.kh.day01.typetrans;

public class Exam_TypeTrans2 {
	public static void main(String [] args) 
	{
		byte bNum = 127;
		int iNum = 100;
		int iNum2 = 10;
		double dNum = 4.0;
		
		// 자동 형변환
		System.out.println(bNum + iNum); // byte -> int
		System.out.println(iNum2 / dNum); //  int -> double;
		// 강제 형변환
		System.out.println((byte)(bNum + iNum));
		System.out.println((int)2.9 + 1.8);
		// 자동 형변환 : int -> double, 강제 형변환 : double -> int
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
		
		
	}
}
