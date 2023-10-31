package chap5;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		/*
		사각형의 높이를 홀수로 입력하세요.
		X     X
		 X   X
		  X X
		   X
		  X X
		 X   X
		X     X
		*/
		
		inputStr();
	}
	
	public static void inputStr() {
		try {
			System.out.println("삼각형의 높이를 입력하세요.");
			Scanner scan = new Scanner(System.in);

			int num = 0;
			while(true) {
				num = scan.nextInt();
				if(num%2 != 0) break;
				System.out.println("홀수만 입력하세요.");
			}
			procCalc(num);
			
		}catch(Exception ex) {
			System.out.println("올바른 숫자로 입력하세요.");
			System.out.println();
			inputStr();
		}
	}
	
	public static void procCalc(int height) {
		char[][] arr = new char[height][height];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if ((i + j) == height-1 || i == j) {
					arr[i][j] = 'X';
				}else {
					arr[i][j] = ' ';
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] : " + arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (char[] arr1 : arr) {
			for (char arr2 : arr1) {
				System.out.print(arr2);
			}
			System.out.println();
		}

		inputStr();

	}

}
