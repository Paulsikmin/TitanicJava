package com.kh.day16.swing.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_AudioLineEvent extends JFrame{
	
	private Clip clip;
	private JLabel label;
	
	public Exercise_AudioLineEvent() {
		label = new JLabel("애국가 1절");
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.YELLOW);
		c.add(label);
		
		setSize(300, 150);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");
	}
	
	private void loadAudio(String audioPath) {
		try {
			// 클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip(); // 비어있는 오디오 클립 생성
			File audioFile = new File(audioPath);
			AudioInputStream audioStream
			= AudioSystem.getAudioInputStream(audioFile); // 오디오 스트림 생성
			clip.open(audioStream);		// 오디오 스트림을 이용하여 오디오 클립
			clip.addLineListener(new LineListener() {
				@Override
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP) { // 노래가 멈추면
						getContentPane().setBackground(Color.ORANGE); // 배경색 변경
						label.setText("연주 끝");					  // 텍스트 변경
					}
					try {
						audioStream.close();	// 스트림 닫기, 자원해제
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});	// 노래가 끝날 때 동작
			clip.start();	// 프로그램 시작하자마자 노래 시작
			
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		new Exercise_AudioLineEvent();
	}
}
