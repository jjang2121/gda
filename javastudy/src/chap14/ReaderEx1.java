package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Reader 예시 : 문자형 입력 스트림. 2바이트 단위(1char단위)로 읽음
*/
public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		/*
		InputStream System.in
		Reader = new InputStreamReader(InputStream);
		Reader.read() : 2바이트 단위로 읽기
		*/
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		while((data=in.read()) != -1)
			System.out.print((char)data);
	}
}
