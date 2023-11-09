package chap11;

import java.util.Arrays;
import java.util.Comparator;

/*
Array 클래스 : 배열의 복사, 비교, 정렬기능을 가진 클래스

*/
public class ArrayEx1 {

	public static void main(String[] args) {
		String[] arr1 = {"홍길동","이몽룡","김삿갓"};
		for(String a : arr1)	System.out.println(a + ",");
		System.out.println();
		//arr1의 배열의 값을 김길동으로 채우기
		Arrays.fill(arr1, "김길동");
		for(String a : arr1)	System.out.println(a + ",");
		System.out.println();
		//arr1의 0,1 인덱스 가값을 홍길동전으로 채우기
		Arrays.fill(arr1, 0, 2, "홍길동전");
		for(String a : arr1)	System.out.println(a + ",");
		System.out.println();
		//arr1 배열 정렬하기
		Arrays.sort(arr1);
		for(String a : arr1)	System.out.println(a + ",");
		System.out.println();
		//arr1 배열 내림차순 정렬하기
		Arrays.sort(arr1, Comparator.reverseOrder());
		for(String a : arr1)	System.out.println(a + ",");
		System.out.println();
		
		//arr1 => arr2 배열 복사
		String[] arr2 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr2.length);
		for(String a2 : arr2)	System.out.println(a2 + ",");
		System.out.println();

		//arr1 => arr3 배열 복사
		String[] arr3 = Arrays.copyOf(arr1, arr1.length);
		for(String a3 : arr3)	System.out.println(a3 + ",");
		System.out.println();

		// arr1, arr2, arr3 배열을 출력하기
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
