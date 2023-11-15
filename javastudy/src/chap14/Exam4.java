package chap14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
화면에서 파일명을 입력받아 출력을 시작할 라인번호와 출력 라인수를 입력받기
파일에서 시작라인부터 출력 라인수까지만 화면 출력
Scanner 사용 불가
[결과]
파일명을 입력하세요.
src/chap14/InputStreamEx1.java
시작라인
1
라인수
3
*/
public class Exam4 {
	public static void main(String[] args) throws IOException {
		String fileUrl = "src/chap14/", fname = "";
		int startNum = 0, len = 0;
		System.out.println("파일명을 입력하세요.");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		fname = fileUrl + stdin.readLine();	// 화면에서 한줄입력, String으로 입력

		BufferedReader fbr;
		try {
			fbr = new BufferedReader(new FileReader(fname));
		}catch(FileNotFoundException ex) {
			System.out.println("파일이 없습니다.");
			return;
		}
		
		// 시작라인
		System.out.println("시작라인을 입력하세요.");
		try {
			startNum = Integer.parseInt(stdin.readLine());	// 정수형으로 변경
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return;
		}
		// 라인수
		System.out.println("라인수를 입력하세요.");
		try {
			len = Integer.parseInt(stdin.readLine());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			return;
		}
		
		String data = null;
		int line = 0;	//화면에 표시할 라인. 파일의 라인수
		int cnt = 0;	// 현재 시점에 출력한 라인갯수
		while((data=fbr.readLine()) != null) {
			++line;
			if(line < startNum) continue;	// 라인번호 될때까지 계속 읽기
			if(cnt >= len) break;			// len까지 출력한 경우 출력안함.
			++cnt;							// 출력한 라인의 갯수 증가
			System.out.println(line +":"+ data);
		}
		
		fbr.close();
		stdin.close();
		
	}
}
