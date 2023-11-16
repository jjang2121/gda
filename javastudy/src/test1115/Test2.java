package test1115;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
   src/chap14 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을
   InputStream예제.txt  파일 하나에 저장 하기
   InputStream 관련 모든 소스 : XXXInputStreamXXX.java
   
   InputStream예제.txt 파일 참조
*/
public class Test2 {
	public static void main(String[] args) throws IOException {
		String orgPath = "src/chap14/"; // 상대경로 : 현재 기준폴더(프로젝트폴더) 이후
		String copyPath = "src/test1115/";
		String saveFileName = "InputStream예제.txt";

		File sf = new File(copyPath + saveFileName);
		if (!sf.exists())
			sf.createNewFile();

		FileReader fr;
		FileWriter fw = new FileWriter(copyPath + saveFileName);
		File f1 = new File(orgPath);
		for (String f : f1.list()) {
			File f2 = new File(f1, f);

			// System.out.println(f2.getName() +"/"+ f2.isFile());
			if (f2.isFile() && f2.getName().indexOf("InputStream") >= 0
					&& f2.getName().substring(f2.getName().lastIndexOf('.'), f2.getName().length()).equals(".java")) {

				fr = new FileReader(orgPath + f2.getName());

				fw.append("========== " + f2.getName() + " ==========\n");
				char[] buf = new char[8096];
				int len = 0;
				while ((len = fr.read(buf)) != -1) {
					fw.write(buf, 0, len);
				}
				fw.append("\n\n");
				fr.close();
			}
		}
		fw.flush();
		fw.close();
		System.out.println("작업완료");
	}
}
