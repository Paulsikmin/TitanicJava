package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3];
			String result = "";
			while((readByteCount = is.read(readBytes, 0, 3)) != -1) {
//				readByteCount = is.read(readBytes);
//				if(readByteCount == -1) break;
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
