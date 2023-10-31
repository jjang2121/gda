package chap4;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		자연수를 입력받아 각 자리수의 합을 구하기
		[결과]
		123
		123의 자리수 합:6
		*/
		getNum();
	}

	public static void getNum() {
		try {
			System.out.println("자연수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			calcSum(num);
		} catch (Exception ex) {
			System.out.println("숫자만 입력하세요.");
		}

		getNum();
	}

	public static void calcSum(int num) {
		int sum = 0;
		/*123*/
		while (num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("합계 : "+sum);

	}

}
