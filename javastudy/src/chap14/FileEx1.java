package chap14;

import java.io.File;

/*
File클래스 : 파일이나 폴더의 정보를 관리하는 클래스
*/
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "C:\\";
		File f1 = new File(filePath);		// C:\폴더
		String[] files = f1.list();			// f1 파일의 하위 목록 리턴
		for(String f : files) {
			// System.out.println(f);
			File f2 = new File(filePath, f);
			if(f2.isDirectory())	System.out.printf("%s:디렉토리\n", f);
			else					System.out.printf("%s:파일(%,dbyte)\n", f, f2.length());
		}
	}
}
