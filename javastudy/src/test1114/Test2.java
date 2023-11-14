package test1114;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 * 
 * [결과]
화면에 파일명을 입력하세요(종료:exit)
src/chap14/InputStreaEx1.java
해당 파일 없음
화면에 파일명을 입력하세요(종료:exit)
src/chap14/InputStreamEx1.java
해당 파일 없음
화면에 파일명을 입력하세요(종료:exit)
src/test1114/Test1.java
package test1114;
....
.....
 */
public class Test2 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis;
		InputStreamReader rd;
		Scanner scan = new Scanner(System.in);
		System.out.println("화면에 파일명을 입력하세요(종료:exit, 경로:src/chap14/파일위치)");
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("exit")) {
					System.out.println("프로그램 종료");
					break;
				}
				String fileUrl = "./src/chap14/" + str;
				System.out.println("===== read() =====");
				fis = new FileInputStream(fileUrl);
				rd = new InputStreamReader(fis);
				int data = 0;
				while((data = rd.read()) != -1)
					System.out.print((char)data);

				System.out.println();
				System.out.println("===== read(char[] buf) =====");
				fis = new FileInputStream(fileUrl);
				rd = new InputStreamReader(fis);
				char[] buf = new char[8096];
				while((data = rd.read(buf)) != -1)
					System.out.print(new String(buf,0,data));

				System.out.println();
				System.out.println("===== read(char[] buf, int start, int length) =====");
				fis = new FileInputStream(fileUrl);
				rd = new InputStreamReader(fis);
				while((data = rd.read(buf,0,buf.length)) != -1)
					System.out.print(new String(buf,0,data));
				
				
			}catch(Exception ex) {
				System.out.println("오류발생"+ex.getMessage());
			}
		}
		
	}
}
