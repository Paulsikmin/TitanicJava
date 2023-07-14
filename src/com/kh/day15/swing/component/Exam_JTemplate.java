package com.kh.day15.swing.component;

import javax.swing.JFrame;

public class Exam_JTemplate extends JFrame{

	public Exam_JTemplate() {
		
		setTitle("메뉴 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JTemplate();		
	}

}
