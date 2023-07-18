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
	
	public Boolean checkRoomState(int chosenRoom) {
		return rList.get(chosenRoom-1);
	}
	
	public Boolean checkIn(Boolean room, int roomNo) {
		if(!room) 
			rList.set(roomNo-1, true);
		return room;
	}
	
	public Boolean checkOut(Boolean room, int chosenRoom) {
		if(room)
			rList.set(chosenRoom-1, false);
		return room;
	}
}
