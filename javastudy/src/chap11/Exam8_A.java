package chap11;
/*
년도와 월을 입력하세요
2023 11
	2023년11월
   일  월  화   수  목  금   토
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30
  
  1. 입력한 년월의 1일로 Calendar 클래스 설정
  2. 첫번째 날의 요일과 월의 마지막일자 구함
  3. 날짜는 1일부터 마지막 일자까지 반복.
     한줄에 7개의 값 출력시 한줄 설정하기
     단 첫번째날의 요일이 되기 전까지는 공백으로 출력
 */
import java.util.Calendar;
import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		//Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //입력한 년월의 1일 설정
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //첫번째 날의 요일
		//입력한년월의 마지막일자
		int lastday = cal.getActualMaximum(Calendar.DATE); 
		System.out.println("\t"+year + "년" + mon + "월"); //header 부분 출력
//		System.out.printf("%4s%3s%3s %3s%3s %3s%3s\n",
//				          "일,월,화,수,목,금,토".split(",")); //요일 부분 출력
		System.out.printf("%4s%3s%3s %3s%3s %3s%3s\n",
                                    "일","월","화","수","목","금","토");
		//1부터 lastday 까지 반복
		for(int i=1,day=1;day<=lastday;i++) {
			//공백출력 : 첫째날의 요일 이전 부분
			if(i < firstWeek) System.out.printf("%4s"," ");
			else System.out.printf("%4d",day++);
			if(i%7==0)System.out.println();
		}
	}
}
