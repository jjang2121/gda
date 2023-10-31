package chap4;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		/*
		1~100사이의 임의의 수를 컴퓨터가 저장함
		사용자는 숫자를 입력받아서 저장된 숫자를 맞추기
		시스템 : 37가정
		[결과]
		1~100 사이의 숫자 입력 : 50
		작은수 입니다.
		1~100사이의 숫자 입력 : 25
		큰수 입니다.
		1~100사이의 숫자 입력 : 35
		큰수 입니다.
		1~100사이의 숫자 입력 : 37
		정답입니다.
		*/
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.print("1~100사이 숫자를 입력 : ");
			Scanner scan = new Scanner(System.in);
			
			int comRandomNum = (int)(Math.random()*100) + 1;
			System.out.println("컴퓨터 수 : "+ comRandomNum);
			
			while(true) {
				int inputNum = scan.nextInt();
				if(inputNum<1 || inputNum>100)		System.out.println("1~100까지의 올바른 수를 입력하세요.");
				else if(inputNum > comRandomNum)	System.out.println("작은수 입니다.");
				else if(inputNum < comRandomNum)	System.out.println("큰수 입니다.");
				else {
					System.out.println("정답입니다.");
					break;
				}
			}
			
		} catch (Exception ex) {
			System.out.println("올바른 숫자를 다시 입력하세요.");
		}
	}
	

}
