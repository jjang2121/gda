package chap5;

import java.util.Scanner;

public class ArrayEx4 {
	
	final static int divSet = 2;
	
	public static void main(String[] args) {
		/*
		10진수를 2진수로 변경
		*/

		inputStr();
	}

	public static void inputStr() {
		try {
		System.out.println(divSet+"진수로 변활 할 10진수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		procBinary(num);
		}catch(Exception ex) {
			System.out.println("10진수의 숫자만 입력하세요.");
			inputStr();
		}
	}
	
	public static void procBinary(int num) {
		int[] binary = new int[32];
		int divnum = num;
		int idx = 0;
		String printNum = "";
		while(divnum > 0) {
			binary[idx++] = divnum%divSet;
			divnum/=divSet;
		}
		
		System.out.println(num+"의 "+divSet+"진수:");
		for(int i=idx-1;i>=0;i--) {
			// System.out.print(binary[i]);
			printNum += binary[i];
		}
		
		System.out.println(printNum);
		
		System.out.println("클래스를 이용한 2진수 출력");
		System.out.println(Integer.toBinaryString(num));
		
		
		inputStr();
		
		
	}
}
