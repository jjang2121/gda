package chap4;

import java.util.Scanner;

/*
ch의 문자가 대문자/소문자/숫자/기타문자인지 출력하기
[결과]
A:대문자
a:소문자
1:숫자
-:기타문자
*/

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'ㅠ';
		System.out.println((int)'0');
		System.out.println((int)'9');

		System.out.print(ch+"는 ");
		if(ch >= 'A' && ch <= 'Z')			System.out.println("대문자입니다.");
		else if(ch >= 'a' && ch <= 'z')		System.out.println("소문자입니다.");
		else if(ch >= '0' && ch <= '9')		System.out.println("숫자입니다.");
		else								System.out.println("기타문자입니다.");

		int chnum = ch;

		System.out.print(ch+"는 ");
		if(chnum >= 65 && chnum <= 90)			System.out.println("대문자입니다.");
		else if(chnum >= 97 && chnum <= 122)	System.out.println("소문자입니다.");
		else if(chnum >= 48 && chnum <= 57)		System.out.println("숫자입니다.");
		else									System.out.println("기타문자입니다.");
	
	}

}
