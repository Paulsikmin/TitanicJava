package com.kh.day07.oop.member;

public class Member {
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() {}
	
	public Member(
			String memberId
			, String memberPw
			, String memberEmail
			, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	//getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	//setter 메소드
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
}







