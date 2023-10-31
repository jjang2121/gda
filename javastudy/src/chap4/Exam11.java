package chap4;

import java.util.Scanner;

public class Exam11 {

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
		
		입력횟수가 5번 이하면 빨리 맞췄습니다.
		10번 이하인 경우 보통입니다.
		11번 이상인 경우 노력하세요.
		*/
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.print("1~100사이 숫자를 입력 : ");
			Scanner scan = new Scanner(System.in);
			
			int comRandomNum = (int)(Math.random()*100) + 1;
			System.out.println("컴퓨터 수 : "+ comRandomNum);
			
			int loopNum = 1;
			
			while(true) {
				int inputNum = scan.nextInt();
				if(inputNum<1 || inputNum>100)		System.out.println("1~100까지의 올바른 수를 입력하세요.");
				else if(inputNum > comRandomNum)	System.out.println("작은수 입니다.");
				else if(inputNum < comRandomNum)	System.out.println("큰수 입니다.");
				else {
					System.out.println("정답입니다.");
					System.out.print("시도횟수 : "+loopNum+", ");
					if(loopNum <= 5)		System.out.println("빨리 맞췄습니다.");
					else if(loopNum <= 10)	System.out.println("보통입니다.");
					else					System.out.println("노력하세요");
					break;
				}
				loopNum++;
			}
			inputStr();
			
		} catch (Exception ex) {
			System.out.println("오류가 발생하였습니다.\n다시 시작합니다.\n");
			inputStr();
		}
	}
	

}
