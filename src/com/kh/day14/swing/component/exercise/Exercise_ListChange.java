package com.kh.day14.swing.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Exercise_ListChange extends JFrame{
	
	private JLabel guide;
	private JTextField input;
	private Vector<String> vector;
	private JList<String> nameList;
	
	public Exercise_ListChange() {
		setTitle("JList 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		guide = new JLabel("이름 입력 후 <Enter> 키");
		input = new JTextField(10);
		vector = new Vector<String>();
		nameList = new JList<String>();	// 객체 생성을 해야지만 사용할 수 있음.
		c.add(guide);					// * 콘텐트팬에 라벨 연결
		c.add(input);					// * 콘텐트팬에 필드 연결
		nameList.setVisibleRowCount(5);	 	// 행의 갯수 설정
		nameList.setFixedCellWidth(100);	// 너비 설정
		c.add(new JScrollPane(nameList));	// 스크롤팬에 리스트를 담아서 스크롤 생기도록 함.
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				vector.add(jt.getText());	// 엔터친 필드에 입력한 값 벡터에 추가
				jt.setText("");				// 입력했던 값 지워주기
				nameList.setListData(vector);// JList에 넣어주기
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_ListChange();
	}
}





