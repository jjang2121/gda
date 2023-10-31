package chap5;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {

		/*
		로또번호 생성기
		*/

		int[] balls = new int[45];
		int[] lotto = new int[6];

		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1; // 1~45값 balls 배열 저장
		}

		// balls 섞기
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * balls.length); // 0~44 임의의 index
			int t = (int) (Math.random() * balls.length); // 0~44 임의의 index
			// swap 알고리즘
			if (f != t) {
				int temp = balls[f];
				balls[f] = balls[t];
				balls[t] = temp;
			}
		}

		for (int b : balls)
			System.out.print(b + " ");

		// 선택된 데이터를 lotto 배열에 저장
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = balls[i];

		System.out.println();
		for (int b : lotto)
			System.out.print(b + " ");
		System.out.println();

		System.out.println();
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}
			System.out.print(i + " : ");
			for (int b : lotto)
				System.out.print(b + " ");
			System.out.println();
		}

		System.out.println();

		// Arrays 클래스 이용한 정렬
		// Arrays : 배열객체를 다양한 기능 제공하는 클래스
		System.out.println("Arrays 클래스를 이용한 정렬");
		// 선택된 데이터를 lotto 배열에 저장
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = balls[i];
		Arrays.sort(lotto); // lotto배열 정렬
		for (int b : lotto)
			System.out.print(b + " ");
		System.out.println();

	}

}
