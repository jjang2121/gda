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
	int price, point;
	String productName;
	static int sumPrice, sumPoint;

	/*
	public Product(int price) {
		this(price, "");
	}
	
	public Product(String productName) {
		this(0, productName);
	}
	*/

	public Product(int price, String productName) {
		this.price = price;
		this.productName = productName;
		point = price / 10;
		sumPrice += price;
		sumPoint += point;
	}

	@Override
	public String toString() {
		return this.productName;
	}
}

// Tv
class Tv extends Product {
	public Tv() {
		super(100, "Tv");
	}
}

// Computer
class Computer extends Product {
	public Computer() {
		super(200, "Computer");
	}
}

// HandPhone
class HandPhone extends Product {
	public HandPhone() {
		super(150, "HandPhone");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();

		System.out.printf("%s의 가격:%d, 포인트:%d\n", t, t.price, t.point);
		System.out.printf("%s의 가격:%d, 포인트:%d\n", c, c.price, c.point);
		System.out.printf("%s의 가격:%d, 포인트:%d\n", h, h.price, h.point);
		// 클래스변수 사용
		System.out.println("상품의 총합은 : " + Product.sumPrice + "원, 포인트의 총합은 " + Product.sumPoint);

		// Product 타입의 배열로 저장 (다형성)
		Product[] pArr = new Product[3];
		pArr[0] = t;
		pArr[1] = c;
		pArr[2] = h;

		// Product 객체의 가격 합과 포인트의 합 출력하기
		int tPrice = 0;
		int tPoint = 0;
		for (Product p : pArr) {
			tPrice += p.price;
			tPoint += p.point;
		}
		System.out.println("상품의 총합은 : " + tPrice + "원, 포인트의 총합은 " + tPoint);

		/*
		System.out.println(t + ", 가격:" + t.price + ", 포인트:" + t.getPoint());
		System.out.println(c + ", 가격:" + c.price + ", 포인트:" + c.getPoint());
		System.out.println(h + ", 가격:" + h.price + ", 포인트:" + h.getPoint());
		*/
	}

}
