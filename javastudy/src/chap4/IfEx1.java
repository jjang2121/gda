package chap4;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputInt();
	}
	
	public static void inputInt() {
		try {
			System.out.println("점수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			
			scoreResult(score);
		}catch(Exception ex) {
			System.out.println("숫자만 입력하세요.");
			inputInt();
		}
	}
	
	public static void scoreResult(int score) {
		if(score >= 60) { 
			System.out.println("합격입니다."); 
		} else {
			System.out.println("불합격입니다."); 
		}
		
		if(score >= 60) {
			System.out.println("축하합니다.");
		} else {
			System.out.println("다음 기회에...");
		}
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		inputInt();
	}

}
