package com.kh.day09.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환1 : " + transDate1);
		System.out.println("형식 변환2 : " + transDate2);
		// ====================== 권장사항 ================================
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " + changed);
	}
}














