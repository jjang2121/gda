package chap7.test;

public class Modifier3 {

	public void method() {
		//Modifier3 클래스의 접근제어자가 default임
		//다른 패키지에서클래스에 접근 불가
//		chap7.Modifier3 m3 = new chap7.Modifier3();
//		m3.method();
		//ModifierEx2 클래스의 접근 제어자가 public 임
		//다른 패키지에서 접근 허용
		chap7.ModifierEx2 m2 = new chap7.ModifierEx2();
	}
}


