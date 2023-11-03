package chap7;

/*
접근제어자 : private < (default) < protected < public
	멤버변수, 멤버메서드	: priate < (default) < protected > public 가능
	클래스			: (default) < public
					  (default) 클래스	: 같은 패키지 내에서만 접근 허용
					  public 클래스		: 그 외 접근허용
*/
import chap7.test.Modifier2;


class Modifier3 extends Modifier2 {
	@Override
	public void method() {
		System.out.println("chap7.Modifier3의 메소드");
//		System.out.println("v1="+v1);	// private 오류, Modifier2 클래스 내에서만 접근 허용
//		System.out.println("v2="+v2);	// default 오류, chap7.test 패키지 내에서만 접근 허용
		System.out.println("v3="+v3);	// protected 상속관계이므로 정상
		System.out.println("v4="+v4);	// public 정상
	}
}

public class ModifierEx2 {	//chap7.ModifierEx2

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();	//chap7.test.Modifier2
		m2.method();	// public 제어자이므로 정상
//		System.out.println(m2.v1);	// private 오류, Modifier2 클래스 내에서만 접근 허용
//		System.out.println(m2.v2);	// default 오류, chap7.test 패키지 내에서만 접근 허용
//		System.out.println(m2.v3);	// protected 오류, 상속관계에서만 접근 허용
		System.out.println(m2.v4);	// public 정상

		Modifier2 m3 = new Modifier2();	//chap7.test.Modifier2
		m3.method();
	}

}
