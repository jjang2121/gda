package chap6;
/*
SutdaCard 클래스 구현하기
멤버변수 : int num, boolean isKwang
멤버메서드 : toString()
[결과]
3
1K

*/

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this.num = 1;
		isKwang = true;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + ((isKwang == true) ? "K" : "");
	}
}

public class Exam5 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, false);
		SutdaCard c2 = new SutdaCard();
		System.out.println(c1); // 3
		System.out.println(c2); // 1K
	}
}
