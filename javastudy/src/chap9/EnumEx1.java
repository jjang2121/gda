package chap9;

/*
 열거형
*/


public class EnumEx1 {
	
	public enum Car {
		AVANTE, SONATA, GRANDUER, SM5, K7	// 미리 객체를 생성하여 설정
	}
	
	public enum Carlendar {
		
	}
	
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		System.out.println(Car.K7);
		System.out.println("총 갯수 : "+Car.values().length);
		
		Car[] cars = Car.values();
		for(Car c : cars)	System.out.println(c +":"+ c.ordinal());

		if(car instanceof Object)	System.out.println("car 객체는 Object 객체이다.");
	}

}
