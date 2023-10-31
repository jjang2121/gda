package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 1. 배열의 선언, 참조변수 : 객체를 참조할 수 있는 변수
		int[] arr;
		// 2. 배열의 객체생성
		final int maxArr = 5;
		arr = new int[maxArr];

		/*
		 * new 예약어
		 * 1. 객체의 생성, int값 5개 저장할 수 있는 변수를 할당. length 상수값 설정
		 * 2. 기본값 초기화
		 * 		숫자형 : 0;
		 * 		boolean : false;
		 * 		그외 : null
		 */

		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println("--------");

		int arr2[] = new int[3];
		arr2[0] = 100;
		arr2[1] = 200;

		System.out.println(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

		System.out.println("--------");

		arr2 = arr;
		System.out.println(arr);
		System.out.println(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

		System.out.println("-------- arr[3] = 1000 실행 후 ");
		arr[3] = 1000;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}

		System.out.println("---- 개선버전/ 인덱스(첨자) 사용 불가 ----");
		System.out.println("---- 요소의 값만 사용가능하면 index사용 시 기존 for 사용 ----");
		for (int a : arr)
			System.out.println(a);

	}

}
