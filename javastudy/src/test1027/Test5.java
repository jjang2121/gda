package test1027;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기

[결과]
금액을 입력하세요
36000
동전이 부족합니다.

[결과]
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/
public class Test5 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("금액을 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			procCalc(num);
		} catch (Exception ex) {
			System.out.println("오류가 발생 하였습니다.\n올바른 숫자를 입력하세요.");
		}
		inputStr();
	}

	public static void procCalc(int num) {
		int maxCnt = 5;
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] coinCnt = { 5, 5, 5, 5, 5, 5 };
		int temp = 0;

		String msg1 = "";
		String msg2 = "";

		for (int i = 0; i < coin.length && num > 0; i++) {
			temp = num / coin[i];
			if(temp > maxCnt && i == coin.length-1) {	//마지막 동전 갯수가 최대치를 넘는가?
				System.out.println("동전이 부족합니다.");
				return;
			}

			if (temp > maxCnt)	// 동전갯수 최대치
				temp = maxCnt;

			num -= coin[i] * temp;
			coinCnt[i] = maxCnt - temp;

			msg1 += coin[i] + "원 : " + temp + "개\n";
			msg2 += "남은 동전 " + coin[i] + "원 : " + coinCnt[i] + "개\n";
			
		}

		System.out.println(msg1);
		System.out.println(msg2);
	}
}
