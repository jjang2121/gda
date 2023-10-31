package chap5;

import java.util.Scanner;

public class ArrayEx5 {

	final static int divSet = 16; // 16진수 변환

	public static void main(String[] args) {
		/*
		10진수를 16진수로 변경
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
		// toCharArray : char[] <= 문자열을 배열로 변환해줌
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8]; // 변환된 16진수 데이터
		int divnum = num;
		int idx = 0;
		String printNum = "";
		while (divnum > 0) {
			hex[idx++] = data[divnum % divSet];
			divnum /= divSet;
		}

		System.out.println(num + "의 " + divSet + "진수:");
		for (int i = idx - 1; i >= 0; i--) {
			// System.out.print(hex[i]);
			printNum += hex[i];
		}

		System.out.println(printNum);

		System.out.println("클래스를 이용한 " + divSet + "진수 출력");
		System.out.println(Integer.toHexString(num).toUpperCase());
		System.out.println();

		inputStr();

	}
}
