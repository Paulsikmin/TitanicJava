package com.kh.day17.oop.motel.run;

import java.util.Scanner;

import com.kh.day17.oop.motel.controller.MotelController;
import com.kh.day17.oop.motel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) throws Exception {
		MotelView view = new MotelView();
		MotelController controller = new MotelController();
		Scanner sc = new Scanner(System.in);
		end : 
		while(true) {
			int choice = view.printMenu();
			int chosenRoom = 0;
			switch(choice) {
			case 1 : 
				chosenRoom = view.inputRoomNubmer("입실");
				controller.checkIn(chosenRoom);
				Thread.sleep(500);
				break;
			case 2 : 
				chosenRoom = view.inputRoomNubmer("퇴실");
				controller.checkOut(chosenRoom);
				Thread.sleep(500);
				break;
			case 3 : 
				controller.printAllRooms();
				Thread.sleep(2000);
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
