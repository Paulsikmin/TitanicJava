package com.kh.day17.oop.motel.view;

import java.util.List;
import java.util.Scanner;

public class MotelView {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.print("1.입실 2.퇴실 3.방보기 4.종료\n");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public int inputRoomNubmer(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번방에 "+category+"하시겠습니까? ");
		int roomNo = sc.nextInt();
		if(roomNo < 0 && roomNo > 10) {
			System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
			return 1;
		}else {
			return roomNo;
		}
	}
	
	public void printAllRooms(List<Boolean> rList) {
		for(int i = 0; i < rList.size(); i++) {
			if(!rList.get(i))
				System.out.println((i+1)+"번 방이 현재 비어 있습니다.");
			else
				System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
		}
	}
	
	public void roomCheckin(Boolean roomState, int roomNo) {
		if(!roomState) 
			System.out.println(roomNo + "번 방에 입실하셨습니다.");
		else 
			System.out.println(roomNo + "번방은 현재 손님이 있습니다.");
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void roomCheckOut(Boolean roomState, int roomNo) {
		if(roomState) 
			System.out.println(roomNo + "번 방에 퇴실하셨습니다.");
		else 
			System.out.println(roomNo + "번방은 현재 빈 방입니다.");
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
