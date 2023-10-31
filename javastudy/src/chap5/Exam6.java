package chap5;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		/*
		삼각형의 높이를 입력하세요.
		5
		
		15	14	13	12	11
			10	9	8	7
				6	5	4
					3	2
						1
		*/

		inputStr();
	}
	
	public static void inputStr() {
		try {
			System.out.print("삼각형의 높이를 입력하세요. : ");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			procPic(num);
		}catch(Exception ex) {
			System.out.println("올바른 숫자를 입력하세요.");
			inputStr();
		}
	}
	
	public static void procPic(int num) {
		int lastNum = 0;
		for(int i=1;i<=num;i++) {
			lastNum += i;
		}

		int data = lastNum;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i>j) {
					System.out.printf("%3c", ' ');
				}else if (i <= j) {
					System.out.printf("%3d", data--);
				}
			}
			System.out.println();
		}
	
	}

}
