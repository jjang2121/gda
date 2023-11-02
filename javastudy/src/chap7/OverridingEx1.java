package chap7;

/*
오버라이딩 예제
오버라이딩 :	메서드의 재정의, 상속관계에서 가능함.
	- 부모클래스의 메서드를 자손클래스에서 다시 구현함 => 재정의
	- 부모클래스 메서드의 선언부와 자손클래스 메서드의 선언부가 같아야 함.
	- 단 접근제어자는 넓은 범위로 가능
	- 단 예외처리는 좁은 범위로 가능
*/

class Bike {
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	String drive() {
		return "폐달을 밟다.";
	}
	String stop() {
		return "브레이크를 잡는다.";
	}
}

class AutoBike extends Bike {
	boolean power;
	
	AutoBike(int wheel){
		super(wheel);
	}

	void power() {
		power = !power;
	}

	@Override			// 오버라이딩 검증을 위한 어노테이션
	String drive() {	// 메서드 재정의. 오버라이딩된 메서드
		if(power) {
			// System.out.println(super.drive());
			return "출발버튼을 누른다.";
		} else
			return "전원을 켜세요.";
	}
	/*	=> 오버라이딩은 부모클래스의 메서드와 선언부가 동일하여야 한다. 리턴타입이 달라서 오류발생!
	void drive() {
		System.out.println("출발버튼을 누른다.");
	}
	*/

}


public class OverridingEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
	}

}
