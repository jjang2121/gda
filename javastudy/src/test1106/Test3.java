package test1106;
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}
//Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
public class Test3 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 oi = out.new Inner1();
		System.out.println("Outer1.Inner1 iv="+oi.iv);
		
		Outer1.Inner2 oi2 = new Outer1.Inner2();
		System.out.println("Outer1.Inner2 iv="+ oi2.iv);
	}
}