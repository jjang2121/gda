package chap7;

/*
Product 클래스
멤버변수 : 가격(price), 포인트(point)
생성자 : 가격을 입력받아, 가격의 10%를 포인트로 저장

TV클래스 : Product 클래스의 하위 클래스
가격 : 100
toString : TV리턴
Computer클래스 : Product 클래스의 하위 클래스
가격 : 200
toString : Computer리턴
HandPhone클래스 : Product 클래스의 하위 클래스
가격 : 150
toString : HandPhone리턴
*/

class Product {
	int price;
	String ProductName;

	public Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	public Tv() {
		super(100);
	}

	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	public HandPhone() {
		super(150);
	}

	@Override
	public String toString() {
		return "HandPhone";
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();

		System.out.println(t + ", 가격:" + t.price);
		System.out.println(c + ", 가격:" + c.price);
		System.out.println(h + ", 가격:" + h.price);
	}

}
