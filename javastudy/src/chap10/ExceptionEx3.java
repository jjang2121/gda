package chap10;

import java.util.Scanner;

/*
finally 구문 : try 블럭에서 정상처리/예외발생 모두 실행되는 블럭

정상 : 12356
2/0예외 : 1456
2/0예외 return 처리 후 : 145
*/

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(3);
			// return;	// 31라인 오류발생
		} catch (Exception ex) {
			// ex.printStackTrace();
//			System.out.println("오류가 발생 하였습니다(" + ex.getMessage() + ").");
//			return;
			System.out.println(4);
			return;	// 메서드 종료
		}finally {
//			System.out.println("finally 영역");
			System.out.println(5);
		}
		System.out.println(6);

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
