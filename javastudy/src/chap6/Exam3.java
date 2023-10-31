package chap6;
/*
Exam2.java 소스의 Rectangle2 클래스를 이용하여 구동클래스 구현하기
가로, 세로길이가 20~50사이인 임의의 길이를 가진 사각형 5개를 생성하고
각각의 넓이, 둘레, 정보 출력하기
*/

public class Exam3 {

	public static void main(String[] args) {

		// arr : Rectangle2 객체를 참조할 참조변수 5개를 배열로 저장함.
		Rectangle2[] arr = new Rectangle2[5];

		for (int i = 0; i < 5; i++) {
			int rWidth = 20 + (int) (Math.random() * 30);
			int rHeight = 20 + (int) (Math.random() * 30);

			arr[i] = new Rectangle2();
			arr[i].width = rWidth;
			arr[i].height = rHeight;
			arr[i].sno = ++Rectangle2.cnt;
			arr[i].area();
			arr[i].length();
			System.out.println(arr[i]);
			System.out.println();
		}

		for (Rectangle2 a : arr) {
			System.out.println(a);
		}

	}
}
