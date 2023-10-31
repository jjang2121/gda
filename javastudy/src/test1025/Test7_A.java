package test1025;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기
 [결과]
 삼각형의 높이 : 3
     
        i    j                  b
    *   0    2   2-0 ~ 2+0    1  : (0+1) * 2 -1 = 1
   ***  1   123  2-1 ~ 2+1    3  : (1+1) * 2 -1 = 3
  ***** 2  01234 2-2 ~ 2+2    5  : (2+1) * 2 -1 = 5
       * 의 위치  : (중간값 - i) ~ (중간값 + i) 
 
 */
public class Test7_A {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이 :");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = h*2-1; // 바닥의 *의 갯수
		int m = b/2;   // 중간값 
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
		}

	}
}
