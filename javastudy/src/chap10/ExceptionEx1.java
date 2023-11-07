package chap10;

import java.util.Scanner;

/*
예외처리 : 발생된 예외를 정상화 하는 기능
	try	:	예외 발생 가능성이 있는 문장들의 모임
			예외 발생 시 catch 블럭을 실행
	catch : try 블럭에서 예외 발생 시 실행되는 영역
			반드시 try  구문과 함께 사용해야 함.
*/

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			try {
				//String a = args[0];
				System.out.println(1/0);	// ArithmeticException 예외발생
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("오류발생 : "+ex.getMessage());
				System.out.println("파라미터 값이 없습니다.");
				return;
			}
		} catch (ArithmeticException ex) {
			System.out.println("오류발생 : "+ex.getMessage());
			System.out.println("나누기 오류 발생.");
			return;
		}
		
		inputStr();
		inputStr1();
	}
	
	public static void inputStr() throws NumberFormatException {
		try {
			System.out.println("숫자만 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
		} catch(Exception ex) {
			System.out.println("오류내용 : " + ex.getMessage());
			inputStr();
		}
	}
	public static void inputStr1() throws NumberFormatException {
			System.out.println("숫자만 입력하세요1.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
	}

}
