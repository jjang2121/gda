package chap12;

/*
동기화 메서드 방식 : method 제한자에 synchronized 예약어 사용

*/

class PrintThread2 extends Thread {
	Printer prt;
	char ch;
	PrintThread2(Printer prt, char ch) {
		this.prt = prt;
		this.ch = ch;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			prt.PrintChar(ch);
		}
	}

}

class Printer {
	public synchronized void PrintChar(char ch) {	// 동기화 메서드
		for(int i=0;i<80;i++) System.out.print(ch);
		System.out.println();
	}
}

public class ThreadEx6 {
	public static void main(String[] args) { // 스레드
		Printer prt = new Printer();
		PrintThread2 t1 = new PrintThread2(prt,'A');
		PrintThread2 t2 = new PrintThread2(prt,'B');
		PrintThread2 t3 = new PrintThread2(prt,'C');
		
		t1.start();t2.start();t3.start();
	}
}
