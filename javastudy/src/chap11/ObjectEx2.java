package chap11;

/*
Object 클래스	:	toString() 메서드
toString	:	객체의 문자열로 변환해주는 메서드
				참조변수 이름으로 출력하면, 자동 호출되는 메서드.
				기본 Object 클래스에서는 클래스명@16진수해쉬코드로 구현함
				=> 내용 기준으로 출력하기 위해서 오버라이딩 필요.
Exam1.java 소스의 Card 클래스 출력하기	=> toString 메서드를 오버라이딩 필요
*/



public class ObjectEx2 {

	public static void main(String[] args) {
		Card c1 = new Card("spade", 1);
		Card c2 = new Card("spade", 1);

		System.out.println(c1);	// c1.toString() 메서드가 자동호출 됨
		System.out.println(c2);	// c2.toString() 메서드가 자동호출 됨
	}
}
