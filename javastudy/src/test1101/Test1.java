package test1101;
/*
 * 구동 프로그램 실행시 다음의 결과가 나오도록
 * Rectangle 클래스 구현하기
 * [결과]
    1/5 사각형:(10,20) 면적:200, 둘레:60
    2/5 사각형:(15,25) 면적:375, 둘레:80
    3/5 사각형:(20,30) 면적:600, 둘레:100
    ...
    전체 사각형 면적의합 :1175
    전체 사각형 둘레의합 :240
 */

class Rectangle {
	int width;
	int height;
	int maxLoop = 5;
	int loopCnt;
	static int cnt;
//	static int totarea;
//	static int totlength;
	
	// 생성자 선언
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		this.loopCnt = ++cnt;
	}
	
	// 넓이구하기
	int area() {
		int calcArea = width * height;
//		totarea += calcArea;
		return calcArea;
	}
	// 둘레구하기
	int length() {
		int calcLength = 2*(width * height);
//		totlength += calcLength;
		return calcLength;
	}
	@Override
	public String toString() {
		return String.format("%d/%d 사각형:(%d,%d) 면적:%d, 둘레:%d\n", loopCnt, maxLoop, width, height, area(), length());
	}
}

public class Test1 {
	public static void main(String[] args) {
		Rectangle[] rarr = new Rectangle[5];
		int totarea = 0;
		int totlength = 0;
		for(int i=0;i<rarr.length;i++) {
			int width = (int)(Math.random() * 31) + 20;
			int height =(int)(Math.random() * 31) + 20;
			rarr[i] = new Rectangle(width,height);
			totarea += rarr[i].area();
			totlength += rarr[i].length();
		}
		for(Rectangle r : rarr) {
			System.out.println(r);
		}
		System.out.println("전체 사각형 면적의 합:" + totarea);
		System.out.println("전체 사각형 둘레의 합:" + totlength);
	}
}
