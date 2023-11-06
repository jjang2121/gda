package chap8;

/*
추상클래스와 인터페이스의 객체화 => 이름없는 객체(익명객체). 이름없는 내부클래스
*/

interface Action {
	void action();
}

abstract class Abs {
	int num = 100;
	abstract void method();
}

public class InterfaceEx4 {

	public static void main(String[] args) {
		// 인터페이스의 객체화
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
			}
		};
		a.action();
		
		Abs abs = new Abs() {
			@Override
			public void method() {
				System.out.println("Abs 추상클래스의 method 메서드, num="+this.num);
			}
		};
		abs.method();
	}

}
