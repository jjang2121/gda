package chap7;
/*
 * 추상클래스
 * 1. 추상메서드를 멤버로 가질수 있는 클래스 => abstract 예약어 사용
 * 2. 객체화 불가 => 상속으로 자손클래스의 객체화로 객체화됨
 * 3. 그외는 일반클래스와 동일함(생성자,멤버변수,초기화블럭,상속받기...)
 * 
 * 추상메서드
 * 1. 메서드의 선언부만 존재함. 구현부{} 가 없다 =>abstract 예약어 사용
 * 2. 자손클래스에서 반드시 오버라이딩 필요.
 */
//제어자 : abstract => 클래스에서 사용 => 추상클래스
//                => 메서드에서 사용 => 추상메서드
abstract class Shape{ //추상클래스
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area(); //추상메서드
	abstract double length();
}
class Circle extends Shape {  //area(), length() 메서드를 반드시 오버라이딩 해야함
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {	 return r*r*Math.PI;	 }
	@Override
	double length() {		return 2*r*Math.PI; 	}
}
/*
 * 사각형(Rectangle) 클래스 구현하기
 * Shape클래스 상속 받은 클래스
 * 멤버변수 : width, height
 * 멤버메서드 area(),length() 오버라이딩 필수
 */
class Rectangle extends Shape {
	int width, height;
	Rectangle(int width,int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width*height;
	}
	@Override
	double length() {
		return (width+height) * 2;
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
//		Shape s = new Shape("도형"); //추상클래스는 객체화 불가
		Shape s = new Circle(10);
		System.out.println(s.area());
		System.out.println(s.length());
		System.out.println(((Circle)s).r);
		Circle c = (Circle)s;
		System.out.println(c.r);
	}
}