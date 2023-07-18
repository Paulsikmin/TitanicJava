package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
//		서버와 연결되었습니다.
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 23
//		잘못 입력하셨습니다. 형식에 맞게 입력해주세요.
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
//		계산결과 : 66
//		계산식(빈칸으로 띄어 입력, 예 24 + 42) >> exit
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			// 보낼 준비
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			for(;;) {
				// 데이터 보내기
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if(sendMsg.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();
				// 데이터 받기
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				System.out.printf("계산 결과 : %s\n", recvMsg);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
