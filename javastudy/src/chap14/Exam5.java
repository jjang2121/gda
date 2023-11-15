package chap14;

import java.io.File;

/*
c:/windows 폴더의 하위 폴더 갯수와 파일의 갯수, 파일의 총크기 출력하기
*/
public class Exam5 {
	public static void main(String[] args) {
		File f1 = new File("c:/windows/");
		int folderCnt = 0, fileCnt = 0;
		long totSize = 0;
		for(String f : f1.list()) {
			//System.out.println(f);
			//File f2 = new File(f1, f);
			File f2 = new File(f1, f);
			if(f2.isDirectory()) {
				System.out.printf("%s : 디렉토리\n", f2.getAbsolutePath());
				folderCnt++;
			}else {
				System.out.printf("%s 파일, %,dbyte\n", f2.getName(), f2.length());
				fileCnt++;
				totSize += f2.length();
			}
		}
		
		//System.out.println("폴더의 갯수 : "+folderCnt+", 파일의 갯수 : "+fileCnt+", 파일 총크기 : "+totSize);
		System.out.printf("폴더의 갯수 : %,d, 파일의 갯수 : %,d, 파일 총크기 : %,dbyte\n", folderCnt, fileCnt, totSize);
	}
}
