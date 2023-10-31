package chap3;

import java.util.Scanner;

/*
 * 삼항연산자
 * - 조건연산자: (조건문) ? 참 : 거짓
 */
public class OpEx6 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		System.out.println(score + "점: " + ((score >= 60) ? "합격" : "불합격"));

		System.out.println(score + "점: " + 
			((score >= 70) ? "통과" : 
				(score >= 60) ? "재시험" : "탈락")
		);
	}

}
