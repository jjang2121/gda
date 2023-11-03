package chap7;
/*
 * 추상클래스간의 상속
 */
abstract class Abs1 { //추상클래스
	int a = 10;
	abstract int getA(); //추상메서드
}
abstract class Abs2 extends Abs1 { //추상클래스
	int b = 20;
	abstract int getB(); //추상메서드
}
class Normal extends Abs2 {
	@Override
	int getB() {
		return b;
	}
	@Override
	int getA() {
		return a;
	}
}
public class AbstractEx3 {
	public static void main(String[] args) {
		Normal n = new Normal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		//
		System.out.println("Abs2 타입으로 형변환");
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		System.out.println("Abs1 타입으로 형변환");
		Abs1 a1 = n;
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b);
//		System.out.println(a1.getB());
		System.out.println("Object 타입으로 형변환");
		Object o = n;
//		System.out.println(o.a);
//		System.out.println(o.getA());
//		System.out.println(o.b);
//		System.out.println(o.getB());
	}
}