package chap12;

/*
Thread 주요 메소드
1. start()	: 스레드의 시작. 병렬화, run() 메서드 호출.
			  New => Runnable(싱행가능) 상태 변경
2. run()	: 스레드 실행하는 메서드. 오버라이딩 해야함.
3. join()	: 스레드 종료시까지 대기
4. sleep(ms): 릴리초 동안 대기
5. setDaemon(boolean) : true인 경우 데몬 스레드로 설정됨, New 상태에서 설정해야함.
6. interrupt() : InterruptedException 예외 발생. 대기중 스레드에 예외 발생
7. setPriority(int)	: 우선순위 설정(1~10)
					  기본값:5, 최대값10(높음), 최소값:1(낮음)
					  우선순위가 높은 경우 스케줄러의 선택을 높은 확률로 가능하도록 설정
8. yield()	: Running 상태의 스레드를 Runnable 상태로 변경
9. stop()	: 스레드 강제 종료. 사용하지 않는것이 권고사항

동기화 : synchronized 예약어 사용
	동기화 블럭		: lock 설정. lock은 공유객체여야 함.
	동기화 메서드	: 공유객체의 메서드
*/
class InterruptThread extends Thread {
	@Override
	public void run() {
		System.out.println("자고 있어요. 깨우지 마세요.");
		try {
			sleep(10000000);
		}catch(InterruptedException ex) {
			System.out.println("누가 깨웠나요?");
			ex.printStackTrace();
		}
	}
}

public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);	//2초대기
		t1.interrupt();		// t1 스레드의 InterruptedException 발생
	}
}
