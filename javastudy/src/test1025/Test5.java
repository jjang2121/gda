package test1025;

import java.util.Scanner;

/*
점수를 입력받아
    95점 이상인 경우 A+ 90 ~ 94 : A0
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0
       그외는 F 로 출력하기.
    중첩 조건문을 이용하여 구현하기
*/
public class Test5 {
	public static void main(String[] args) {
		getScore();
	}

	public static void getScore() {
		try {
			System.out.println("점수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int ScoreStr = scan.nextInt();
			
			procScore(ScoreStr);
		}catch(Exception ex) {
			System.out.println("올바른 점수를 입력하세요.");
			getScore();
		}
	}
	
	public static void procScore(int ScoreStr) {
		switch(ScoreStr/5) {
			case 19, 20 :	System.out.println("A+입니다."); break;
			case 18 :		System.out.println("A0입니다."); break;
			case 17 :		System.out.println("B+입니다."); break;
			case 16 :		System.out.println("B0입니다."); break;
			case 15 :		System.out.println("C+입니다."); break;
			case 14 :		System.out.println("C0입니다."); break;
			case 13 :		System.out.println("D+입니다."); break;
			case 12 :		System.out.println("D0입니다."); break;
			default :		System.out.println("F입니다.");
		}
		getScore();
	}

}
