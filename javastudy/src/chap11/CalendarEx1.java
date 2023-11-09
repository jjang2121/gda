package chap11;

import java.util.Calendar;

/*
Calendar 클래스	: 추상클래스(객체화 불가) new Carlendar()으로 객체화 불가
static 메서드		: getInstance() 메서드를 통해 현재일시를 리턴.
*/
public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("년도:" + now.get(Calendar.YEAR));
		System.out.println("년도:" + now.get(1));
		System.out.println("월(0~11):" + (now.get(Calendar.MONTH) + 1));
		System.out.println("년도기준 몇째주:" + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇째주:" + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자:" + now.get(Calendar.DATE));
		System.out.println("일자:" + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("년기준일자:" + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일~7:토):" + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("월기준몇째요일:" + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0), 오후(1):" + now.get(Calendar.AM_PM));

		System.out.println("시간(0~11):" + now.get(Calendar.HOUR));
		System.out.println("시간(0~23):" + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:" + now.get(Calendar.MINUTE));
		System.out.println("초:" + now.get(Calendar.SECOND));
		System.out.println("밀리초:" + now.get(Calendar.MILLISECOND));

		System.out.println("Timezone(밀리초로 리턴=>시간으로 변경) : " + now.get(Calendar.ZONE_OFFSET) / (1000 * 60 * 60));
		System.out.println("이번달 마지막 일자 : " + now.getActualMaximum(Calendar.DATE));
	}

}
