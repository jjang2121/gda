package chap4;

public class Exam12 {

	public static void main(String[] args) {
		/*
		1부터의 합이 1000이 넘는 순간의 값을 출력하기
		*/
		int i = 0;
		int sum = 0;

		while (sum < 1000) {
			i++;
			sum += i;
		}
		System.out.println("횟수:" + i + ", 총합:" + sum);
	}

}
