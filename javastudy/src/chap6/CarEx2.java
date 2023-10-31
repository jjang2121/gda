package chap6;

/*
선언 위치에 따른 변수의 종류
						선언위치		선언방법				메모리 할당시점				메모리 할당위치
1. 클래스 변수				클래스 내부		static 자료형 변수명	클래스 정보가 로드 시(즉시)		클래스 영역
	- 객체화 필요없음. 모든 객체의 공통변수로 사용됨.
	- '클래스명.변수명'으로 호출
	- 값이 없으면 기본값으로 초기화.
2. 인스턴스 변수(객체변수)		클래스 내부		자료형 변수명			객체화 시					힙 영역
	- 반드시 객체화 필요. 객체별로 다른 메모리 할당.
	- '참조변수명.변수명'으로 호출
	- 값이 없으면 기본값으로 초기화.
3. 지역변수				메서드 내부		자료형 변수명			선언문 실행 시				스택 영역
	- 메서드, 블럭 내에서만 사용가능.
	- 기본값으로 초기화 안됨. 반드시 초기화 필요.
	- 매개변수는 지역변수다.
*/


class Car2{
	String color;			//인스턴스 변수
	int num;				//인스턴스 변수
	int sno;				//인스턴스 변수
	static int cnt;			// 클래스 변수
	@Override
	public String toString() {
		return "자동차번호:"+ sno + "=>" + color +","+ num +", 자동차 생산갯수:"+cnt;
	}
}

public class CarEx2 extends CarEx1 {

	public static void main(String[] args) {
		Car2 c1		= new Car2();	// 지역변수
		c1.color	= "white";
		c1.num 		= 1234;
		c1.sno		= ++Car2.cnt;
		System.out.println("c1:"+c1);

		Car2 c2		= new Car2();	// 지역변수
		c2.color	= "black";
		c2.num 		= 2345;
		c2.sno		= ++Car2.cnt;
		System.out.println("c2:"+c2);
		System.out.println("c1:"+c1);
		
	}
}
