package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Exam_JToolBar extends JFrame{
	private Container contentPane;
	public Exam_JToolBar() {
		
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	public void createToolBar() {
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일 생성합니다.");	// 버튼에 툴팁달기!!
		toolBar.add(newBtn);
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
//		openBtn.setPressedIcon(new ImageIcon("images/openPressed.jpg"));
		toolBar.add(openBtn);
		toolBar.addSeparator();
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다.");
		toolBar.add(saveBtn);
		
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new Exam_JToolBar();		
	}

}
