package chap12;

/*
동기화 예제 : 동기화 블럭

*/

class PrintThread1 extends Thread {
	char ch;
	static Object lock = new Object();	// 공유객체
	// static String lock = new String();	// 공유객체
	// static int lock = 10;	// 기본자료형은 lock객체로 사용불가.
	// static Integer lock = 10;
	PrintThread1(char ch) {
		this.ch = ch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized(lock){	// lock을 가진 스레드만 동기화 블럭 실행함.
				for (int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
			} // synchronized 끝, lock 해제
		}
	}

}

public class ThreadEx5 {
	public static void main(String[] args) { // 스레드
		PrintThread1 t1 = new PrintThread1('A');
		PrintThread1 t2 = new PrintThread1('B');
		PrintThread1 t3 = new PrintThread1('C');
		
		t1.start();t2.start();t3.start();
	}
}
