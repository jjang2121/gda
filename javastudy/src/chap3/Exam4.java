package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서 양수인 경우 "양수", 음수인 경우 "음수", 0인 경우 "영" 출력하자
 */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		String result = input == 0 ? "영" : input > 0 ? "양수" : "음수";
		
		System.out.println(input + " : " + result);
		
		// 입력된 숫자의 절대값 출력하기
		System.out.println(input + "의 절대값 : " + (input < 0 ? -input : input));

	}

}
