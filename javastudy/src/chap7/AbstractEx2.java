package chap7;
/*
 * AbstractEx1.java 소스의 Shape,Circle,Rectangle 클래스를 이용하기
 */
public class AbstractEx2 {
	public static void main(String[] args) {
		//1. 원,사각형 객체를 생성하기
		Shape[] s = new Shape[2];
		s[0] = new Circle(10);
		s[1] = new Rectangle(10,10);
		//2. 도형의 면적의합과 둘레의 합 출력
		double totArea = 0;
		double totLength = 0;
		for(Shape a : s) {
			totArea += a.area();
			totLength += a.length();
		}
		System.out.println("전체면적:"+totArea);
		System.out.println("전체둘레:"+totLength);
	}
}