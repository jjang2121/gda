package chap4;

public class Exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		1~100까지 중 2의 배수도 아니고 3의 배수도 아닌 수의 합을 구하기
		 */
		
		for(int i = 2; i<=9;i++) {
			System.out.print(i+"단\t");
		}
		System.out.println();
		for(int i = 2; i<=9;i++) {
			for(int j = 2; j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i +"\t");
			}
			System.out.println();
		}
		
	}

}
