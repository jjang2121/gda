package chap14;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriterEx1 {

	public static void main(String[] args) throws IOException {
		//OutputStreamWriter : 문자형출력스트림(Writer) <- 바이트형출력스트림(OutputStream)
		//PrintStream System.out
		//OutputStream > PrintStream 하위클래스 : PrintStream is a OutputStream
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		os.write('1'); os.write('2'); os.write('3');
		os.write('a'); os.write('b'); os.write('c');
		os.write('가'); os.write('나'); os.write('다');
		os.flush();
	}
}
