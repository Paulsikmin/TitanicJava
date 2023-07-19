package com.kh.day17.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

public class MotelController {

//	List<Room> rList;
	List<Boolean> rList;
	
	public MotelController() {
//		rList = new ArrayList<Room>();
		rList = new ArrayList<Boolean>();
		for(int i = 0; i < 10; i++) {
//			rList.add(new Room());
			rList.add(false);
		}
	}
	
	public List<Boolean> getAllRooms() {
		return rList;
	}
	
	public Boolean checkIn(int roomNo) {
		Boolean flag = false;
		if(!rList.get(roomNo-1)) {
			rList.set(roomNo-1, true);
			return !flag;
		}
		return flag;
	}
	
	public Boolean checkOut(int chosenRoom) {
		Boolean flag = false;
		if(rList.get(chosenRoom-1)) {
			rList.set(chosenRoom-1, false);
			return !flag;
		}
		return flag;
	}
}
