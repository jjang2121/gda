package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. 화면에서 1~10 사이의 숫자를 입력받아서 숫자만큼 * 출력하기
	1~10 사이의 숫자가 아닌 경우 예외 강ㅇ제 발생시키고, 다시 숫자를 입력받기
2. 입력값이 숫자가 아닌경우 InputMismatchException 에외가 발생함.
*/

class NumcheckException extends Exception {
	NumcheckException(String msg){
		super(msg);
	}
}

public class Exam1 {
	public static void main(String[] args) {
		inputStr();
		
		
		/*
		//한줄처리
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.println("1~10사이의 숫자만 입력하세요.");
				num = scan.nextInt();	// 정수가 아닌 값을 입력하면 InputMismatchException 예외 발생
				
				if(num < 1 || num > 10)
					throw new NumcheckException("1~10사이의 숫자가 아닙니다.");
				break;
			}catch(InputMismatchException ex){
				System.out.println("정수만 가능합니다.");
				scan.next();	// 해당 라인 없으면 무한루프 처리됨.
				continue;
			}catch(NumcheckException ex){
				ErrMsg.exMsg(ex, false);
				continue;
			}
		}
		
		System.out.println("*".repeat(num));
		*/
	}
	
	public static void inputStr() {
		try {
			System.out.println("1~10사이의 숫자만 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if(num < 1 || num > 10) {
				throw new NumcheckException("1~10사이의 숫자가 아닙니다.");
			}
			
			printStar(num);
		}catch(InputMismatchException ex){
			ErrMsg.exMsg(ex, false, "정수만 입력하세요.");
			inputStr();
			return;
		}catch(NumcheckException ex){
			ErrMsg.exMsg(ex, false);
			inputStr();
			return;
		}

	}

	public static void printStar(int num) {
		System.out.println("*".repeat(num));
		System.out.println();
		inputStr();
	}
	
}
