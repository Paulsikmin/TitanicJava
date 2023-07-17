package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_Audio extends JFrame{
	
	String [] names = {"play", "stop", "play again"};
	private Clip clip;
	
	public Exam_Audio() {
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < names.length; i++) {
			JButton btn = new JButton(names[i]);
			btn.addActionListener(new MyActionListener());
			c.add(btn);
		}
		setSize(300, 200);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");
	}
	
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
				case "play" : 
					clip.start();
					break;
				case "stop" : 
					clip.stop();
					break;
				case "play again" : 
					clip.setFramePosition(0);
					clip.start();
					break;
			}
		}
	}
	
	private void loadAudio(String audioPath) {
		try {
			// 클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip(); // 비어있는 오디오 클립 생성
			File audioFile = new File(audioPath);
			AudioInputStream audioStream
			= AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		new Exam_Audio();
	}
}
