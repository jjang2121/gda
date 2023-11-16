package chap12;

/*
Thread 생성
1. Thread 클래스 상속, run() 메서드 구현
	run() : Thread 기능 구현 메서드
2.
*/

class Thread1 extends Thread {
	long minPrime = 1000;
	Thread1(String name){
		super(name);	//Thread 이름 설정
	}
	Thread1(String name, long minPrime){
		super(name);
		this.minPrime = minPrime;
	}

	/*
	Runnable => 스케줄러(프로그래머가 관여 못함) => Running 상태
	*/
	@Override
	public void run() {		// Running 상태 : run() 메서드 실행상태
		for(int i=1;i<=5;i++) {
			// getName() : Thread 객체의 이름
			System.out.println(i+"="+getName());
			try {
				// sleep(1000);	//1초대기
				sleep(minPrime);
			}catch(InterruptedException ex) {}
		}
	}
	
}

public class ThreadEx1 {
	public static void main(String[] args) throws InterruptedException {
		/*
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First");
		Thread1 t2 = new Thread1("Second");
		t1.start(); t2.start();
		System.out.println("main 스레드 종료");
		*/
		
		System.out.println("main 스레드1 시작");
		Thread1 t3 = new Thread1("First1", 1000);	//New 상태
		Thread1 t4 = new Thread1("Second1", 1000);	//New 상태
		t3.start(); t4.start();						//Runable 상태. 실행가능 상태
		/*
		start() 메서드
			: New상태의 스레드를 Runnable 상태로 변경
			 1. 스택을 병렬화
			 2. 병렬화된 스택영역에 run()메서드 호출
		*/
		// t3.wait(1000L); t4.wait(1000L);
		System.out.println("main 스레드1 종료");		//main 메서드 종료
		
	}
}
