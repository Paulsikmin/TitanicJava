package com.kh.day09.objectpkg;

public class Exam_PointEquals {
	// Point클래스에 두점의 좌표가 같으면
	// true를 리턴하는 equals()를 작성하고
	// 2,3 포인트 객체와 2,3 포인트 객체가
	// 같은지 출력하시오.
	// 같을 때 출력 메시지
	// 좌표가 같습니다.
	// 다를 때 출력 메시지
	// 좌표가 다릅니다.
	public static void main(String[] args) {
		Point point1 = new Point(2,3);
		Point point2 = new Point(2,3);
		if(point1.equals(point2)) {
			System.out.println("좌표가 같습니다.");
		}else {
			System.out.println("좌표가 다릅니다.");
		}
	}
}
