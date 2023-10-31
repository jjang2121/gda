package chap5;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		/*
		2차원 배열을 이용하여 삼각형의 높이를 입력하세요.
		5
		
		15	14	13	12	11
			10	9	8	7
				6	5	4
					3	2
						1
		*/

		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.print("삼각형의 높이를 입력하세요. : ");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			procPic(num);
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + "\n올바른 숫자를 입력하세요.");
			inputStr();
		}
	}

	public static void procPic(int num) {
		int lastNum = 0;
		for (int i = 1; i <= num; i++) {
			lastNum += i;
		}

		int[][] arr = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= j) {
					arr[i][j] = lastNum--;
				}
			}
		}

		/*
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"] :" + arr[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		
		for(int[] arr1 : arr) {
			for(int arr2 : arr1) {
				if(arr2 > 0)
					System.out.print(arr2 + "\t");
				else
					System.out.print(" \t");
			}
			System.out.println();
		}

		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0) {
					System.out.print(arr[i][j] + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
		*/
	}

}
