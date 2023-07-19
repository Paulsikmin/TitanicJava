package com.kh.day18.music.controller;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

public class MusicController {
	
	private MusicDAO musicDao;
	
	public MusicController() {
		musicDao = new MusicDAO();
	}
	/**
	 * 곡 정보 등록
	 * @param music 입력 받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		// TODO Auto-generated method stub
		musicDao.addMusic(music);
	}
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> allMusicInfo() {
		List<Music> mList = musicDao.allMusicInfo();
		return mList;
	}
	public List<Music> findListBySinger(String singer) {
		List<Music> mList = musicDao.findListBySinger(singer);
		return mList;
	}
	public int findIndexBySinger(String singer) {
		int index = musicDao.findIndexBySinger(singer);
		return index;
	}
	public void deleteMusic(int index) {
		musicDao.deleteMusic(index);
	}
	public Music findMusicBySinger(String singer) {
		Music music = musicDao.findMusicBySinger(singer);
		return music;	// 리턴은 널로 두지 않아요
	}
	public void modifyMusic(int index, Music music) {
		musicDao.updateMusic(index, music);
	}

}
