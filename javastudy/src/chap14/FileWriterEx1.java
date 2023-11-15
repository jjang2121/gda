package chap14;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter 예제 : 텍스트형 데이터를 파일에 저장하기

주요메서드
void write(int data) : 2byte 출력.
void write(char[] buf) : buf의 내용을 출력.
void write(char[] buf, int start, int end) : buf의 start 인덱스부터 len길이만큼 내용을 출력.
void write(String str) : str 내용을 출력
*/
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용 저장하기");
		FileWriter fw = new FileWriter("src/chap14/out2.txt", true);
		fw.write('1'); fw.write('2'); fw.write('3');
		fw.write('a'); fw.write('b'); fw.write('c');
		fw.write('가'); fw.write('나'); fw.write('다');
		// getBytes() : 문자열 내용을 byte[] 배열로 변경
		char[] buf = "\nFileWriter 예제입니다.\n".toCharArray();
		fw.write(buf);
		fw.write(buf, 5, 6);
		fw.write("\nFileWriter 예제입니다. String 자료형을 출력할 수 있습니다.\n\n");
		fw.flush();
	}
}
