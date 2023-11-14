package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
FileInputStream 예제
	: 파일의 내용을 읽어서 콘솔에 출력하기
	
주요메서드
	- int read()								: 1바이트씩 읽어서 리턴
	- int read(byte[] buf)						: buf의 크기만큼 읽어서 buf에 저장. 실제읽은 바이트 수 리턴
	- int read(byte[] buf,int start, int len)	: len 크기만큼 읽어서 buf의 start 인덱스부터 buf에 저장. 실제읽은 바이트 수 리턴
	 				
*/
public class FileInputStreamEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("src/chap14/InputStreamEx1.java");
		Reader rd = new InputStreamReader(fs);	//FileInputStream만으로 한글깨짐 발생
		
		int data = 0;
		System.out.println("========== read() 메서드를 이용하여 읽기");
		//-1 : 파일의 끝, E(nd) O(f) F(ile)
		//while((data = fs.read()) != -1)
		while((data = rd.read()) != -1) {
			System.out.print((char)data);
		}
		
		
		System.out.println();
		System.out.println("========== int read(byte[] buf)");
		fs = new FileInputStream("src/chap14/InputStreamEx1.java");
		// fs.available() 읽기가능 바이트 수
		byte[] buf = new byte[fs.available()];
		// 이걸로 되는가?
//		data=fs.read(buf);
//		System.out.println(new String(buf, 0, data));
		
		//data : 실제로 읽은 바이트 수
		while((data=fs.read(buf)) != -1) {
			//new String(buf, 0, data) : buf의 0번 인덱스부터 data의 길이만큼 문자열 객체로 생성
			System.out.println(new String(buf, 0, data));
			//System.out.println(new String(buf));
		}


		System.out.println();
		System.out.println("========== int read(byte[] buf,int start, int len)");
		fs = new FileInputStream("src/chap14/InputStreamEx1.java");
		while((data=fs.read(buf,0,buf.length)) != -1)
			System.out.println(new String(buf, 0, data));

			
	}
}
