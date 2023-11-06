package test1106;
/*
 * LambdaInterface3 인터페이스를 이용하여 결과가 나오도록
 * LambdaInterface3 인터페이스를 람다식을 이용하여 함수 객체를 구현하고,
 * calc 함수를 구현하기.
 */

@FunctionalInterface
interface LambdaInterface3 {
	int method(int x, int y);
}

public class Test4 {
	public static void main(String[] args) {
		LambdaInterface3 f;
		//두수의 합
		f = (x, y) -> x + y;
		System.out.println("두수 (5,2)의 합:" + calc(5,2,f));//7

		//두수의 곱
		f = (x, y) -> x * y;
		System.out.println("두수 (5,2)의 곱:" + calc(5,2,f));//10

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//배열 최대값
		f = (x, y) -> {
			int maxNum = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] > maxNum) {
					maxNum = arr[i];
				}
			}
			return maxNum;
		};
		System.out.println("arr 배열의 최대값:" + calc(arr,f));//10

		//배열 최소값
		f = (x, y) -> {
			int minNum = 0;
			for(int i=0;i<arr.length;i++) {
				if(i==0) {
					minNum = arr[i];
				} else if(arr[i] < minNum) {
					minNum = arr[i];
				}
			}
			return minNum;
		};
		System.out.println("arr 배열의 최소값:" + calc(arr,f));//1
	}
	
	public static int calc(int x, int y, LambdaInterface3 f) {
		return f.method(x, y);
	}
	public static int calc(int[] arr, LambdaInterface3 f) {
		return f.method(0, 0);
	}
}
