package chap9;

/*
중첩클래스(내부클래스) : 클래스 내부에 존재하는 클래스
	- 인스턴스 중첩클래스	: 객체화 시 외부클래스의 객체화 필요.
	- static 중첩클래스	: 'new 외부클래스명.중첩클래스()'으로 객체화
	- local 중첩클래스	: 메서드 내부에서 선언된 클래스. 해당 메서드에서만 객체화가 가능

중첩클래스의 특징
	1. 참조자료형으로 사용됨. 객체화가 가능. Object 클래스의 하위클래스. 다른 클래스를 상속 가능.
	   '외부클래스명.중첩클래스명'
	   중첩클래스별로 바이트코드 생성
	2. 외부클래스의 private 멤버에 접근이 가능.
*/

class Outer1 {
	//인스턴스 중첩클래스 :	외부 클래스가 객체화가 되어야 클래스가 됨.
	//					외부 클래스 객체화 후 내부클래스의 객체화 가능
	class InstanceInner {
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}
	// static 중첩클래스 :	외부클래스의 클래스멤버. 객체화 필요없음.
	//					new 외부클래스.내부클래스() 객체화 가능
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		// method() 내부에서만 사용가능.
		class LocalInner {	// local 중첩클래스 : 메서드 내부에서 선언된 클래스.
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner();	// 내부클래스 객체화
		System.out.println("lc.iv="+lc.iv);
		System.out.println("lc.cv="+lc.cv);
		System.out.println("LocalInner.iv="+LocalInner.cv);
		System.out.println("LocalInner.cv="+LocalInner.MAX);
	}
	void method2() {
		// LocalInner lc = new LocalInner();	// 해당메서드 내부에서만 가능
	}
}

public class InnerEx1 {

	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
		System.out.println();
		
		// InstanceInner 클래스의 객체화
		Outer1.InstanceInner in1 = out.new InstanceInner();
		// Outer1.InstanceInner in1 = new Outer1().new InstanceInner();
		// InstanceInner 멤버값 출력
		System.out.println("===== InstanceInner 멤버값 출력 =====");
		System.out.println("in1.iv="+in1.iv);
		System.out.println("Outer1.InstanceInner.cv="+Outer1.InstanceInner.cv);
		System.out.println("Outer1.InstanceInner.MAX="+Outer1.InstanceInner.MAX);
		
		// StaticInner 클래스의 객체화
		Outer1.StaticInner in2 = new Outer1.StaticInner();
		// StaticInner 멤버값 출력
		System.out.println("===== StaticInner 멤버값 출력 =====");
		System.out.println("in2.iv="+in2.iv);
		System.out.println("Outer1.StaticInner.cv="+Outer1.StaticInner.cv);
		System.out.println("Outer1.StaticInner.MAX="+Outer1.StaticInner.MAX);
		
	}

}
