package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현하는
 *    방식으로 변경하기 
 */
class DataAddRunnable implements Runnable {
	String[] data;
	List<String> words;
	int interval;
	DataAddRunnable(String[] data, List<String> words, int interval) {
		this.data = data;
		this.words = words;
		this.interval = interval;
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {}
			words.add(data[(int) (Math.random() * data.length)]);
		}			
	}
}
 public class Test1_B {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = {"태연","유리","윤아","효연","수영","서현","써니"};
		int interval = 3 * 1000; // 3초
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		Thread t1 = new Thread(new DataAddRunnable(data,words,interval));
		t1.setDaemon(true);
		t1.start();
		while (true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);
			if (words.size() == 0)
				break;
		}
		System.out.println("프로그램 종료");
	}
}
