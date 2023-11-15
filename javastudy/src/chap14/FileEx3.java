package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileEx3 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/chap14/data.txt");
		if(!f.exists()) {
			System.out.println(f.getName() + "파일은 존재하지 않습니다.");
			return;
		}
		FileInputStream fis = new FileInputStream(f);	//File의 내용을 읽기
		byte[] buf = new byte[8096];
		
		int len = 0;
		while((len = fis.read(buf)) != -1)
			System.out.println(new String(buf,0,len));
			
		fis.close();
		f.delete();
	}
}
