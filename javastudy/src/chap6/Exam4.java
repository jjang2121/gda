package chap6;
/*
Rectangle3.java 소스의 Rectangle3 클래스를 이용하여 구동클래스 구현하기
가로, 세로길이가 20~50사이인 임의의 길이를 가진 사각형 5개를 생성하기
각각의 넓이, 둘레, 정보 출력하기
5개 사격형의 넓이의 합과, 둘레의 합을 출력하기
*/

public class Exam4 {

	public static void main(String[] args) {

		// arr : Rectangle3 객체를 참조할 참조변수 5개를 배열로 저장함.
		Rectangle3[] arr = new Rectangle3[5];
		int areaSum = 0;
		int lengthSum = 0;
		int i=0;
		int productRecCnt = 5;
		
		for (i = 0; i < productRecCnt; i++) {
			int rWidth = 20 + (int) (Math.random() * 30);
			int rHeight = 20 + (int) (Math.random() * 30);

			arr[i] = new Rectangle3();
			arr[i].width = rWidth;
			arr[i].height = rHeight;
			arr[i].sno = ++Rectangle3.cnt;
			areaSum += arr[i].area();
			lengthSum += arr[i].length();
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.printf("%d개의 사각형 넓이의 합:%d, 둘레의 합:%d", productRecCnt, areaSum, lengthSum);
		System.out.println();
		
		/*
		for (Rectangle3 a : arr) {
			System.out.println(a);
		}
		*/

	}
}
