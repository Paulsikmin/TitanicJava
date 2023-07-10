package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			// 주석 쓰세요
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			// 제발
			char [] cBuf = new char[3];
			// 제발
			int readCharCount;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf, 0, 3);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
