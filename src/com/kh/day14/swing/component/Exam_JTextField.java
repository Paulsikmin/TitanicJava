package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_JTextField extends JFrame{
	
	public Exam_JTextField() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(20);
//		text.setEditable(true);
//		text.setText("Hello");
//		text.setFont(new Font("궁서체", Font.ITALIC, 20));
		c.add(new JLabel("이름"));
		c.add(text);
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터공학과",20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시...",20));
		
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JTextField();
	}
}





