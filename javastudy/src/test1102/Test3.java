package test1102;

/*
Test2.java의 클래스를 이용
Buyer 클래스 구현하기
멤버변수 :	money = 10000;
		point, 구매건수(cnt), 장바구니(cart) = new Food[10]
멤버메서드
	void buy(Food)
	1. 현재 잔액보다 물품값이 큰 경우 잔액부족 메시지 출력
	2. 보유 금액에서 물품 가격만큼 차감
	3. 물품의 포인트만큼 포인트 증가
	4. 물품명, 가격 출력
	5. Cart 구매물품 추가, cnt 1 증가
	void summary()
	1. Cart 상품을 조회하여 구매한 물품의 목록 출력
	2. Cart 상품을 조회하여 구매한 물품의 가격, 포인트 합계 출력
	3. 구매한 상품 중 과일의 갯수, 과일구매금액, 과일구매 목록 출력
	4. 구매한 상품 중 음료의 갯수, 음료구매금액, 음료구매 목록 출력
	5. 구매한 상품 중 과자의 갯수, 과자구매금액, 과자구매 목록 출력
	6. 현재 잔액과 포인트 출력
*/

class Buyer {
	int money, point, cnt;
	Food[] cart = new Food[10];

	public Buyer() {
		money = 10000;
	}

	public void buy(Food f) {
		// 잔액부족 검증
		if (money < f.price) {
			System.out.println(f.foodName + "현재 잔액이 부족합니다.");
			return;
		}
		// Cart 구매수 검증
		if (cnt >= cart.length) {
			System.out.println("구매건수를 초과 하였습니다.");
			return;
		}

		this.money -= f.price;
		this.point += f.point;

		System.out.println(f.foodName + "구입, 가격:" + f.price);
		cart[cnt++] = f;
	}

	public void summary() {
		String str = "\n구매목록\n";
		int fCnt=0, fPrice=0,dCnt=0, dPrice=0,sCnt=0, sPrice=0;
		String fName="", dName="", sName="";
//		1. Cart 상품을 조회하여 구매한 물품의 목록 출력
//		2. Cart 상품을 조회하여 구매한 물품의 가격, 포인트 합계 출력
//		3. 구매한 상품 중 과일의 갯수, 과일구매금액, 과일구매 목록 출력
//		4. 구매한 상품 중 음료의 갯수, 음료구매금액, 음료구매 목록 출력
//		5. 구매한 상품 중 과자의 갯수, 과자구매금액, 과자구매 목록 출력
//		6. 현재 잔액과 포인트 출력
		for(int i=0;i<cart.length;i++) {
			if(cart[i] != null) {
				System.out.println(cart[i].foodName + ", 가격:"+ cart[i].price);
				if(cart[i] instanceof Fruit){
					fCnt++;
					fPrice += cart[i].price;
					fName += cart[i].foodName+",";
				}
				else if(cart[i] instanceof Drink){
					dCnt++;
					dPrice += cart[i].price;
					dName += cart[i].foodName+",";
				}
				else if(cart[i] instanceof Snack){
					sCnt++;
					sPrice += cart[i].price;
					sName += cart[i].foodName+",";
				}
			}
		}

		str += "과일 구매수 :" + fCnt + ", 구매금액 : "+ fPrice + ", 구매목록 : "+ fName + "\n";
		str += "음료 구매수 :" + dCnt + ", 구매금액 : "+ dPrice + ", 구매목록 : "+ dName + "\n";
		str += "스낵 구매수 :" + sCnt + ", 구매금액 : "+ sPrice + ", 구매목록 : "+ sName + "\n";
		str += "현재잔액 : "+ this.money + ", 포인트 : "+ this.point;
		
		System.out.println(str);
	}
}

public class Test3 {
	public static void main(String[] args) {
		int pPoint = 0;
		Apple apple = new Apple(1000, 10.5);// 가격, 당도(brix)
		Peach peach = new Peach(1000, 13.5);// 가격, 당도(brix)
		Cock cock = new Cock(500, 500); // 가격, 용량(ml)
		Sidar sidar = new Sidar(1500, 1000);// 가격, 용량(ml)
		Biscuit bis = new Biscuit(10000, 500);// 가격, 무게(gram)
		Cookie cookie = new Cookie(500, 5000);// 가격, 무게(gram)
		//1.Buyer 클래스 객체 생성
		Buyer b = new Buyer();

		// 구매정보 출력(b.buy 함수 호출)
		b.buy(apple);
		b.buy(peach);
		b.buy(cock);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		//Cart 상품 조회하여 구매물품 목록
		
		b.summary();

		System.out.println();
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

		for (Fruit fArr : f) {
			System.out.println(fArr.getStr());
		}
		for (Drink dArr : d) {
			System.out.println(dArr.getStr());
		}
		for (Snack sArr : s) {
			System.out.println(sArr.getStr());
		}

		System.out.println("적립포인트 : " + pPoint);
	}
}
