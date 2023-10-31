package chap5;

public class ArrayEx8 {

	public static void main(String[] args) {
		/*
		2차원 배열 예제
		2차원 배열은 1차원 배열의 참조변수의 배열임, 2차원 참조객체는 1차원 배열
		자바에서는 다차원(2차원이상)배열은 n-1차원 배열의 참조변수의 배열임.
		=> 다차원 배열은 배열의 배열로 표현됨.
		*/

		System.out.println("배열 선언 및 생성, 초기화");
		// 배열의 선언과 생성
		int[][] arr = new int[3][2];
		// 배열의 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		// 내용출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"] : "+arr[i][j] + ",");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("1차원 배열 객체 변경하기");
		int[] arr1 = {1,2,3,4,5};
		arr[1] = arr1;
		// 내용출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"] : "+arr[i][j] + ",");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("arr1[3] 5000 변경 후");
		arr1[3] = 5000;
		// 내용출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"] : "+arr[i][j] + ",");
			}
			System.out.println();
		}

		
		System.out.println();
		System.out.println("배열 선언 및 초기화");
		// 배열 선언 및 초기화
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12, 13 } };

		// 내용출력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print("arr2["+i+"]["+j+"] : "+arr2[i][j] + ",");
			}
			System.out.println();
		}

		
	}
}
