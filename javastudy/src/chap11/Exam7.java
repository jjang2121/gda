package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
문자열로 두개의 날짜를 입력받아 두날짜 사이의 일수 계산하기
[결과]
두개의 날짜를 입력하세요.(yyyy-MM-dd)
2023-01-01 2023-01-03
날짜차이 : 2일
*/

public class Exam7 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 날짜를 입력하세요.(yyyy-MM-dd)");
		String day1 = scan.nextLine();
		String day2 = scan.nextLine();
		
		System.out.println(dateDiff(day1, day2));
	}

	public static String dateDiff(String day1, String day2) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sf.parse(day1);
		Date d2 = sf.parse(day2);
		
		long diff = 0;
		diff = (d2.getTime() - d1.getTime()) / (1000L*60*60*24);

		return String.format("%s - %s 날짜차이 : %d일", day1, day2, Math.abs(diff));
	}

}
