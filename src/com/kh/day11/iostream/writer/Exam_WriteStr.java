package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
//			char [] cBuf = "JDBC/JSP/Servlet".toCharArray();
			writer.write("JDBC/JSP/Servlet");
			writer.flush();
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
