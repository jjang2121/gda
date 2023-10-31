package chap2;

/*
 * String 클래스
 *  1. 참조자료형. 문자열 객체
 *  2. 클래스 중 유일하게 대입연산자(=)로 객체 생성이 가능하다
 *  3. 클래스 중 유일하게 + 연산자 사용 가능
 *    String + 기본자료형 => String
 */
public class VarEx6 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1 + 100;
		System.out.println("str2=" + str2);

		str2 = str1 + 1 + 2 + 3;
		System.out.println("str2=" + str2);
		
		str2 = 1 + 2 + 3 + str1;
		System.out.println("str2=" + str2);
		
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		
		System.out.println();
		
		// format 지정 출력: printf
		System.out.printf("%d\n", 12345); // %d: 10진 정수 출력
		System.out.printf("%10d\n", 12345); // 10자리 확보 후 10진수 출력
		System.out.printf("%f\n", 123.45); // %f: 부동소수점 출력. 실수 출력
		System.out.printf("%.1f\n", 123.4); // %.1f: 실수 출력. 소수점 이하 1자리로 출력. 반올림
	}

}
