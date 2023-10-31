package chap3;

import java.util.Scanner;

/**
 * 키보드에서 초를 입력받아 몇 시간 몇 분 몇 초인지 출력하기.
 * ex. 3662 -> 1시간 1분 2초
 * 
 * 1. Scanner 객체 생성
 * 2. int second = scan.nextInt();
 * 3. 시: 초 / 3600;
 * 4: 분: (초 % 3600) / 60
 * 5: 초: 초 % 60
 */
public class Exam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputSecond = scanner.nextInt();
		
		int hour = inputSecond / 3600;
		int minute = (inputSecond % 3600) / 60;
		int second = inputSecond % 60;
		
		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	}

}
