package chap10;

/*
오버라이딩에서의 예외처리 : 부모클래스 메서드의 예외처리보다 자손클래스 메서드의 예외처리는 같거나 작은 범위만 가능
*/

class Parent {
	public void method() throws RuntimeException {
		System.out.println("Parent 클래스의 method");
	}
}

class Child extends Parent {
	@Override
	public void method() throws RuntimeException {
		System.out.println("Child 클래스의 method");
	}
}

public class ExceptionEx7 {

	public static void main(String[] args) {
		new Child().method();
	}
	

}
