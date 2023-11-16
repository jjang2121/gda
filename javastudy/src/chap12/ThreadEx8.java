package chap12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
타자연습 프로그램 구현
*/



public class ThreadEx8 {
	List<String> words = new ArrayList<>();
	String[] data = {"태연","유리","윤아","효연","수영","서현","써니"};
	int interval = 3*1000;
	
	class DataAddThread extends Thread {	// 내부클래스
		@Override
		public void run() {
			while(true) {
				words.add(data[(int)(Math.random() * data.length)]);
				try {
					sleep(interval);
				}catch(InterruptedException ex) {}
			}
		}
	}
	
	// 화면에서 문자열을 입력받아 words 리스트에서요소 제거 기능
	public static void main(String[] args) {
		ThreadEx8 c = new ThreadEx8();
		Scanner scan = new Scanner(System.in);
		c.words.add(c.data[0]);
		DataAddThread t1 = c.new DataAddThread();	// 데이터 추가 기능
		t1.setDaemon(true);							// 데몬 스레드
		t1.start();
		while(true) {
			System.out.println(c.words);
			System.out.println(">>");
			String in = scan.next().trim();
			c.words.remove(in); // words 데이터에서 입력받은 문자열을 제거
			if(c.words.size() == 0) break;	//words 데이터가 없어진 경우 반복 종료
		}
		System.out.println("타자연습 종료");
	}
}
