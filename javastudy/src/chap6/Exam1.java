package chap6;
/*
1. 직사각형클래스(Rectangle) 구현하기
멤버변수 : 가로(width), 세로(height)
멤버메서드 : void area(); => 넓이출력 기능
멤버메서드 : void length(); => 둘레출력 기능

2. 구동클래스 : main 메서드가 존재하는 클래스
	- Rectangle 클래스의 객체 생성하여 r1 참조변수로 참조하기
	- 가로, 세로 길이를 10, 5 저장하기
	- r1 사각형의 넓이와 둘레 출력하기
*/

import java.util.Scanner;

class Rectangle {
	int width;
	int height;

	// 계산처리
	int area() {
		return this.width * this.height;
	}

	int length() {
		return (this.width + this.height) * 2;
	}

}

public class Exam1 {

	public static void main(String[] args) {
		inputStr();
	}

	// 입력처리
	public static void inputStr() {
		try {
			System.out.println("사각형 가로 및 세로의 길이를 입력하세요(단위:m).");
			Scanner scan = new Scanner(System.in);
			int[] num = new int[2];
			for (int i = 0; i < 2; i++) {
				num[i] = scan.nextInt();
			}

			procCalc(num);

		} catch (Exception ex) {
			System.out.println(ex.getMessage() + "\n올바른 숫자를 다시 입력하세요.");
			inputStr();
		}
	}

	// 계산처리 출력
	public static void procCalc(int[] num) {
		int width = num[0];
		int height = num[1];

		Rectangle rect = new Rectangle();
		rect.width = width;
		rect.height = height;

		System.out.printf("넓이는 %s㎡, 둘레는 %sm 입니다.\n", rect.area(), rect.length());
		System.out.println();

		inputStr();

	}

}
