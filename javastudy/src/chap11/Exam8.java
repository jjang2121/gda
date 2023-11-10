package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
년도와 월을 입력하세요.
2023 11
일	월	화 	수	목	금	토
			1	2	3	4
5	6	7	8	9	10	11
12	13	14	15	16	17	18
19	20	21	22	23	24	25
26	27	28	29	30

1. 입력한 년월의 1일로 Calendar 클래스 설정
2. 첫번째 날의 요일과 월의 마지막일자 구함
3. 날짜는 1일부터 마지막 일자까지 반복.
   한줄에 7개의 값 출력 시 한줄 설정하기
   단, 첫번째날의 요일이 되기 전까지는 공백으로 출력
*/

public class Exam8 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요.");
		int year = scan.nextInt();
		int month = scan.nextInt();

		getCalendar(year, month);
	}

	public static void getCalendar(int year, int month) throws ParseException {
		String cDate = year +"-"+ month +"-1";
		Calendar c = Calendar.getInstance();
		c.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(cDate));
		// c.set(year, month-1, 1);	// 월에 -1 처리
		// System.out.println(c.toString());
		// long getCTime = new SimpleDateFormat("yyyy-MM-dd").parse(cDate).getTime();
		// long getCTime = c.getTimeInMillis();
		
		int firstWeekDay = c.get(Calendar.DAY_OF_WEEK);
		int lastDay = c.getActualMaximum(Calendar.DATE);	// 마지막 일자
		int [] dayArr = new int [lastDay];					// 일자 저장
		for(int i=0;i<lastDay;i++)	dayArr[i] = (i+1);
		
		//System.out.println(lastDay);
		System.out.println();
	
		System.out.printf("%d년 %02d월\n", year, month);
		System.out.printf("%4s%3s%4s%3s%4s%4s%4s\n", "일","월","화","수","목","금","토");
		
		int w = 0;	// 줄바꿈 설정
		for(int i=1;i<firstWeekDay;i++)	{
			System.out.printf("%4s", "");
			w++;
		}

		for(int i=0;i<dayArr.length;i++) {
			System.out.printf("%4d", dayArr[i]);	// 일자찍기
			w++;
			if(w%7 == 0)	System.out.println();	// 줄바꿈처리
		}
	}

}
