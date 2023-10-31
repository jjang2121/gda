package chap3;

import java.util.Scanner;

/**
 * 화면에서 3자리 자연수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세 자리 자연수를 입력하세요
 * 321
 * 300
 * 
 * 1. Scanner 객체 생성
 * 2. int num = scan.nextInt()
 * 3. num - num % 100
 * 4. 출력
 */
public class Exam3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 자리 자연수를 입력하세요");
		
		int num = scan.nextInt();
		
		int result = num - num % 100;
		System.out.println(result);
	}

}
