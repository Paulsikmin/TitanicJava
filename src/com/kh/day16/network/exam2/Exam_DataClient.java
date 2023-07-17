package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_DataClient {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		String ipAddress = "127.0.0.1";
		int port = 4885;
		try {
			System.out.println("연결 요청");
			Socket socket = new Socket(ipAddress, port);
			System.out.println("연결 성공");
			//================ 데이터 보내기 ==================
			os = socket.getOutputStream(); // 소켓에서 스트림 가져옴
			String message = "Hello Server!";
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//=================================================
			// =============== 데이터 받기 ====================
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			message = new String(bytes, 0, readByteNo);
			System.out.printf("데이터 받기 성공 : %s\n", message);
			
			//=================================================
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
