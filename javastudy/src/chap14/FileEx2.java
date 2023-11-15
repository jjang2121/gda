package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
File 클래스의 주요 메서드
	- getAbsolutePath()	: 절대경로
	- boolean mkdir()	: 폴더생성, 성공:true, 실패:false
	- boolean mkdirs()	: 여러단계 폴더생성, 성공:true, 실패:false
	- boolean createNewFile : 파일생성, 성공:true, 실패:false
	- boolean exists()	: 존재하는 파일(폴더) : true, 없는파일(폴더) : false
	- boolean renameTo(File) : 파일을 f파일로 이름변경
	- long lastModified	: 1970이후부터 파일 수정시간까지의 밀리초 리턴
*/
public class FileEx2 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\temp1");
		// 폴더 생성
		System.out.printf("%s 폴더 생성:%b\n", f1.getAbsolutePath(), f1.mkdir());
		File f2 = new File("c:\\temp1\\text.txt");
		System.out.printf("%s 파일 생성:%b\n", f2.getAbsolutePath(), f2.createNewFile());

		// 파일 정보
		System.out.printf("파일명:%s, 파일크기:%,dbyte\n", f2.getName(), f2.length());
		File f3 = new File("c:\\temp1\\text2.txt");
		if(f3.exists())		System.out.println(f3.getName() + "파일존재");
		else				System.out.println(f3.getName() + "파일없음");
		
		// 파일명 변경
		System.out.printf("%s->%s 이름변경:%b\n", f2.getName(), f3.getName(), f2.renameTo(f3));
		
		// 파일 변경일자 확인
		System.out.printf("%s 파일 최종 수정시간 : %s", f2.getName(), new Date(f2.lastModified()));
		
		// 파일 삭제
		System.out.printf("%s 파일 삭제:%b\n", f3.getName(), f3.delete());
		// 폴더 삭제
		System.out.printf("%s 폴더 삭제:%b\n", f1.getAbsolutePath(), f1.delete());
		
	}
}
