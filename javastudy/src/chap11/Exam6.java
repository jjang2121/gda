package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력 받아 년월의 마지막일자와 요일 출력하기
 * Calendar 객체 이용하기
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar day = Calendar.getInstance();  //현재날짜
		//입력한 날짜로 Calendar 설정
		day.set(year, mon-1,1); //입력한 날짜의 1일
		//마지막 일자
		int lastday = day.getActualMaximum(Calendar.DATE);
		day.set(year, mon- 1,lastday); //입력한 날짜의 마지막일자
		String w = " 일월화수목금토";
		System.out.printf("날짜:%d-%d-%d %c요일\n",day.get(Calendar.YEAR),
				day.get(Calendar.MONTH)+1,day.get(Calendar.DATE),
				w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		//
		day.set(year,mon,0); //입력한 날짜의 마지막일자
		System.out.printf("날짜:%d-%d-%d %c요일\n",day.get(Calendar.YEAR),
				day.get(Calendar.MONTH)+1,day.get(Calendar.DATE),
				w.charAt(day.get(Calendar.DAY_OF_WEEK)));
	}
}