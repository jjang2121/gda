package test1027;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test1_A {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //121
		int tmp = num; 
		int result = 0; //0
		while(tmp != 0) { //0   
			result *=10; //121  
			result += tmp %10;   
			tmp /= 10; //0
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		String snum = ""+num; //문자열 형태로 변경 123
        String rsnum="";
        for(int i=snum.length()-1;i>=0;i--) {
        	rsnum += snum.charAt(i);
        }
        if(snum.equals(rsnum)) //snum == rsnum 방식 안됨.
			System.out.println(num + ": 대칭수");
		else
			System.out.println(num + ": 대칭수 아님");
	}
}
