package chap4;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		삼각형 높이를 입력하세요.
		5
		15	14	13	12	11
			10	 9	 8 	 7
				 6	 5	 4
				 	 3	 2
				 	 	 1
		*/
		
		inputStr();
	}
	
	public static void inputStr() {
		try {
			System.out.print("삼각형의 높이 : ");
			Scanner scan = new Scanner(System.in);
			int str = scan.nextInt();
			procNum(str);
		}catch (Exception ex) {
			System.out.println("올바른 숫자를 다시 입력하세요.");
			inputStr();
		}
	}
	
	public static void procNum(int num) {
		int result = 0;
		for(int i=0;i<=num;i++)	result+=i;
		
		// System.out.println(sum);
		
		for(int i=1; i<=num; i++) {
			for(int j=1;j<=num;j++) {
				if(i<=j)	System.out.print(result-- +"\t"); // result--;
				else		System.out.print("\t");
			}
			System.out.println();
		}		
		inputStr();
	}

}
