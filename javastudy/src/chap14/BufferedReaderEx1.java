package chap14;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
BufferedReader 보조스트림
	1. 새로운 기능 추가됨 : readLine() 메소드 추가.
	2. 객체 생성 시 다른 스트림을 매개변수로 받는다.

new BufferedReader(Reader)
*/
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요.(종료 : ctrl+z)");
		FileWriter fw = new FileWriter("src/chap14/bufferd.txt");
		String data = null;
		while((data = br.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
		br.close();
	}
}
