package test1030;

import java.util.Scanner;

/*
배열의 크기를 홀수로 입력하세요
5
17	16	15	14	13
 	12	11	10
 	 	9
 	8	7	6
5	4	3	2	1
25-8

for()
 */
public class Test3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		int len = scan.nextInt();
		char[][] rectangle = new char[len][len];
		
		//역이등변삼각형
		for (int i = 0; i <= len / 2; i++) {
			for (int j = 0; j < len - i; j++) {
				if (j < i)
					//System.out.print(" ");
					rectangle[i][j] = ' ';
				else
					// System.out.print("*");
					rectangle[i][j] = '*';
				
			}
			//System.out.println();
		}
		for (int i = len / 2 + 1; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (j >= len - i - 1)
					// rectangle[i][j] = '*';
					rectangle[i][j] = '*';
				else
					// System.out.print(" ");
					rectangle[i][j] = ' ';
			}
			//System.out.println();
		}
		
		
		for(char[] a : rectangle) {
			for(char b : a) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}

}