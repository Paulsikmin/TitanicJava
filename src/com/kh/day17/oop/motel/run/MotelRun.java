package com.kh.day17.oop.motel.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day17.oop.motel.controller.MotelController;
import com.kh.day17.oop.motel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) throws Exception {
		MotelView view = new MotelView();
		MotelController controller = new MotelController();
		Scanner sc = new Scanner(System.in);
		int chosenRoom = 0;
		Boolean changeYn = null;	// checkIn 또는 checkOut에 따라 성공여부를 리턴함
									// checkIn,checkOut 성공시 true 리턴
									// checkIn,checkOut 실패시 false 리턴
		end : 
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 : 
				chosenRoom = view.inputRoomNubmer("입실");
				if(chosenRoom != -1) {
					changeYn = controller.checkIn(chosenRoom);
					view.roomCheckin(changeYn, chosenRoom);
				}
				Thread.sleep(500);
				break;
			case 2 : 
				chosenRoom = view.inputRoomNubmer("퇴실");
				if(chosenRoom != -1) {
					changeYn = controller.checkOut(chosenRoom);
					view.roomCheckOut(changeYn, chosenRoom);
				}
				Thread.sleep(500);	
				break;
			case 3 : 
				List<Boolean> rList = controller.getAllRooms();
				view.printAllRooms(rList);
				Thread.sleep(1300);
				break;
			case 4 : 
				System.out.println(".");
				Thread.sleep(600);
				System.out.println(".");
				Thread.sleep(600);
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
