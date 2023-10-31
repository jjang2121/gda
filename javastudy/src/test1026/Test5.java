package test1026;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class Test5 {
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
		int maxcolumn = (h * 2) - 1;
		int blankSpace = 0;
		for (int i = maxcolumn; i >= 1; i = i - 2) {
			// 앞공백처리
			System.out.print(" ".repeat(blankSpace++));
			// blankSpace++;
			// 별처리
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		inputStr();
	}
}
