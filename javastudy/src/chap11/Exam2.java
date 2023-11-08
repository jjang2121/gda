package chap11;

/*
count() 메서드 구현하기
count("문자열","찾는문자열") => 문자열에서 찾는 문자열 갯수 리턴 메서드
*/


public class Exam2 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB", "12"));	// 2
		System.out.println(count("12345AB12AB45AB", "AB"));	// 3
		System.out.println(count("12345", "6"));			// 0
	}
	
	public static int count(String str, String src) {
		int index = 0;
		int cnt = 0;
		
		while(true) {
			index = str.indexOf(src, index);
			if(index < 0) break;
			cnt++;
			index++;
		}
		
		return cnt;
	}

}
