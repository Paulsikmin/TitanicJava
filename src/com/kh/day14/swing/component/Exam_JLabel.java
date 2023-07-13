package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Exam_JLabel extends JFrame{
	
	public Exam_JLabel() {
//		super("JLabel 예제");
		setTitle("JLabel 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon image = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(image);
		ImageIcon normallIcon = new ImageIcon("images/normalIcon.gif");
		JLabel normalLabel = new JLabel("보고싶으면 전화하세요", normallIcon, SwingConstants.CENTER);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(normalLabel);
		
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JLabel();
	}
}
