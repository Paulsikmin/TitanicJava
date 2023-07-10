package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요~!
		InputStream is = null;
		
		try {
			// 주석 꼭 달아요!
			is = new FileInputStream("src/com/kh/day11/iostream/exercise/Exam_FileCopy.java");
			byte [] readBytes = new byte[1024];
			int readByteCount;
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
