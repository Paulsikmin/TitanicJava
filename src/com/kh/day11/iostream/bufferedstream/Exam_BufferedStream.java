package com.kh.day11.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
// 성능 향상 보조스트립, BufferedStream
public class Exam_BufferedStream {
	public static void main(String[] args) {
		// 버퍼 크기를 5로하고 표준 출력 스트림(System.out)과 연결한
		// 버퍼 출력 스트림을 생성하라!
		FileReader fir = null;
		int readCharCount;
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
		Scanner sc = new Scanner(System.in);
		// System.out.pritnln("전달값");
		try {
			fir = new FileReader("src/com/kh/day11/iostream/javascript_cookie.txt");
			while((readCharCount = fir.read()) != -1) {
				bout.write(readCharCount);
			}
			bout.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
