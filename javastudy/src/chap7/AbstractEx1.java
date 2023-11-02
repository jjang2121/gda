package chap7;

/*
추상 클래스
1. 추상메서드를 멤버로 가지고 있는 쿨래스 => abstract 예약어 사용
2. 객체화 불가 => 상속을 통한 자손클래스의 객체화로 객체화
3. 그 외 일반 클래스와 동일

추상메서드
1. 메서드의 선언부만 존재함. 구현부{}가 없다. => abstract 예약어 사용
2. 자손클래스에서 반드시 오버라이딩 필요.
*/

abstract class Shape {
	String type;

	Shape(String type) {
		this.type = type;
	}

	abstract double area();

	abstract double length();
}

class Circle extends Shape {
	int r;
	final double pi = Math.PI;
	
	Circle(int r) {
		super("원");
		this.r = r;
	}

	@Override
	public double area() {
		return Math.pow(r, 2) + pi;
	}

	@Override
	double length() {
		return 2 * r * pi;
	}

}

public class AbstractEx1 {

	public static void main(String[] args) {
//		Shape s = new Shape("");	// 추상클래스는 객체화 불가
		Shape s = new Circle(10);
		//System.out.println((s instanceof Circle));
		System.out.println(s.area());
		System.out.println(s.length());
		System.out.println(((Circle)s).r);	// 아래구문과 동일
		/*
		Circle c = (Circle)s;
		System.out.println(c.r);
		*/
	}

}
