package com.kh.day06.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		Member [] memArrs = new Member[3];
		finish :
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1 : 
					inputScore(memArrs);
					break;
				case 2 :
					printScore(memArrs);
				case 3 : 
					checkPass(memArrs);
					break;
				case 4 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				}
			}
	}

	private static void checkPass(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void inputScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
