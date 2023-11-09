package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
현재일자로부터 5일 후 출력
*/
public class DateEx2 {

	public static void main(String[] args) {
		Date now = new Date();
		//1970년 이후부터 현재까지를 밀리초로 리턴
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());

		//현재부터 5일 이후의 날짜와 요일 출력하기
		Date day = new Date();
		long addDay = 5;
		System.out.println(now.getTime()+1000L*Math.pow(60,2)*24*addDay);
		day.setTime(now.getTime()+(1000L*60*60*24*addDay));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}

}
