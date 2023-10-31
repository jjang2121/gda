package test1025;

import java.util.Scanner;

/*
1.   ch 변수의  문자가 
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을  출력하기
     그외의 문자는 기타 문자 를 출력하세요 
[결과]
A : a
b : B
1 : 21
- :기타문자
*/
public class Test1_A {
	public static void main(String[] args) {
		char ch = '-';	
		//'0'의 코드값 : 48 - '0'
		//'1'의 코드값 : 49 - '0'
		//'2'의 코드값 : 50 - '0'
		System.out.print(ch + " : ");
		if(ch >= 'A' && ch <= 'Z') {
			 System.out.println((char)(ch+32)); //소문자
		} else if (ch >= 'a' && ch <= 'z') {
			 System.out.println((char)(ch-32)); //대문자
		} else if (ch >= '0' && ch <= '9') {
			 System.out.println((ch-'0') + 20);
		} else {
			System.out.println("기타문자");
		}
	}
}
