package test1115;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 1. 반복문을 이용하여
   파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
   파일명에 exit 가 입력되면, 프로그램 종료.
   해당 파일이 없으면, 복사할 파일이 없습니다. 메세지 출력

[결과]
 파일명을 입력하세요(종료:exit)
 aaa.txt
 aaa.txt=>aaa.bak 복사완료
 파일명을 입력하세요(종료:exit)
 bbb.txt
 복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		String fileName="", path = "src/test1115/";

		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("파일명을 입력하세요(종료:exit)");
			fileName = br.readLine();
			if(fileName.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			File f1 = new File(path+fileName);
			File f2 = new File(path+fileName.replace(".txt", ".bak"));
			if(!f1.exists())	{
				System.out.println("복사할 파일이 없습니다.");
				continue;
			}
			
			FileInputStream fis = new FileInputStream(f1);
			FileOutputStream fos = new FileOutputStream(f2);
			byte[] buf = new byte[fis.available()];
			int data = 0;
			while((data = fis.read(buf)) != -1) {
				fos.write(buf, 0, data);
			}
			System.out.printf("%s=>%s 복사완료\n", f1.getName(), f2.getName());
			
			br.close();
			fis.close();
			fos.close();
		}
		
	}
}