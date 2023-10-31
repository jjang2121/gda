package chap4;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		1~100까지 중 2의 배수도 아니고 3의 배수도 아닌 수의 합을 구하기
		 */
		
		int sum = 0;
		for(int i = 1; i<=100;i++) {
			if(i%2==0 || i%3==0) continue;
			sum += i;
			
//			if(i%2 != 0 && i%3 != 0) {
//				sum += i;
//			}
		}
		System.out.println(sum);
		
	}

}
