package chap4;


public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1~100 짝수의 합 */
		int i = 0;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.print(i+",");
			}
		}
		System.out.println("합계:" + sum);

		sum = 0;
		for (i = 2; i <= 100; i+=2) {
			sum += i;
			System.out.print(i+",");
		}
		System.out.println("합계:" + sum);
	
		i=2;
		sum = 0;
		while(i<=100) {
			sum += i;
			System.out.print(i+",");
			i+=2;
		}
		System.out.println("합계:" + sum);

		i=2;
		sum = 0;
		do {
			sum += i;
			System.out.print(i+",");
			i+=2;
		} while(i<=100);
		System.out.println("합계:" + sum);

	}

}
