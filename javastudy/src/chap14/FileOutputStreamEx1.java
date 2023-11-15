package chap14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream 예제 : 파일에 데이터를 저장

주요메서드
void write(int data) : 1byte 출력
void write(byte[] buf) : buf의 내용을 출력
void write(byte[] buf, int start, int end) : buf의 내용 start 인덱스부터 len길이만큼 출력

FileOutputStream : 파일에 내용을 쓸 수 있는 스트림
	out.txt : 파일이름의 파일이 없는 경우 자동 생성. 사용자가 파일 생성 권한을 가지고 있는 경우
			  권한이 없는 경우 FileNotFoundException 예외 발생함
	new FileOutputStream("out.txt") 		: out.txt 파일에 데이터를 쓸 준비완료.
									  		  기존 내용은 사라짐.
	new FileOutputStream("out.txt", true)	: out.txt 파일에 데이터를 쓸 준비완료.
											  기존의 내용에 새로운 내용이 추가됨.
*/
public class FileOutputStreamEx1 {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("out.txt 파일에 내용 저장하기");
			// FileNotFoundException 예외처리 필수(윈도우 O/S 외 파일 생성 권한문제로 필요)
			FileOutputStream fos = new FileOutputStream("src/chap14/out.txt", true);
			fos.write('\n');
			fos.write('1'); fos.write('2'); fos.write('3');
			fos.write('a'); fos.write('b'); fos.write('c');
			fos.write('가'); fos.write('나'); fos.write('다');
			// getBytes() : 문자열 내용을 byte[] 배열로 변경
			byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
			fos.write(buf);
			fos.write(buf, 5, 6);
			fos.flush();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
