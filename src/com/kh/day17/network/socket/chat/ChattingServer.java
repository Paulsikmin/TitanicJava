package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null; 
		DataInputStream dis = null; // 보조스트림, 기본 데이터타입 입출력
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("채팅서버를 구동 중입니다...");
			serverSocket = new ServerSocket(port);
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			while(true) {	// 무한반복 서버에서 먼저 보냄!
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg); // 보내기
				dos.flush();
				String recvMsg = dis.readUTF();	// 받기
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
