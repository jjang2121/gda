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
public class Test1 {
	public static void main(String[] args) {
		inputStr();
	}
 
	public static void inputStr() {
		try {
			System.out.println("한문자를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			char ch = scan.next().charAt(0);
			
			
//			System.out.println((int)'A');
//			System.out.println((int)'Z');
//			System.out.println((int)'a');
//			System.out.println((int)'z');
//			System.out.println((int)'0');
//			System.out.println((int)'9');
//			System.out.println((int)ch);

			getResult(ch);
		}catch(Exception ex) {
			System.out.println("한글자만 입력하세요.");
			inputStr();
		}
	}
	
	public static void getResult(int num) {
		if(num >= 65 && num <= 90) {	// 대문자를 소문자로
			System.out.println((char)(num+32));
		}else if(num >= 97 && num <= 122) {	// 소문자를 대문자로
			System.out.println((char)(num-32));
		}else if(num >= 48 && num <= 57) {	// 숫자인 경우 +20
			System.out.println(num - '0' + 20);
		}else {	// 그 외 가타문자
			System.out.println("기타문자");
		}
		
		inputStr();
	}
	
	
}
