package chap10;

import java.util.Scanner;

/*
다중catch 구문
	- 한개의 try 블럭에 여러개의 catch 블럭이 존재
		=> try 블럭에서 발생 가능한 예외 종류에 따라 다른 예외처리 가능
	- 상위에 있는 예외클래스(Exception)은 catch 구문 하단에 배치해야 함.

Throwable > Exception > RuntimeException > ArithmeticException
										 > NumberFormatException
										 > ....
					  > IOException
					  > SQLException
					  > .....

자바에서는 예외처리가 필수. 단 RuntimeException은 예외처리 생략 가능
					RuntimeException클래스의 하위 클래스도 RuntimeException 임
Exception 계층 순서에 따라 배치를 해야 함.
*/

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			// System.out.println(args[0]); 			// ArrayIndexOutOfBoundsException 예외 발생
			// System.out.println(3/0); 				// ArithmeticException 예외 발생
			// System.out.println(Integer.parseInt("a"));	// NumberFormatException 예외 발생
			String a = null;
			System.out.println(a.trim());

			// System.out.println(null);
			
			System.out.println(4);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누지 마세요(" + ex.getMessage() + ").");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("command 라인에 파라미터를 입력하세요(" + ex.getMessage() + ").");
			return;
		} catch (NumberFormatException ex) {
			System.out.println("숫자만 입력하세요(" + ex.getMessage() + ").");
			return;
		} catch (RuntimeException ex) {
			System.out.println("Runtime오류가 발생 하였습니다(" + ex.getMessage() + ").");
			return;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("오류가 발생 하였습니다(" + ex.getMessage() + ").");
			return;
		}

//		inputStr();
//		inputStr1();
	}

	public static void inputStr() throws NumberFormatException {
		try {
			System.out.println("숫자만 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
		} catch (Exception ex) {
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
