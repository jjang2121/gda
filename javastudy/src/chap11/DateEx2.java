package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

//날짜 설정하기
public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		//1970년 이후부터 현재까지를 밀리초로 리턴
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		//현재부터 5일이후의 날짜와 요일 출력하기
		Date day = new Date();
		day.setTime(now.getTime()+(1000L*60*60*24*5));
		System.out.println
		(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}