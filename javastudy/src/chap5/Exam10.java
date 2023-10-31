package chap5;

public class Exam10 {

	public static void main(String[] args) {
		/*
		2차원 배열의 값을 입력받아 다음과 같은 내용을 출력하기
		배열의 갯수를 입력하세요
		5

		1
		2	3
		4	5	6
		7	8	9	10
		11	12	13	14	15
		*/
		
		int height = 5;
		int[][] num = new int[height][];
		
		int sum = 0;
		
		for(int i=0;i<height;i++)	//1차원 배열 객체생성
			num[i] = new int[i+1];

		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j] = ++sum;
			}
		}
		
		for(int[] arr : num) {
			for(int arr1 : arr) {
				System.out.print(arr1+"\t");
			}
			System.out.println();
		}
	}
	

}
