package chap5;

public class ArrayEx10 {

	public static void main(String[] args) {
		/*
		가변배열 : 다차원 배열에서만 가능함.
				첫번째 배열의 갯수는 반드시 지정해야 함.
		*/

		int arr[][] = new int[3][];	// 가변배열 선언
		arr[0] = new int[] {10, 20};
		arr[1] = new int[] {30, 40, 50};
		arr[2] = new int[] {60};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("arr[%d][%d]=%d\t", i, j, arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
