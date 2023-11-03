package chap8;

/*
인터페이스
1. 인터페이스 멤버 : 상수, 추상메서드, default메서드, static 메서드만 가능
2. 인터페이스 접근제어자 : public만 가능
3. 객체화 불가 => 구현클래스(인터페이스를 구현)의 객체화로 객체화
4. 클래스와 인터페이스는 구현으로 표현함. => impliments 예약어 사용
	=> 다중구현 가능
5. 인터페이스간의 상속 가능 => 다중상속 가능

인터페이스 멤버
상수			:	[public static final] int NUM = 100;	(O)
				[public static] final int NUM = 100;	(O)
				protected int NUM = 100;				(X)
추상메서드		:	[public abstract] void method();		(O)
				[public] abstract void method();		(O)
default메서드	:	구현부가 있는 메서드. 인스턴스멤버. jdk8 이후에서 가능
static메서드	:	구현부가 있는 메서드. 클래스멤버. jdk8 이후에서 가능

참조자료형		:	배열, 클래스, 인터페이스
*/

// 인터페이스
interface Printerable {
	int INK = 100;			//상수
	abstract void print();	//메서드
}

// 추상클래스
abstract class Test implements Printerable {
}

// 추상클래스 상속
class Test1 extends Test {
	@Override
	public void print() {
		System.out.println(INK);
	}
	
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		System.out.println(Printerable.INK);
		Test1 t = new Test1();
		t.print();
	}

}
