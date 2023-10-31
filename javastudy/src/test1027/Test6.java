package test1027;

import java.util.Scanner;

/*
 * 1부터 9까지의 숫자 중 중복되지 않는  숫자 3개를 선택하고, 정렬하여 출력하기.
 * 
 * 1. 1 ~ 9 저장한 배열 생성.
 * 2. 선택 숫자를 저장할 배열 선언. 3개 값
 * 3. 1 ~ 9 배열을 섞기.
 * 4. 섞인 배열에서 3개의 숫자를 선택된 배열에 저장
 * 5. 선택된 배열을 정렬하여 출력
 */
public class Test6 {
	public static void main(String[] args) {

		int[] arr = new int[9];
		int[] selArr = new int[3];
		int temp;
		
		for(int i=0;i<9;i++) {
			arr[i] = i+1;
		}
		
		//swap
		for(int i=0;i<1000;i++) {
			int randA = (int)(Math.random() * arr.length);
			int randB = (int)(Math.random() * arr.length);
			if(randA != randB) {
				temp = arr[randA];
				arr[randA] = arr[randB];
				arr[randB] = temp;
			}
		}
		// 숫자 3개 선택
		for(int i=0;i<3;i++) {
			selArr[i] = arr[i];
		}
		
		//정렬
		temp = 0;
		for(int i=0;i<selArr.length;i++) {
			System.out.print(i+" : ");
			for(int j=0;j<selArr.length-1-i;j++) {
				if(selArr[j] > selArr[j+1]) {
					temp = selArr[j];
					selArr[j] = selArr[j+1];
					selArr[j+1] = temp;
				}
			}
			for(int a : selArr) System.out.print(a + " ");
			System.out.println();
		}
		
		System.out.println();

		for(int a : selArr) System.out.print(a + " ");
		
	}
	


}
