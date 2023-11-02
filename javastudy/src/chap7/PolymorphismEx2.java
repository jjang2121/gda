package chap7;

/*
부모클래스의 멤버와 자손클래스의 멤버가 같은 멤버인 경우
	멤버변수	: 참조변수의 자료형을 기준으로 호출됨
	멤버메서드	: 객체의 최종 오버라이딩된 메서드가 호출됨
*/

class Parent2 {
	int x = 10;

	void method() {
		System.out.println("Parent2 클래스의 method");
	}
}

class Child2 extends Parent2 {
	int x = 20;

	@Override
	void method() {
		// 멤버변수
		int x = 30;
		System.out.println("Child2 클래스의 method");
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class PolymorphismEx2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		System.out.println(p.x);
		p.method();
		// 부모타입이 큰자료형임.
		Child2 c = (Child2) p; // 자손타입 참조변수 <= 부모타입 참조변수 형변환 : 형변환 연산자 필수
		System.out.println(c.x);
		c.method();
		
		// 부모객체를 자손타입의 참조변수로 참조
		// java.lang.ClassCastException : 참조할 수 없는 참조형으로 객체를 참조함.
		Child2 c2 = (Child2)new Parent2();	// 예외발생
		System.out.println(c2.x);
		c2.method();
	}
}
