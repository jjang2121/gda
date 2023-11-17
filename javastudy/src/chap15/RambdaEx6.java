package chap15;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
Int BinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용한 예제
*/
public class RambdaEx6 {
	
	private static int[] arr = new int [10];
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1; // 1~100사이의 임의의 수
			System.out.println(arr[i]+",");
		}
		System.out.println();
		System.out.println("홀수 중 최대값:" + maxOrMin((a,b)->(a>=b)?a:b, a->a%2!=0));
		System.out.println("짝수 중 최대값:" + maxOrMin((a,b)->(a>=b)?a:b, a->a%2==0));
		System.out.println("홀수 중 최소값:" + maxOrMin((a,b)->(a<=b)?a:b, a->a%2!=0));
		System.out.println("짝수 중 최소값:" + maxOrMin((a,b)->(a<=b)?a:b, a->a%2==0));
		System.out.println("최대값:" + maxOrMin((a,b)->(a>=b)?a:b, a->true));
		System.out.println("최소값:" + maxOrMin((a,b)->(a<=b)?a:b, a->true));
	}

	private static int maxOrMin(IntBinaryOperator op, IntPredicate p) {
		int result = 0;
		for(int a : arr) {
			if(p.test(a)) {
				if(result == 0) result = a;
				else 			result = op.applyAsInt(result,  a);
			}
		}
		return result;
	}
	
}
