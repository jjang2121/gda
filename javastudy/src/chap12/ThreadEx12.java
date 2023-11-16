package chap12;

/*
wait(), notify(), notifyAll() 메서드
1. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 호출 가능
2. Object 클래스의 멤버메서드 => 모든 객체에서 호출이 가능함.
3. wait()	: 실행중인 스레드를 대기상태로 변환, lock 해제.
   notify()	: wait() 스레드 한개를 Runnable 상태로 변경, 개발자 선택 불가
   notifyAll()	: Wait() 스레드 모두를 Runnable 상태로 변경

*/

class FastFood implements Runnable {
	protected int cnt = 0;
	@Override
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*3000));
		}catch(InterruptedException ex) {}

		synchronized(this){
			while(true) {
				if(cnt <= 0) {
					if(Thread.currentThread().getName().equals("요리사")) {
						notifyAll();	// wait 상태인 스레드 전부를 Runnable 상태로
					}else {
						try {
							wait();	// 대기상태, lock 해제
						}catch(InterruptedException ex) {}
					}
				}else {
					if(Thread.currentThread().getName().equals("판매자")) {
						notifyAll();	// wait 상태인 스레드 전부를 Runnable 상태로
					}else {
						try {
							wait();	// 대기상태, lock 해제
						}catch(InterruptedException ex) {}
					}
				}
				procProductSelling();
			}
		}
			
	}

	protected void procProductSelling() {
		if(cnt <= 0) {
			if(Thread.currentThread().getName().equals("요리사")) {
				cnt++;
				System.out.println(Thread.currentThread().getName() + "생산, 잔여수 : "+cnt);
			}else {
				System.out.println("판매자 대기");
			}
		}else {
			if(Thread.currentThread().getName().equals("판매자")) {
				cnt--;
				System.out.println(Thread.currentThread().getName() + "판매, 잔여수 : "+cnt);
			}else {
				System.out.println("요리사 대기");
			}

		}
	}
	
}


public class ThreadEx12 {
	public static void main(String[] args) throws InterruptedException {
		FastFood fd = new FastFood();
		Thread product = new Thread(fd, "요리사");
		Thread seller = new Thread(fd, "판매자");
		product.start(); seller.start();
	}
}
