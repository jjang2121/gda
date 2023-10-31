package chap1;

/*
 * 주석
 * 컴파일 되지 않는 영역.
 * 기계여로 번역되지 않음
 */
/* */
//

/*
 * 1. 소스 작성: *.java
 * 2. 컴파일: javac *.java => 바이트코드(*.class) 생성
 * 3. 실행: java * => 바이트코드 실행
 * 
 * javac: 자바 컴파일러
 * java: 자바 인터프리터 
 * 	- 자바 가상 머신(JVM) 환경 생성
 * 	- 바이트코드를 메모리에 로드하고 바이트코드 여부 검증
 * 	- main 메소드 실행
 * 
 * public class는 파일 명과 클래스 명이 같아야 한다
 */
public class Hello {
	public static void main(String[] args) {
		//System.out: 표준 출력 => 콘솔(화면) 출력
		System.out.println("Hello World");
		System.out.println("Hello Java");
	}
}
