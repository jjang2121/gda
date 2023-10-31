package chap5;

public class ArrayEx7 {


	public static void main(String[] args) {
		/*
		arr 배열의 모든 숫자 자리수의 합을 출력하기
		*/
		String[] arr = {"123", "333", "234", "135"};
	
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length();j++) {
				sum += arr[i].charAt(j)-'0';
			}
		}
		System.out.println(sum);
		
	}

}
