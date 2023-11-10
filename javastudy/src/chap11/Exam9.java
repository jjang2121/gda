package chap11;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
	점수의 총점과 평균 출력하기
*/

public class Exam9 {
	public static void main(String[] args) throws ParseException {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95,물리:100";
		// String pattern = "[0-9]{2,3}";
		// String pattern = "\\d{2,3}";
		// String pattern = "100";		// 100점만 찾기
		String pattern = "\\d{2,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(data);

		int sum = 0;
		int cnt = 0;
		while (m.find()) {
			System.out.println(m.group());
			sum += Integer.parseInt(m.group());
			cnt++;
		}

		System.out.println("합계 : " + sum + ", 평균 : " + ((float) sum / cnt));
	}
}
