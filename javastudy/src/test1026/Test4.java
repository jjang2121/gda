package test1026;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9
	8	7	6
5	4	3	2	1

			16
		15	14	13
	12	11	10	9	8
7	6	5	4	3	2	1
 
*/
public class Test4 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("삼각형의 높이 : ");
			Scanner scan = new Scanner(System.in);
			int h = scan.nextInt();

			procDraw(h);
		} catch (Exception ex) {
			System.out.println("올바른 정수를 입력하세요.");
			inputStr();
		}
	}

	public static void procDraw(int h) {
		int printNum = (int) Math.pow(h, 2); // h*h;
		int blankSpace = h - 1;

		for (int i = 1; i <= h; i++) {
			// 앞공백
			for (int j = 1; j <= blankSpace; j++) {
				System.out.print("\t");
			}
			// 숫자처리
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(printNum-- + "\t");
			}
			// 뒷공백
			/*for(int j=1;j<=blankSpace;j++) {
				System.out.print("\t");
			}*/
			System.out.println();
			blankSpace--;
		}
		inputStr();

	}

}