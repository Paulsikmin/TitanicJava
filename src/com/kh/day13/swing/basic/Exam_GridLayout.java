package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_GridLayout extends JFrame{
	
	public Exam_GridLayout() {
		// TODO Auto-generated constructor stub
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		Container c = getContentPane();
//		c.setLayout(new GridLayout(4, 2, 0, 5));
		c.setLayout(grid);
		
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		c.add(new JButton("입력"));
		c.add(new JButton("취소"));
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_GridLayout();
	}
}
