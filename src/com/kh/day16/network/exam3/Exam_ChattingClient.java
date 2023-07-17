package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam_ChattingClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청중...");
			Socket socket = new Socket(address, port);
			System.out.println("연결 성공!!");
			// 1. 데이터 보내기
			os = socket.getOutputStream();
			System.out.print("클라이언트(나) : ");
			String message = sc.nextLine();
			byte [] bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공!");
			// =============== 보내기 완료 ============
			// 4. 데이터 받기
			is = socket.getInputStream();
			bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			message = new String(bytes, 0, readByteNo);
			System.out.printf("서버(상대) : %s\n"
					, message);
			// ================= 받기 완료 ===============
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


