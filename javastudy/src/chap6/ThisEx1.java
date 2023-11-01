package chap6;

/*
this, this() 예제
this 참조변수 : 자기참조변수
	현재 객체의 참조값을 저장하고 있음.
	인스턴스 메서드에서만 사용 가능 => 인스턴스 메서드 내부에 지역변수로 선언됨.
	지역변수와 멤버변수를 구분 시 사용함.
	멤버변수와, 지역변수는 같은 이름을 사용할 수 있다.

this() 생성자 : 클래스의 생성자에서 오버로딩된 다른 생성자를 호출 시 사용.
	=> 반드시 첫줄에 구현해야 함.
*/

class Car4 {
	String color; // 인스턴스 변수
	int number; // 인스턴스 변수
	int sno;
	static int cnt;
	
	public Car4(String color, int number) {
		System.out.println("Car4(String color, int number) 호출");
		this.color = color;
		this.number = number;
		this.sno = ++cnt;
	}
	public Car4() {
		// this()는 반드시 생성자의 첫줄에 구현해야 함.
		this("white", 1111); // 생성자 중 (String, int) 형인 생성자 호출
		System.out.println("Car4() 호출");
	}
	public Car4(String color) {
		this(color, 1111);
		System.out.println("Car4(String color) 호출");
	}
	public Car4(int number) {
		this("white", number);
		System.out.println("Car4(int number) 호출");
	}

	@Override
	public String toString() {
		return sno + "번 자동차, " + color + ", " + number;
	}
}

public class ThisEx1 {

	public static void main(String[] args) {
		System.out.println("=== c1 객체 생성");
		Car4 c1 = new Car4("blue", 1234); // 지역변수
		System.out.println("=== c2 객체 생성");
		Car4 c2 = new Car4(); // black, 1000 자동차 생성
		System.out.println("=== c3 객체 생성");
		Car4 c3 = new Car4("red"); // white, 2000 자동차 생성
		System.out.println("=== c4 객체 생성");
		Car4 c4 = new Car4(3333); // white, 2000 자동차 생성
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}
}
