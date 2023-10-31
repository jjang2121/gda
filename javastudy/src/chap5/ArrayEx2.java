package chap5;

public class ArrayEx2 {

	public static void main(String[] args) {

		/*배열의 선언, 생성, 초기화하기*/
		
		int[] arr = {11, 22, 33, 44, 55};
		
		int i = 0;
		for(int a : arr) {
			System.out.println("arr["+i+"]="+a);
			i++;
		}

		System.out.println(arr.toString());

		System.out.println();
		
		// 생성, 초기화
		arr = new int[] {100, 200, 300};
		i=0;
		for(int a : arr) {
			System.out.println("arr["+i+"]="+a);
			i++;
		}
		System.out.println(arr.toString());
		
	}

}
