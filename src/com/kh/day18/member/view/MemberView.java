package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.controller.MemberController;
import com.kh.day18.member.model.vo.Member;

public class MemberView {
	
	private MemberController controller;
	
	public MemberView() {
		controller = new MemberController();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = -1;
		finish :
		while(true) {
			int choice = this.printMenu();
			switch(choice) {
				case 1 : 
					mOne = this.inputMember();
					controller.addMember(mOne);
					break;
				case 2 : 
					name = this.inputMemberName();	// 수정할 데이터의 이름을 입력 받음.
					index = controller.findIndexByName(name);	// 인덱스값을 찾음.
					// 수정하지 않는 부분은 
					// 기존 데이터 유지되도록 정보를 불러옴
					mOne = controller.findOneByName(name);		// 원래 저장된 데이터(mOne)
					if(index != -1) {				
						mOne = this.modifyMember(mOne);	// 데이터가 있을 때 수정할 정보 입력 받음.
														// 수정된 데이터(mOne)
					}
					controller.modifyMember(index, mOne);			// 데이터 수정하기
					break;
				case 3 : 
					name = this.inputMemberName();	// 삭제할 데이터의 이름을 입력 받음.
					index = controller.findIndexByName(name);
					if(index != -1)
						controller.subMember(index);			// 데이터 삭제하기
					break;
				case 4 : 
					name = this.inputMemberName();
					mOne = controller.findOneByName(name);
					this.printOneMember(mOne);
					break;
				case 5 : 
					this.printAllMembers(controller.allMemberList());
					break;
				case 6 : break finish;
			}
		}
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원 정보 입력 ====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member 
			= new Member(memberId
					, memberPw
					, memberName
					, memberEmail
					, memberPhone);
		return member;
//		Member member = new Member();
//		member.setMemberId(memberId);
//		member.setMemberPw(memberPw);
//		member.setMemberName(memberName);
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
	}
	
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String memberName = sc.next();
		return memberName;
	}
	
	public Member modifyMember(Member member) {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
//		Member member = new Member(memberPw, memberEmail, memberPhone);
		member.setMemberPw(memberPw);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		return member;
	}

	public void printOneMember(Member member) {
		System.out.println("===== 회원 정보 출력(이름) =====");
		System
			.out
				.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
						, member.getMemberId()
						, member.getMemberName()
						, member.getMemberEmail()
						, member.getMemberPhone());
	}
	
	public void printAllMembers(List<Member> mList) {
		System.out.println("===== 회원 전체 정보 출력 =====");
		for(Member member : mList) {
			System
				.out
					.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 폰번호 : %s\n"
							, member.getMemberId()
							, member.getMemberName()
							, member.getMemberEmail()
							, member.getMemberPhone());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
