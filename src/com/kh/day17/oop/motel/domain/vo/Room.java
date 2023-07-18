package com.kh.day17.oop.motel.domain.vo;

public class Room {
	private boolean isAvailable;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [isAvailable=" + isAvailable + "]";
	}
	
}
