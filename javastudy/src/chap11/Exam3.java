package chap11;

/*
문자열 1,20,30,40,50 의 숫자 합을 출력하기
*/


public class Exam3 {

	public static void main(String[] args) {
		String str = "1, 20, 30, 40, 50";
		String[] strArr = str.split(",");
		// String[] strArr = {"1","20","30","40","50"};
		int sum = 0;
		for(String arr : strArr)	sum += Integer.parseInt(arr.trim());
		System.out.printf("%s 문자열의 합은 : %d\n",str, sum);
	}

}
