package chap7;
/*
Buyer 클래스
멤버변수 : money = 500, point
		Product[] items = new Product[5];	=> 장바구니
		int cnt => 구매갯수
멤버메서드
	void buy(Product p);
	1. p상품의 가격을 money에서 차감
	2. p상품의 포인트를 point에 증가
	3. items에 p상품명을 추가. cnt 증기
	4. p제품의 이름을 출력. ex)Tv구입
	
	void summary()
	1. 구매 제품 전체의 금액 합계, 포인트 합계 출력
	2. 잔액 출력
	3. 전체 구매물품 이름 출력
*/

class Buyer {
	int money, point, cnt;
	Product[] items = new Product[5];

	public Buyer() {
		money = 500;
	}

	// 구매
	void buy(Product p) {
		if(cnt >= 5) {
			System.out.println("구매수량을 초과 하였습니다.");
			return;
		}
		if(money-p.price <0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price; // 소지금액 차감
		point += p.point; // 포인트 증가
		items[cnt++] = p; // Product배열 추가 및 구매수량 추가
		// cnt++; // 구매수량 추가
		System.out.println(p.productName + "구입");
	}

	// 요약
	void summary() {
		int tPrice = 0, tPoint = 0;
		String tProductName = "";
		for (Product p : items) {
			if (p != null) {
				tPrice += p.price;
				tPoint += p.point;
				tProductName += "\n" + p.productName;
			}
		}
		System.out.println("====== Summary ======");
		System.out.println("구매 제품 총액 : " + tPrice + "원, 총 포인트 : " + tPoint + "원");
		System.out.println("클래스 잔액 : " + money + "원");
		System.out.println("\n-- 전체 물품 목록 --" + tProductName);

	}
}

public class Exam2 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(c);
		b.buy(h);
		b.summary();
		System.out.println("main Buyer 잔액:" + b.money);
		System.out.println("main Buyer 포인트:" + b.point);
		b.buy(t);
		b.buy(c);
		b.buy(h);
	}

}
