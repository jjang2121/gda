package test1027;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test3 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("숫자만 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			procChange(num);
		} catch (Exception ex) {
			System.out.println("숫자만 입력하세요.");
			inputStr();
		}
	}

	public static void procChange(int num) {
		int[] setDiv = { 2, 8, 10, 16 };
		/*
		int[] binStr = new int[32];
		int[] octStr = new int[12];
		int[] decStr = new int[10];
		int[] hexStr = new int[8];
		*/
		char[] hexBase = "0123456789ABCDEF".toCharArray();
		char[] setStr;

		int i;
		int divnum;

		// 진수 Loop
		for (int d = 0; d < setDiv.length; d++) {
			divnum = num;
			i = 0;

			setStr = new char[15];

			while (divnum > 0) {
				if (setDiv[d] < 16) {	//16 진수로 인한 분기처리
					setStr[i++] = (char) (divnum % setDiv[d]);
				} else {
					setStr[i++] = (char) hexBase[divnum % setDiv[d]];
				}
				divnum /= setDiv[d];
			}

			System.out.print(setDiv[d] + "진수 :\t");
			for (int j = i - 1; j >= 0; j--) {
				if (setDiv[d] < 16) {	//16진수로 인한 분기처리
					System.out.print((int)setStr[j]);
				} else {
					System.out.print(setStr[j]);
				}
			}

			System.out.println();
		}
		
		System.out.println();
		inputStr();

	}

}
