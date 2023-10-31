package chap5;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		/*
		int값을 5개 저장할 수 있는 배열을 생성하고,
		화면에서 정수값 5개를 입력받아, 입력받은 수의 합계, 평균, 최대값, 최소값, 최대값의 인덱스, 최소값의 인덱스 출력
		*/
		try {
			int arr[] = new int[5];

			System.out.println("숫자 5개를 입력하세요.");
			Scanner scan = new Scanner(System.in);

			// 합계, 평균
			int sum = 0;

			// 최대값, 최소값 인덱스
			int maxIndex = 0;
			int minIndex = 0;

			System.out.print("계산 적용값 : ");
			for (int i = 0; i < arr.length; i++) {
				// 입력값 배열 저장
				arr[i] = scan.nextInt();
				// 합계
				sum += arr[i];
				if (i > 0)	System.out.print(", ");
				System.out.print(arr[i]);
				// 최대값, 최대값 인덱스 저장
				if (arr[maxIndex] < arr[i]) maxIndex = i;
				// 최소값, 최소값 인덱스 저장
				if (arr[minIndex] > arr[i]) minIndex = i;
			}
			System.out.println();
			// System.out.println("합계는 "+ sum + ", 평균은 "+ (double)sum/arr.length);
			System.out.printf("합계는 %d, 평균은 %.2f\n", sum, (double) sum / arr.length);
			System.out.println("최대값 : " + arr[maxIndex] + ", 최대값 인덱스 : " + maxIndex);
			System.out.println("최소값 : " + arr[minIndex] + ", 최소값 인덱스 : " + minIndex);

		} catch (Exception ex) {
			System.out.println("오류가 발생하였습니다.");
		}
	}

}
