package chap14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
apple.gif 을 apple2.gif파일로 복사하기
*/
public class Exam6 {
	public static void main(String[] args) throws IOException {
		String pathUrl = "src/chap14/";
		FileInputStream fis = new FileInputStream(pathUrl + "apple.gif");
		FileOutputStream fos = new FileOutputStream(pathUrl + "apple2.gif");
		byte[] buf = new byte[fis.available()];
		int data = 0;
		
				while((data = fis.read(buf)) != -1)
					fos.write(buf, 0, data);
		// 1byte씩 처리는 시간이 오래걸림
//		while((data = fis.read(buf)) != -1)
//			fos.write(data);
		
		/*
		String pathUrl = "src/chap14/";
		FileReader fr = new FileReader(pathUrl + "apple.gif");
		FileWriter fw = new FileWriter(pathUrl + "apple2.gif");
		char[] buf = new char[8096];
		
		int data = 0;
		//		while((data = fr.read()) != -1)
		//			fw.write(data);
		while((data = fr.read(buf)) != -1)
			fw.write(buf, 0, data);
		*/
		/*
		파일명만 변경
		File f1 = new File(pathUrl + "apple2.gif");
		File f2 = new File(pathUrl + "apple2.gif");
		
		if(!f1.exists()) {
			System.out.println("원본파일 없음");
			return;
		}
		if(f1.renameTo(f2))
			System.out.printf("%s에서 %s로 파일명 변경", f1.getName(), f2.getName());
		else
			System.out.printf("%s에서 %s로 파일명 변경 실패", f1.getName(), f2.getName());
		*/
	}
}
