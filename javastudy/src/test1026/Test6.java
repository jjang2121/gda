package test1026;

import java.util.Scanner;

/*

삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****


 */
public class Test6 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("삼각형의 높이 : ");
			Scanner scan = new Scanner(System.in);
			int h = scan.nextInt();

			procStar(h);
		} catch (Exception ex) {
			System.out.println("올바른 정수를 입력하세요.");
			inputStr();
		}
	}

	public static void procStar(int h) {
		if (h % 2 == 0) {
			System.out.println("홀수로 입력하세요.");
			inputStr();
		}

		int blankSpace = 0;
		int i = 0;
		for (i = h; i >= 1; i = i - 2) {
			// 앞공백처리
			System.out.print(" ".repeat(blankSpace));
			blankSpace++;
			// 별처리
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 역공백처리
		blankSpace = (h / 2) - 1;
		// 초기 라인은 건너띔
		for (i = 3; i <= h; i = i + 2) {
			// 앞공백처리
			System.out.print(" ".repeat(blankSpace));
			blankSpace--;
			// 별처리
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		inputStr();
	}
}
