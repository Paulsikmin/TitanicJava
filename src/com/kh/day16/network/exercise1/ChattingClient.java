package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {
	public static void main(String[] args) {
		String address = "192.168.60.227";
		int port = 7777;
		InputStream is = null;
		OutputStream os = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청중...");
			// 설정된 IP, PORT에 연결 요청함.
			Socket socket = new Socket(address, port);
			// 연결 된 후에는 소켓 객체 생성
			System.out.println("연결 성공!!");
			// 프로그램 기준 나가니까 OutputStream
			is = socket.getInputStream();
			// 프로그램 기준 들어오니까 InputStream
			os = socket.getOutputStream();
			
			while(true) {
				// 1. 데이터 보내기
				System.out.print("클라이언트(나) : ");
				String message = sc.nextLine();
				byte [] bytes = message.getBytes();
				// 보낼때 버퍼에 씀 write()메소드 사용
				os.write(bytes);
				// 버퍼 비워주기 flush()!
				os.flush();
				// =============== 보내기 완료 ============
				// 4. 데이터 받기
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				message = new String(bytes, 0, readByteNo);
				System.out.printf("서버(상대) : %s\n"
						, message);
				// ================= 받기 완료 ===============
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
