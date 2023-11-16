package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 영어 타자 연습 프로그램 구현
 * 
 * 3초에 한번씩 List에 소문자 3~4자의 임의의 영어단어 추가하기.
 * 화면에 추가된이름을 출력하기.
 * 단어를 입력받아서 입력받은 단어를 리스트에서 제거.
 * List 의 모든 데이터 삭제되면 프로그램 종료
 * 
 [결과]
[abcdef]
>>abcdef
[cncm]
>>cncm
[rfaa]
>>rfaa
 */

class DataAddThread1 extends Thread {
	List<String> words = new ArrayList<>();
	int interval = 3*1000;	// 3초
	@Override
	public void run() {
		while(true) {
			String setStr = "";	// 입력문자열 변수
			int rndNo = (int)(Math.random()*2)+3;	//3~4자리
			for(int i=0;i<rndNo;i++) {	// 3~4자리 문자열 조합
				int num = (int)(Math.random()*26)+97;	//a~z까지 조합
				setStr += (char)num;
			}
			words.add(setStr);	// 조합 문자열 저장
			try {
				sleep(interval);
			}catch(InterruptedException ex) {}
		}
	}
}

public class Test2 {
	public static void main(String[] args) {
		DataAddThread1 dat1 = new DataAddThread1();
		dat1.setDaemon(true);	// 메인 종료 시 DaemonThread 종료
		dat1.start();
		dat1.words.add("abcd");
		
		Scanner scan = new Scanner(System.in);
		String inputStr = "";
		
		while(true) {
			System.out.println(dat1.words);
			System.out.println("=>");
			inputStr = scan.next();
			dat1.words.remove(inputStr);
			
			if(dat1.words.size() <= 0)	break;
		}
		System.out.println("프로그램 종료");
	}
}