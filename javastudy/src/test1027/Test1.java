package test1027;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1 {
	public static void main(String[] args) {
		inputStr();
	}

	public static void inputStr() {
		try {
			System.out.println("대칭수(홀수개)를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			String num = (String)scan.next();

			procCheck(num);
		} catch (Exception ex) {
			System.out.println("숫자(홀수개)만 입력하세요.");
			inputStr();
		}
	}
	
	public static void procCheck(String num) {
		
		try {
			int strLen = num.length();
			// System.out.println(strLen%2);
			if(strLen%2 == 0) {
				System.out.println("홀수개로 입력하세요.");
				inputStr();
				return;
			}

			char[] str = num.toCharArray();
			
			// System.out.println("프로그램 진입");
			int k=0;
			boolean flag = true;
			for(int i=0;i<strLen/2;i++) {
				if(str[i] != str[strLen-1-k]) {
					flag = false;
					break;
				}
				k++;
			}
			
			// for(int a : str) System.out.print(a-'0');
			System.out.print(num + " : ");
			if(flag)	System.out.println("대칭수");
			else		System.out.println("대칭수 아님");
			System.out.println();
			
			inputStr();

		}catch(Exception ex) {
			System.out.println(ex.getMessage()+"\n숫자(홀수개)만 입력하세요.");
			inputStr();
		}
		
	}
	
	
}
