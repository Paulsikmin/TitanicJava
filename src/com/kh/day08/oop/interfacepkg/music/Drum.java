package com.kh.day08.oop.interfacepkg.music;

public class Drum implements Instrument{

	@Override
	public void tunning() {
		// TODO Auto-generated method stub
		System.out.println("둥퉁퉁 덩텅텅");
	}

	@Override
	public void playInstrument() {
		// TODO Auto-generated method stub
		System.out.println("쿵쿵따 쿵쿵따 쿵쿵따");
	}

}
