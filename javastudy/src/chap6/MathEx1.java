package chap6;
/*
멤버메서드(함수, Function)
메서드 구성
[접근제어자][제어자] 리턴타입 메서드이름 (매개변수목록)		=> 선언부
{ 문장들... }									=> 구현부
리턴타입 : 메서드 종료 후 전달되는 값의 자료형을 선언부에 기술
		void인 경우 전달 값이 없음.
매개변수 : 메서드 호출 시 필요한 값의 목록 (자료형 변수명, 자료형 변수명, ...)
return 예약어 : 메서드 종료.
	리턴타입이 void인 경우		: 생략가능. 메서드 끝의 }가 메서드 종료
	리턴타입이 void가 아닌 경우	: 생략불가.
							  return 리턴값;
							  리턴값은 리턴타입과 같거나, 리턴타입으로 자동형변환이 되는 경우 가능.
*/

class Math1 {
	int add1(int a, int b) {
		return a + b;
	}
	int add1(int a, int b, int c) {
		return a + b + c;
	}

	long add2(int a, int b) {
		return a + b;
	}

	void add3(int a, int b) {
		System.out.println("add3(10, 20) = " + (a + b));
		return;
	}
}

public class MathEx1 {

	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println("add1(10, 20) = " + a1);
		
		int a1_1 = m1.add1(10, 20, 30);
		System.out.println("add1(10, 20, 30) = " + a1_1);

		long a2 = m1.add2(10, 20);
		System.out.println("add2(10, 20) = " + a2);

		m1.add3(10, 20);
	}
}
