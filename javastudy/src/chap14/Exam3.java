package chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
InputStreamEx1.java 소스를 읽어서, InputStreamEx1.bak 파일로 복사하기
FileInputStream, FileOutputStream을 이용하고, 한글 깨지지 않도록 한다.
*/
public class Exam3 {
	public static void main(String[] args) throws IOException {
		String fileOrg = "src/chap14/InputStreamEx1.java";
		String fileBak = "src/chap14/InputStreamEx1.bak";
		FileInputStream fis = new FileInputStream(fileOrg);
		FileOutputStream fos = new FileOutputStream(fileBak);
		byte[] buf = new byte[fis.available()];
		int data = 0;
		while((data=fis.read(buf)) != -1) {
			// System.out.println(new String(buf));
			fos.write(buf, 0, data);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		System.out.println("백업파일 생성완료");
	}
}
