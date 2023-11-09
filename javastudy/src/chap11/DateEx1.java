package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Date : 날씨 표시 클래스
SimpleDateFormat : 형식화클래스, java.text 패키지의 클래스
	패턴으로 사용되는 문자
		yyyy 	: 년도4자리
		MM		: 월2자리
		dd		: 일2자리
		HH		: 시2자리
		MM		: 분2자리
		ss		: 초2자리
		E		: 요일
		a		: 오전/오후 표시

		중요한 메서드
		String format(Date d)	: 날짜d값을 받아서 설정된 패턴에 맞는 문자열을 리턴
		Date parse(String s)	: 패턴에 맞는 문자열 데이터를 Date형으로 리턴
*/
public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 E a");
		System.out.println(sf.format(now));

		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH시mm분ss초 E a");
		System.out.println(sf2.format(now));
		SimpleDateFormat getDate = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(getDate.format(now));
		System.out.println();

		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date day = null;
		try {
			day = sf3.parse("2023-12-25 10:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		
		// day값을 2023년 12월 25일 월요일 형식으로 출력하기
		SimpleDateFormat sf4 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		try {
			day = sf4.parse("2023-12-25");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sf4.format(day));
	}

}
