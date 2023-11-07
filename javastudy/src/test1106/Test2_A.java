package test1106;
/*
 구동 클래스를 실행 했을 때 다음의 결과가 나오도록 
 RemoteControl 인터페이스 완성하기
 
 [결과]
TV를 켭니다.
Tv의 볼륨을 10으로 설정합니다.
TV를 끕니다.
무음 처리합니다.
Audio를 켭니다.
Audio의 볼륨을 20으로 설정합니다.
Audio를 끕니다.
무음을 해제합니다.
건전지를 교환합니다.
 */

interface RemoteControl {
	//추상메서드 : 구현클래스에서 반드시 오버라이딩 필요
	void turnOn();
	void turnOff();
	void setVolume(int volumn);
	//default 메서드 : 인스턴스메서드
	default void setMute(boolean b) {
		if(b)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음을 해제합니다.");
	}
	//static 메서드 : 클래스 메서드.  인터페이스명.메서드명 호출
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
public class Test2_A {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); //TV를 켭니다.      => 추상메서드
		rc.setVolume(10); //Tv의 볼륨을 10으로 설정합니다. => 추상메서드
		rc.turnOff(); //TV를 끕니다.     => 추상메서드
		rc.setMute(true); //무음 처리합니다. => default 메서드
		rc = new Audio();
		rc.turnOn(); //Audio를 켭니다.
		rc.setVolume(20); //Audio의 볼륨을 20으로 설정합니다.
		rc.turnOff(); //Audio를 끕니다.
		rc.setMute(false); //무음을 해제합니다.
		RemoteControl.changeBattery(); //건전지를 교환합니다. => static 메서드
	}
}