package chap14;

import java.io.FileReader;
import java.io.IOException;

/*
FileReader 클래스 : 파일에서 데이터를 2바이트 단위 읽기 스트림
- 주요메서드
int read() : 파일에서 1char(2byte) 읽어서 리턴
int read(char[] buf) : 파일에서 buf의 크기만큼 일어서 buf에 내용 저장. 실제 읽은 바이트 수 리턴
int read(char[] buf, int start, int len) : 파일에서 len만큼 읽어서 buf의 start인덱스부터 내용 저장. 실제 읽은 바이트 수 리턴

*/
public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("src/chap14/InputStreamEx1.java");
		int data = 0;
		System.out.println("========== int read() 메서드를 이용하여 읽기");
		while((data = fr.read()) != -1)
			System.out.print((char)data);
		System.out.println();
		
	
		System.out.println("========== int read(char[] buf) 메서드를 이용하여 읽기");
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		char[] buf = new char[8096];
		while((data=fr.read(buf)) != -1)
			System.out.println(new String(buf, 0, data));
		System.out.println();

		
		System.out.println("========== int read(char[] buf, int start, int len) 메서드를 이용하여 읽기");
		fr = new FileReader("src/chap14/InputStreamEx1.java");
		while((data=fr.read(buf, 0, buf.length)) != -1)
			System.out.print(new String(buf, 0 , data));
		System.out.println();
	}
}
