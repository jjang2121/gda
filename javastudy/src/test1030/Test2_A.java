package test1030;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 삼각형의 길이를 홀수로 입력하세요
 * 5       i     j      =>  j = i ~  (4-i)
  *****    0    0 1 2 3 4  
   ***     1    1 2 3
    *      2    2
   ***     3    1 2 3 
  *****    4    0 1 2 3 4 
 */
public class Test2_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		//위쪽 역삼각형부분의 * 채우기
		for(int i=0;i<= matrix.length/2;i++) {
			for(int j=i;j<matrix.length-i;j++) {
				matrix[i][j] = '*';
			}
		}
		//아래쪽 삼각형 부분의 * 채우기
		for(int i=matrix.length/2+1;i< matrix.length;i++) {
			for(int j=matrix.length - i - 1;j<=i;j++) {
				matrix[i][j] = '*';
			}
		}
		//모래시계 출력하기
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		//개선된 for 구문으로 출력하기
		for(char[] arr : matrix) {
			for(char a : arr) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
