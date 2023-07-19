package com.kh.day18.music.model.vo;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		super();
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "음악 [제목=" + title + ", 가수명=" + singer + "]";
	}
	
}
