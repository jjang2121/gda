package chap3;

import java.util.Scanner;

/*
 * 사과의 개수를 입력받아 필요한 바구니 수 계산하기
 * 바구니 당 10개의 사과를 저장할 수 있다고 가정함
 * 
 * [결과]
 * 사과의 개수를 입력하세요
 * 21
 * 필요한 사과의 개수: 3
 */
public class Exam5 {

	public static void main(String[] args) {
		System.out.println("사과의 개수를 입력하세요");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int quotient = num / 10;
		int remainder = num % 10;

		System.out.println("필요한 바구니 개수" + (remainder == 0 ? quotient : quotient + 1));	

		scan.close();
	}

}
