package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte [] data = "레알 입출력".getBytes();
			os.write(data, 0, 9);
			os.flush(); // 버퍼 지우기
			System.out.println("쓰기 완료~!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
