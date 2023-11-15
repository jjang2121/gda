package chap14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
화면에서 내용을 exit 문자열이 입력될 때 까지 입력받아 data.txt 파일에 저장하기
1. FileOutputStream 이용하기 => 한글은 깨지지 않도록 저장하기
*/
public class Exam1 {
	public static void main(String[] args) throws IOException {
		System.out.println("저장할 내용을 입력하세요:(종료:exit)");
		Scanner scan = new Scanner(System.in);
		String inputTxt = "";
		String allTxt = "";
		while(true) {
			inputTxt = scan.next();
			if(inputTxt.equalsIgnoreCase("exit")) break;
			allTxt += inputTxt + "\n";
		}
		allTxt += "\n";
		FileOutputStream fos = new FileOutputStream("src/chap14/data.txt", true);
		byte[] buf = allTxt.getBytes();
		fos.write(buf);
		//fos.write(buf,0,buf.length);
		fos.flush();
	}
}
