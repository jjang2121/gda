package test1102;
import cmmn.Function;
/*
1. Food 클래스
멤버 변수 : 가격(price)과 포인트(point)
생성자 : 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
식품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
Fruit 클래스 : Food 클래스의 하위 클래스
Drink 클래스 : Food 클래스의 하위 클래스
Snack 클래스 : Food 클래스의 하위 클래스
과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
과일의 종류로는 사과(Apple),복숭아(Peach),
음료의 종류로는 콜라(Cock) 와 사이다(Sidar)
과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
각각의 이름을 리턴한다.
 */

// 최상위 클래스
class Food {
	int price, point;
	String foodName;
	public Food(int price) {
		this.price = price;
		point = price/10;
	}
	public Food(int price, String foodName) {
		this.price = price;
		this.foodName = foodName;
		point = price/10;
	}
}

// 과일
class Fruit extends Food {
	double brix;
	Fruit(int price, double brix){
		super(price);
		this.brix = brix;
	}
	Fruit(int price, double brix, String foodName){
		super(price, foodName);
		this.brix = brix;
	}

	public String getStr() {
		return String.format("%s 가격:%s원, %s 당도(brix):%s", foodName, Function.onlyNumComma(price), foodName, Function.onlyNumComma(brix));
	}
}
//과일 하위 클래스 시작 ======================================================
class Apple extends Fruit {
	Apple(int price, double brix){
		// super(price, brix);
		super(price, brix, "사과");
	}
	@Override
	public String toString() {
		return "사과";
	}
}
class Peach extends Fruit {
	Peach(int price, double brix){
		// super(price, brix);
		super(price, brix, "복숭아");
	}
	@Override
	public String toString() {
		return "복숭아";
	}
}
//과일 하위 클래스 종료 ======================================================


//음료수
class Drink extends Food {
	int ml;
	Drink(int price, int ml){
		super(price);
		this.ml = ml;
	}
	Drink(int price, int ml, String foodName){
		// super(price);
		super(price, foodName);
		this.ml = ml;
	}

	public String getStr() {
		return String.format("%s 가격:%s원, %s 용량(ml):%s", foodName, Function.onlyNumComma(price), foodName, Function.onlyNumComma(ml));
	}
}
//음료수 하위 클래스 시작 ======================================================
class Cock extends Drink {
	Cock(int price, int ml){
		// super(price, ml);
		super(price, ml, "콜라");
	}
	@Override
	public String toString() {
		return "콜라";
	}
}
class Sidar extends Drink {
	Sidar(int price, int ml){
		// super(price, ml);
		super(price, ml, "사이다");
	}
	@Override
	public String toString() {
		return "사이다";
	}
}
//음료수 하위 클래스 종료 ======================================================

//과자
class Snack extends Food {
	int gram;
	Snack(int price, int gram){
		super(price);
		this.gram = gram;
	}
	Snack(int price, int gram, String foodName){
		super(price, foodName);
		this.gram = gram;
	}

	public String getStr() {
		return String.format("%s 가격:%s원, %s 무게(g):%s", foodName, Function.onlyNumComma(price), foodName, Function.onlyNumComma(gram));
	}
}
//과자 하위 클래스 시작 ======================================================
class Biscuit extends Snack {
	Biscuit(int price, int gram){
		// super(price, gram);
		super(price, gram, "비스켓");
	}
	@Override
	public String toString() {
		return "비스켓";
	}
}
class Cookie extends Snack {
	Cookie(int price, int gram){
		// super(price, gram);
		super(price, gram, "쿠키");
	}
	@Override
	public String toString() {
		return "쿠키";
	}
}
//과자 하위 클래스 종료 ======================================================


public class Test2 {
	public static void main(String[] args) {
		int pPoint = 0;
		Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
		pPoint += apple.point;
		Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
		pPoint += apple.point;
		Cock cock = new Cock(500,500);   //가격, 용량(ml)
		pPoint += apple.point;
		Sidar sidar = new Sidar(1500,1000);//가격, 용량(ml)
		pPoint += apple.point;
		Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
		pPoint += apple.point;
		Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)
		pPoint += apple.point;
		
		System.out.println("===== 기본형 출력 =====");
		// 기본형 출력
		System.out.println(apple + "가격:" + apple.price);
		System.out.println(apple + "당도:" + apple.brix);
		System.out.println(peach + "가격:" + peach.price);
		System.out.println(peach + "당도:" + peach.brix);
		System.out.println(cock + "가격:" + cock.price);
		System.out.println(cock + "용량:" + cock.ml);
		System.out.println(sidar + "가격:" + sidar.price);
		System.out.println(sidar + "용량:" + sidar.ml);
		System.out.println(bis + "가격:" + bis.price);
		System.out.println(bis + "무게:" + bis.gram);
		System.out.println(cookie + "가격:" + cookie.price);
		System.out.println(cookie + "무게:" + cookie.gram);
		
		System.out.println("===== 배열형 출력(1차 자손출력) =====");
		Fruit[] f = new Fruit[2];
		Drink[] d = new Drink[2];
		Snack[] s = new Snack[2];
		
		f[0] = apple;
		f[1] = peach;
		d[0] = cock;
		d[1] = sidar;
		s[0] = bis;
		s[1] = cookie;
		
		for(Fruit fArr : f) {
			System.out.println(fArr.getStr());
		}
		for(Drink dArr : d) {
			System.out.println(dArr.getStr());
		}
		for(Snack sArr : s) {
			System.out.println(sArr.getStr());
		}
		
		System.out.println("적립포인트 : "+ pPoint);
	}
}
