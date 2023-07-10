package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting.txt");
			byte [] data = "헬로우 입출력".getBytes();
			for(int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			os.flush();	// 버퍼 비우기
			System.out.println("파일 쓰기 완료");
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
