package chap6;

/*
선언 위치에 따른 변수의 종류
클래스 변수
인스턴스 변수(객체변수)
지역변수
*/


class Car{
	String color;
	int number;
	static int width=200;
	static int height=120;
	@Override
	public String toString() {
		return color + ":" + number +"("+width +","+height+")";
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		System.out.println("자동차의 크기:"+Car.width+","+Car.height);
		// System.out.println("자동차의 색상:"+Car.color);	//오류발생
		Car car1 = new Car();
		car1.color = "White";
		car1.number = 1234;
		//System.out.println("자동차의 색상:"+car1.color);
		System.out.println("car1:"+car1);

		Car car2 = new Car();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2:"+car2);

		Car car3 = new Car();
		car3.color = "red";
		car3.number = 3456;
		System.out.println("car3:"+car3);

		car3.width = 300;
		car3.height = 200;
		System.out.println("car1:"+car1);
		System.out.println("car2:"+car2);
		System.out.println("car3:"+car3);
	}
}
