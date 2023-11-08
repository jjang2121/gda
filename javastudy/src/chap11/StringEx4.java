package chap11;

/*
String.Format 메서드 : 형식화된 문자열을 리턴, 서식문자 사용, 클래스 메서드 => 객체화 필요없음.
서식문자 : %d, %s, %f, %c ....

System.out.printf() 메서드와 사용 방식이 동일.
*/

public class StringEx4 {

	public static void main(String[] args) {
		System.out.println("===== 실수 =====");
		// %f : 실수값 출력 서식문자. 부동소수점 표시문자
		// %.nf : 소수점 n자리까지 출력, 소숫점n+1자리에서 반올림
		String sf = String.format("%.2f", 0.145);
		System.out.println(sf);
		// 10자리를 확보하여 소숫점 이하 2자리 출력하기, 빈자리 공백
		sf = String.format("%10.2f", 0.145);
		System.out.println(sf);
		// 10자리를 확보하여 소숫점 이하 2자리 출력하기, 빈자리 0 처리
		sf = String.format("%010.2f", 0.145);
		System.out.println(sf);
		System.out.println("===== 정수 =====");
		// %d : 10진수 정수출력
		sf = String.format("%d", 12345);
		System.out.println(sf);
		// %d : 10진수 정수출력, 3자리마다 콤마표시
		sf = String.format("%,d", 1234567);
		System.out.println(sf);
		// %10d : 10진수 정수출력, 자릿수 10자리 확보, 빈자리 공백, 우측정렬
		sf = String.format("%10d", 12345);
		System.out.println(sf);
		// %-10d : 10진수 정수출력, 자릿수 10자리 확보, 빈자리 공백, 좌측정렬(부호:정렬방식)
		sf = String.format("%-10d", 12345);
		System.out.println(sf);
		// %010d : 10진수 정수출력, 자릿수 10자리 확보, 빈자리 0
		sf = String.format("%010d", 12345);
		System.out.println(sf);
		// %,10d : 10진수 정수출력, 자릿수 10자리 확보, 빈자리 공백, 우측정렬, 3자리콤마 표시
		sf = String.format("%,10d", 12345);
		System.out.println(sf);
		// %-,10d : 10진수 정수출력, 자릿수 10자리 확보, 빈자리 공백, 좌측정렬, 3자리콤마 표시
		sf = String.format("%-,10d", 12345);
		System.out.println(sf);
		// %-,3d : 최소자리수 3자리 확보, 세자리마다 ,출력, 좌측정렬
		sf = String.format("%,-3d", 12345);
		System.out.println(sf);
		System.out.println("===== 16진수 =====");
		// %X : 16진 정수 출력, A~F
		// %x : 16진 정수 출력, a~f
		sf = String.format("%X, %x", 255, 255);
		System.out.println(sf);
		// 16진 정수 출력, 최소자리수 확보하고 빈자리 0채움.
		int len = 5;
		sf = String.format("%0"+len+"X, %0"+len+"x", 10, 10);
		System.out.println(sf);
		// %o : 8진 정수 출력
		// 10진수 10을 8진수로 출력
		sf = String.format("%0"+len+"o", 10);
		System.out.println(sf);
		System.out.println("===== 문자열 =====");
		//%s : 문자열 출력
		sf = String.format("%s", "홍길동");
		System.out.println(sf);
		//%10s : 10자리 확보, 우측정렬
		sf = String.format("%10s", "홍길동");
		System.out.println(sf);
		//%-10s : 10자리 확보, 좌측정렬
		sf = String.format("%-10s", "홍길동");
		System.out.println(sf);
		System.out.println("===== 문자 =====");
		//%c : 문자 출력
		sf = String.format("%c%c%c", '홍','길','동');
		System.out.println(sf);
		System.out.println("===== 여러 자료형 =====");
		// 여러개 자료형 출력
		sf = String.format("%s의 학점은 %c, 점수는%d 입니다.", "홍길동",'A',95);
		System.out.println(sf);
	}
}
