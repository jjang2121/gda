package chap5;

public class Exam5 {

	public static void main(String[] args) {
		/*
		
		*/

		int[][] arr = { { 1, 2 }, { 1, 2, 3, 4, 5 }, { 10, 20 }, { 100 } };

		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "][" + j + "] : " + arr[i][j] + "\t");
				if (maxLen < arr[i].length)
					maxLen = arr[i].length;
			}
			System.out.println();
		}
		System.out.println();

		// 각 행과 열의 합
		int[] cols = new int[maxLen];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; // 행의 합
				cols[j] += arr[i][j];// 열의 합
			}
			System.out.println(i + "행의 합 : " + sum);
		}

		System.out.println();

		for (int i = 0; i < cols.length; i++) {
			System.out.println(i + "열의 합 : " + cols[i]);
		}
		

	}

}
