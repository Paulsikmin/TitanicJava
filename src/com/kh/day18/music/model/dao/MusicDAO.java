package com.kh.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.music.model.vo.Music;

public class MusicDAO {
	
	private List<Music> musicList;
	
	public MusicDAO() {
		musicList = new ArrayList<Music>();
	}
	/**
	 * 곡 정보 등록
	 * @param music 입력 받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		musicList.add(music);
	}
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> allMusicInfo() {
		return musicList;
	}
	/**
	 * 
	 * @param singer
	 * @return
	 */
	public List<Music> findListBySinger(String singer) {
		List<Music> findList = new ArrayList<Music>();
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				findList.add(music);
			}
		}
		return findList;
	}
	public int findIndexBySinger(String singer) {
		int count = 0;
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return count;
			}
			count += 1;
		}
		return -1;
	}
	public void deleteMusic(int index) {
		musicList.remove(index);
	}
	public Music findMusicBySinger(String singer) {
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return music;
			}
		}
		return null;
	}
	public void updateMusic(int index, Music music) {
		musicList.set(index, music);
	}

}
