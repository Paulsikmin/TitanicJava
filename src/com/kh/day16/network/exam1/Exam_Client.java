package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Client");
		Socket socket = null;
		
		try {
			System.out.println("연결 요청중");
			socket = new Socket("127.0.0.1", 4885);
			System.out.print("연결 수락됨");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
