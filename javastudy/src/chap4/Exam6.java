package chap4;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		1.삼각형의 높이를 입력받아서 *로 삼각형 출력하기
		[결과]
		 *
		 **
		 ***

		2.삼각형의 높이를 입력받아서 *로 역순 삼각형 출력하기
		[결과]
		 ***
		 **
		 *

		3.삼각형의 높이를 입력받아서 *로 삼각형 출력하기
		[결과]
		   *
		  **
		 ***

		 */
		getHeight();
	}

	public static void getHeight() {
		try {
			System.out.println("삼각형의 높이를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			printStar(num);
		} catch (Exception ex) {
			System.out.println("숫자만 입력하세요.");
		}

		getHeight();
	}

	public static void printStar(int num) {
		/*
		String star = "*";
		for(int i=1; i<=num; i++) {
			System.out.println(star.repeat(i));
		}
		System.out.println();
		for(int i=num; i>=1; i--) {
			System.out.println(star.repeat(i));
		}
		*/

		
		/* --중첩for 기본
		System.out.println();
		
		for(int i=1; i<=num; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/* --중첩for 기본
		System.out.println();
		
		for(int i=num; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		System.out.println();
		
		for(int i=num; i>=1; i--) {
			for(int j=1;j<=num;j++) {
				if(i<=j)	System.out.print("*");
				else		System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i=1; i<=num; i++) {
			for(int j=1;j<=num;j++) {
				if(i<=j)	System.out.print("*");
				else		System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
