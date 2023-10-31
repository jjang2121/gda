package chap4;

import java.util.Scanner;

/*
임의로 1,2,3 선택하여 가위바위보중 한개를 출력하기
1:가위, 2:바위, 3:보
*/

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*나의 가위바위보*/
		/*
		System.out.println("가위바위보를 입력하세요.");
		System.out.println("가위:1, 바위:2, 보:3 입력");
		Scanner scan = new Scanner(System.in);
		int mycrp = scan.nextInt();
		*/

		int comcrp = (int)(Math.random() * 3) + 1;

		switch (comcrp) {
		case 1: 	System.out.println("가위"); break;
		case 2: 	System.out.println("바위"); break;
		default:	System.out.println("보"); break;
		}
	}

}
