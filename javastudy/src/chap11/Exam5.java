package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
delChar 메서드 구현하기
StringBuffer delChar(원본문자열, 삭제문자열)
	=> 원본 문자열에서 삭제 문자열을 제외한 문자열 리턴
*/


public class Exam5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int y = scan.nextInt();
		System.out.println("월을 입력하세요.");
		int m = scan.nextInt();
		
		System.out.println(getDate(y, m));
	}
	
	public static String getDate(int y, int m) {
		String inputDay = y +"-"+ String.format("%02d", m) +"-"+ "01";
		Date day = null;
		try {
			day = new SimpleDateFormat("yyyy-MM-dd").parse(inputDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd E");
		day.setTime(day.getTime()-(1000L*60*60*24));
		return sf.format(day);
	}

}
