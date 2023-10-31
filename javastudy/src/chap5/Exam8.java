package chap5;

public class Exam8 {

	public static void main(String[] args) {
		/*
		11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기.
		X     X
		 X   X
		  X X
		   X
		  X X
		 X   X
		X     X
		*/

		int maxNum = 11;
		char[][] arr = new char[maxNum][maxNum];

		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				if ((i + j) == 10 || i == j) {
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

	}

}
