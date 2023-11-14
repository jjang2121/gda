package chap14;

import java.io.IOException;
import java.io.OutputStream;

/*
OutputStream : 바이트형 출력스트림
*/
public class OutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		os.write('1'); os.write('2'); os.write('3');
		os.write('a'); os.write('b'); os.write('c');
		os.write('가'); os.write('나'); os.write('다');	//한글깨짐
		os.flush();	// 버퍼의 내용을 목적지로 강제전송
	}
}
