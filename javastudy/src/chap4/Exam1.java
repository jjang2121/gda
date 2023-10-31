package chap4;

import java.util.Scanner;

/*정수를 입력받아
1.양수/음수/영 출력
2.짝수/홀수 출력
*/

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputNum();
	}
	
	public static void inputNum() {
		try {
			System.out.println("입력하세요 : ");
			
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();	
			
			procNum(num);
		}catch(Exception ex) {
			System.out.println("숫자를 입력하세요.");
			
			inputNum();
		}
	}
	
	public static void procNum(int num) {
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		
		if(Math.abs(num%2) == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("짝수입니다.");
		}
		
		inputNum();
		
	}

}
