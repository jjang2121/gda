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
 */
public class Test3_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int sum = 0;
		for(int i=1;i<=num;i+=2) sum += i; //5+3+1 = 9
		int data = sum * 2 - 1;  //9 * 2 - 1 : 시작 숫자
		//위쪽 역삼각형 부분 데이터 저장
		for(int i=0;i<= matrix.length/2;i++) {
			for(int j=i;j<matrix.length-i;j++) {
				matrix[i][j] = data--;
			}
		}
		//아래쪽 삼각형 부분 데이터 저장
		for(int i=matrix.length/2+1;i< matrix.length;i++) {
			for(int j=matrix.length - i - 1;j<=i;j++) {
				matrix[i][j] = data--;
			}
		}		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j] == 0)
					System.out.printf("%4c",' ');
				else
				    System.out.printf("%4d",matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		//개선된 for 구문으로 출력하기
		for(int[] arr : matrix) {
			for(int a : arr) {
				if(a == 0)
					System.out.printf("%4c",' ');
				else
					System.out.printf("%4d",a);
			}
			System.out.println();
		}

	}
}
