package chap4;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		/* 
		농장에 강아지, 병아리가 있다.
		강아지, 병아리의 전체 마리수와 다리수를 입력
		강아지의 마리수와 병아리의 마리수를 출력
		[결과]
		마리수 입력 : 20
		다리수 입력 : 60
		강아지 : xx
		병아리 : yy
		*/

		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.print("마리 수 입력 : ");
			Scanner scan = new Scanner(System.in);
			int totCnt = scan.nextInt();

			System.out.print("다리 수 입력 : ");
			int totLeg = scan.nextInt();
			
			// System.out.println(totCnt+"/"+totLeg);
			procCalc(totCnt, totLeg);
		} catch (Exception ex) {
			System.out.println("올바른 숫자를 다시 입력하세요.");
			inputStr();
		}
	}

	public static void procCalc(int totCnt, int totLeg) {
		boolean flag = false;
		String msg = "계산이 맞지 않습니다.";

		for (int i = 0; i <= totCnt; i++) {
			// System.out.println(i);
			for (int j = 0; j <= totCnt; j++) {
				if (i + j == totCnt && ((2 * i) + j) == totLeg / 2) {
					msg = "강아지:" + i + ", 병아리:" + j + "입니다.";
					flag = true;
					break;
				}
			}
			if (flag)	break;
		}

		System.out.println(msg);

		/*
		x+y = 20
		4x+2y = 60, 2x+y = 30
		*/
		inputStr();
	}

}
