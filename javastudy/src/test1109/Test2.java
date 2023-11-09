package test1109;

import java.util.Random;

/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨.
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,
 */
public class Test2 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
		

	}
	
	public static String getRand(int Num1, int Num2) {
		int tmp = 0;
		if(Num1 > Num2) {
			tmp = Num1;
			Num1 = Num2;
			Num2 = tmp;
		}
		Random rdn = new Random();
		
		return  rdn.nextInt(Num1, Num2+1) + "";
	}
	
}
