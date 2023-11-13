package test1110;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * phoneNumArr 에서
 * 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
   q를 입력받을때 까지 계속 반복하기
   
[결과]
찾고자 하는 번호를 입력하세요(종료:q)
02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
 */
public class Test1 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"02-3456-7890","053-2456-7980",
				"088-2346-9870","013-3456-7890",
				"051-1234-5678","02-1234-7890"};

		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
		
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					break;
				}
				
				String pattern = str;
						
				for(int i=0;i<phoneNumArr.length;i++) {
					Pattern p = Pattern.compile(pattern);
					Matcher m = p.matcher(phoneNumArr[i].replace("-", ""));
					if(m.find()) {
						// System.out.println(m.group());
						System.out.println(phoneNumArr[i]);
					}
				}
			}catch(Exception ex) {
				System.out.println("오류발생 : " + ex.getMessage());
			}
		}
		
	}
}