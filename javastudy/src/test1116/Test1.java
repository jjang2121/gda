package test1116;
/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현한
 *   방식으로 변경하기
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {
	class DataAddThread implements Runnable {	// 내부클래스
		List<String> words = new ArrayList<>();
		String[] data = {"태연","유리","윤아","효연","수영","서현","써니"};
		int interval = 3*1000;

		@Override
		public void run() {
			while(true) {
				words.add(data[(int)(Math.random() * data.length)]);
				try {
					Thread.sleep(interval);
				}catch(InterruptedException ex) {}
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		DataAddThread dat = t1.new DataAddThread();
		Thread t = new Thread(dat);
		dat.words.add(dat.data[0]);
		t.setDaemon(true);
		t.start();
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println(dat.words);
			System.out.println("=>");
			str = scan.next();
			dat.words.remove(str);
			
			if(dat.words.size() <= 0) break;
		}
		System.out.println("프로그램 종료");
	}
}
