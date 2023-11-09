package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
년도와 월을 읿력 받아 년월의 마지막 일자와 요일 출력하기
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
