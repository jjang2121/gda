package test1106;
//Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
public class Test3_A {
	public static void main(String[] args) {
//		System.out.println(new Outer1().new Inner1().iv);
//		System.out.println(new Outer1.Inner2().iv);
		Outer1 out = new Outer1();
		Outer1.Inner1 in1 = out.new Inner1();
		System.out.println(in1.iv);
		Outer1.Inner2 in2 = new Outer1.Inner2();
		System.out.println(in2.iv);
	}
}