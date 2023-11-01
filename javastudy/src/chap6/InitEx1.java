package chap6;

/*
초기화 블럭 예제
static 초기화블럭
	기능		: 클래스 변수의 초기화
	실행시점	: 클래스정보 로드 시 한번 실행
인스턴스 초기화 블랙
	기능		: 인스턴스 변수의 초기화. 생성자와 기능이 겹침.
	실행시점	: 객체화 시 생성자 호출젖에 먼저실행.
*/


public class InitEx1 {
	static int cv;
	int iv;
	InitEx1(){
		System.out.println("5.생성자 호출됨");
	}
	//static 초기화 블럭
	static {
		cv = (int)(Math.random() * 100);
		System.out.println("1.static 초기화 블럭 실행. cv="+cv);
	}
	{
		iv = (int)(Math.random() * 100);
		System.out.println("4.static 초기화 블럭 실행. iv="+iv);
	}
	
	public static void main(String[] args) {
		System.out.println("2.main 메서드 시작");
		System.out.println("3.main 메서드에서 Init1 객체 생성 cv="+cv);
		InitEx1	init1 = new InitEx1();
		System.out.println("3.main 메서드에서 Init2 객체 생성 cv="+cv);
		InitEx1	init2 = new InitEx1();

		System.out.println(init1.iv);
		System.out.println(init2.iv);
	}
}
