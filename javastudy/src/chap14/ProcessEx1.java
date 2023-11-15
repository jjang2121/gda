package chap14;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
다른 프로세스에서 전달해준 메시지 출력하기
*/
public class ProcessEx1 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping -t 192.168.8.1");
		Reader r = new InputStreamReader(p.getInputStream(), "EUC-KR");
		int data = 0;
		while((data=r.read()) != -1)
			System.out.print((char)data);
		
		r.close();
	}
}
