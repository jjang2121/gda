package test1109;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 [결과]
 가나다
  가나다
    가나다
가나
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}
	
	public static String format(String str,int len,int align) {
		// 문자열 자르기
		if(str.length() > len) {
			str = str.substring(0, len);
		}
		
		// 정렬설정
		String alignStr = "";
		if(align == 0) {
			alignStr = "-";
		}else if (align == 1) {
			if((len -str.length()) > 0) {
				int divNum = (len -str.length())/2;
				int restNum = len - divNum;
				str = " ".repeat(divNum) + str + " ".repeat(restNum);
			}
		}
		
		return String.format("%"+alignStr+len+"s", str);
	}
}
