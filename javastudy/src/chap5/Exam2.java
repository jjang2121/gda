package chap5;

import java.util.Scanner;

public class Exam2 {

	final static int divSet = 8;

	public static void main(String[] args) {
		/*
		10진수를 8진수로 변경
		*/
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println(divSet + "진수로 변활 할 10진수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			procBinary(num);
		} catch (Exception ex) {
			System.out.println("10진수의 숫자만 입력하세요.");
			inputStr();
		}
	}

	public static void procBinary(int num) {
		int[] octal = new int[12];
		int divnum = num;
		int idx = 0;

		while (divnum > 0) {
			octal[idx++] = divnum % divSet;
			divnum /= divSet;
		}

		System.out.print(divSet + "진수는 : ");
		for (int i = idx - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		// 클래스를 이용한 8진수 출력
		System.out.println(Integer.toOctalString(num));
		System.out.println();

		inputStr();
		
	}

}
