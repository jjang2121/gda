package test1027;

/*
  1부터 100까지 임의의 수 10개를  배열에 저장하고, 정렬하여 출력하기
    1. 배열 선언, 생성.
    2. 임의의 수를 10개 배열에 저장
    3. 정렬
    4. 출력
 */
public class Test4 {
	public static void main(String[] args) {

		int[] str = new int[10];

		for (int i = 0; i < str.length; i++) {
			str[i] = (int) (Math.random() * 100) + 1;
		}

		int temp = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length -1 - i; j++) {
				if (str[j] > str[j + 1]) {
					temp 		= str[j + 1];
					str[j + 1]	= str[j];
					str[j]		= temp;
				}
			}
			System.out.print(i + " : ");
			for (int a : str)
				System.out.print(a + ",");
			
			System.out.println();
		}
	}
}
