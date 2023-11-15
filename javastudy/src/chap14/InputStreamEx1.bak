package chap14;

import java.io.IOException;
import java.io.InputStream;

/*
입출력 스트림 : 데이터의 이동통로, 단방향, 버퍼를 가진다.
	입력스트림
		바이트	: 1byte 단위 읽기, 동영상, 이미지, 텍스트 등의 데이터 처리	: InputStream
				  하위클래스 : FileInputStream, ObjectInputStream ...
		문자		: 2byte 단위 읽기, 텍스트 데이터 처리.					: Reader
				  하위클래스 : FileReader, StreamReader ...
	출력스트림
		바이트	: 1byte 단위 읽기, 동영상, 이미지, 텍스트 등의 데이터 처리	: OutputStream
				  하위클래스 : FileOutputStream, PrintStream ...
		문자		: 2byte 단위 읽기, 텍스트 데이터 처리.					: Writer
				  하위클래스 : FileWriter, PrintWriter ...

InputStreamReader	: 문자형 입력스트림 <- 바이트형 입력스트림
OutputStreamWriter	: 문자형 출력스트림 <- 바이트형 출력스트림

자바에서 제공하는 표준 입출력 스트림 객체
표준입력객체 : InputStream System.in	: 키보드 입력
표준출력객체 : PrintStream System.out	: 콘솔출력
표준오류객체 : PrintStream System.err	: 콘솔에러출력
*/
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException {
		// InputStream 바이트 입력스트림 => 1바이트 기준으로 데이터 처리
		// read() : 1바이트 단위 읽기 => 한글부분이 깨짐
		InputStream in = System.in;
		int data = 0;
		while((data=in.read()) != -1)	//ctrl + z
			System.out.print((char)data);
	}
}
