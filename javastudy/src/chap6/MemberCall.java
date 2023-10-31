package chap6;
/*
 추상화	> 클래스	> 변수	> 클래스변수	: 클래스 정보 로드 시 메모리 할당 (클래스멤버)
 						> 인스턴스변수	: 객체화 시 메모리 할당 (인스턴스멤버)
 				> 메서드	> 클래스메서드	: 클래스 정보 로드 시 메모리 할당 (클래스멤버)
 						> 인스턴스메서드	: 객체화 시 메모리 할당 (인스턴스멤버)
클래스멤버에서 클래스멤버, 인스턴스멤버에서 인스턴스멤버, 인스턴스멤버에서 클래스멤버 호출 시 장성
인스턴스멤버에서 클래스멤버 사용 시 객체화 필요

같은 멤버들끼리 클래스명, 참조변수명 등을 생략가능.
단 클래스멤버에서 인스턴스멤버 호출 시 객체화 필요하므로 이때는 참조변수명을 사용함.
 */


public class MemberCall {
	static int cv1 = 10;
	static int cv2 = cv1;	// 클래스변수 = 클래스변수 정상

	int iv1 = 100;
	int iv2 = iv1;			// 인스턴스변수 = 인스턴스변수 정상
	int iv3 = cv1;			// 인스턴스변수 = 클래스변수 정상
	
	// static int cv3 = iv1;	// 오류발생, 인스턴스(변수) 멤버가 메모리에 할당 전이기에 오류
	static int cv3 = new MemberCall().iv1;	// 객체화를 시켜 정상적인 사용 가능
	
	void method1() { // 인스턴스 메서드
		System.out.println("cv1+cv2 ="+(cv1+cv2));	// 클래스변수 호출 정상
		System.out.println("iv1+iv2 ="+(iv1+iv2));	// 인스턴스변수 호출 정상
	}
	static void method2() {	// 클래스 메서드
		System.out.println("cv1+cv2 ="+(cv1+cv2));	// 클래스변수 호출 정상
		// System.out.println("iv1+iv2 ="+(iv1+iv2));	// 오류발생, 클래스(메서드) 멤버는 메모리 할당되었으나, 인스턴스(변수) 멤버가 아직 메모리에 미할당, 객체화가 되어야 함.
		MemberCall mc = new MemberCall();
		System.out.println("iv1+iv2 ="+(mc.iv1+mc.iv2));	// 인스턴스변수 호출 시 객체화 필요
	}
	void method3() {	// 인스턴스 메서드
		method1();		// 인스턴스 메서드 호출 정상
		method2();		// 클래스 메서드 호출 정상
	}
	static void method4() {	// 클래스 메서드
		// method1();	// 클래서 메서드(메모리 할당)에서 인스턴스 메서드(메모리 비할당) call 시 오류발생
		new MemberCall().method1(); //인스턴스 메서드 호출 시 객체화 필요
		method2();		// 클래스 메서드 호출 정상
	}
	public static void main(String[] args) {	// 클래스메서드
		//method1~4 함수호출
		MemberCall mc = new MemberCall();	// 클래스 객체화처리
		
		mc.method1();
		new MemberCall().method1();

		method2();
		
		mc.method3();
		new MemberCall().method3();
		
		method4();
	}

}
