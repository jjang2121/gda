package chap6;
/*
Rectangle 클래스 생성하기
멤버변수 : 가로(width), 세로(height), 사각형 번호(sno), 생성된 사각형 갯수(cnt)
멤버메서드 : 넓이(area), 둘레(length) 출력
		  toString();
		  toString() : 1번 사각형 : 가로(10), 세로(20), 생성된 사각형갯수(1)
*/

class Rectangle2 {
	int width;
	int height;
	int sno;
	static int cnt;

	void area() {
		System.out.printf("사각형의 넓이는 : %2d 입니다.\n", (width * height));
	}

	void length() {
		System.out.printf("사각형의 둘레는 : %2d 입니다.\n", 2 * (width + height));
	}

	@Override
	public String toString() {
		return this.sno + "번 사각형 가로(" + this.width + "), 세로(" + this.height + "), 생성된 사각형 갯수(" + cnt + ")";
	}
}

public class Exam2 {

	public static void main(String[] args) {
		Rectangle2 rec1 = new Rectangle2();
		rec1.width = 10;
		rec1.height = 20;
		rec1.sno = ++Rectangle2.cnt;
		rec1.area();
		rec1.length();
		System.out.println(rec1);

		System.out.println();

		Rectangle2 rec2 = new Rectangle2();
		rec2.width = 30;
		rec2.height = 40;
		rec2.sno = ++Rectangle2.cnt;
		rec2.area();
		rec2.length();
		System.out.println(rec2);
		System.out.println(rec1);	// Rectangle2.cnt 값 변함없음.
	}

}
