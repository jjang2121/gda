package test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 삼각형의 길이를 홀수로 입력하세요
 * 5
  *****
   ***
    *
   ***
  *****
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		int len = scan.nextInt();
		char[][] triangle = new char[len][len];
		
		//역이등변삼각형
		for (int i = 0; i <= len / 2; i++) {
			for (int j = 0; j < len - i; j++) {
				if (j >= i)
					// System.out.print("*");
					triangle[i][j] = '*';
				//else
					//System.out.print(" ");
					//triangle[i][j] = ' ';
				
			}
			//System.out.println();
		}
		for (int i = len / 2 + 1; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (j >= len - i - 1)
					// rectangle[i][j] = '*';
					triangle[i][j] = '*';
				//else
					// System.out.print(" ");
					//triangle[i][j] = ' ';
			}
			//System.out.println();
		}
		
		
		for(char[] a : triangle) {
			for(char b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}