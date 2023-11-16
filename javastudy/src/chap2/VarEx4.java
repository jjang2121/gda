package chap2;

/*
 * [자바의 자료형]
 * 1. 기본자료형 (byte 단위)
 * - 논리형: boolean(1)
 * - 문자형: char(2)
 * - 정수형: byte(1), short(2), int(4), long(8)
 * - 실수형: float(4), double(8)
 * 
 * 2. 참조자료형
 * - 배열
 * - 클래스
 * - 인터페이스
 * 
 * [형변환]
 * 1. 기본자료형 중 boolean을 제외한 7개 자료형은 서로 형병환이 가능하다
 * 2. 기본자료형과 참조자료형은 형변환이 불가능하다.(Wrapper class는 제외)
 * 3. 자동형변환은 형변환 연산자 생략 가능: 작은 자료형에서 큰 자료형으로 변환될 때
 * 4. 명시적형변환은 형변환 연산자 생략 불가: 큰 자료형에서 작은 자료형으로 변환될 때
 * 5. float -> long: 명시적형변환, long -> float: 자동형변환: 타입의 바이트 크기가 아닌 실제 데이터의 범위를 기준으로 결정 
 */
public class VarEx4 {

	public static void main(String[] args) {

		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50; // 정수 => float 형변환
		double d = 60; // 정수 => double 형변환
		
		// b = 128; 에러: byte 타입의 범위를 벗어난다 (-128 ~ 127)
		b = (byte)257; // (타입): 형변환 연산자
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		s = (short)i; // 작은 자료형에 큰 자료형으로 형변환 = 명시적 형벽환. 형변환 연산자는 필수이다
		l = (long)i; // 큰 자료형에서 작은 자료형으로 형변환 = 자동형변환. 형변환 연산자는 생략 가능
		l = (long)f; // 바이트 크기는 float이 더 작지만 값을 저장하는 범위가 더 크다. 즉, float > long
		f = l;
		
		f = (float)10.0; // 실수형 리터널은 기본이 double이다. float 타입 변수는 double 타입보다 크기가 작기 때문에 형변환 연산자를 생략할 수 없다
		d = 20.0;
		
		// 접미사를 이용한 리터널. 대소문자 구분하지 않아도 됨
		f = 10.0F;
		d = 20.0D;
		l = 100L;

	}

}
