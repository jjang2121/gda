package test1027;

import java.util.Scanner;

/*
1.  다음은 주어진 문자열(value)이 숫자인지를 판별하는  프로그램을 작성하시오.
  String 함수 charAt(i), length() 을 사용함.
  Scanner NextLine 또는 Next 이용
  [결과]
숫자만 입력하세요
123
123는 숫자 입니다.
  
  [결과]
숫자만 입력하세요
123@12
123@12는 숫자가 아닙니다.
 */
public class Test2 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("숫자만 입력하세요.");
			Scanner scan = new Scanner(System.in);
			String num = (String)scan.next();

			procCheck(num);
		} catch (Exception ex) {
			System.out.println("숫자만 입력하세요.");
			inputStr();
		}
	}
	
	public static void procCheck(String num) {
		int numLen = num.length();
		boolean flag = true;
		
		for(int i=0;i<numLen;i++) {
			if(num.charAt(i) < '0' || num.charAt(i) > '9') {
				flag = false;
				break;
			}
		}
		
		System.out.print(num+"는 ");
		if(flag)	System.out.print("숫자입니다.");
		else		System.out.print("숫자가 아닙니다");
		System.out.println();
		
		inputStr();
	}

}
