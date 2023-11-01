package chap6;

/*
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
