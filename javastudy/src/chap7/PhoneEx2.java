package chap7;

/*
자손클래스에서 객체 생성 시 부모클래스의 객체 생성을 먼저함.
	=>	자손클래스의 생성자에서 부모 클래스의 생성자를 호출해야 함.
		-	이때 부모클래스의 생성자 중 매개변수가 없는 생성자가 없다면
			super(부모클래스의 매개변수에 맞는 값)을 넣어서 따로 호출해야 한다.
		-	부모클래스의 생성자 중 매개변수가 없는 생성자가 존재하면 super()는 생략가능
			컴파일 단계에서 구현됨.
		
*/

//class Phone == class Phone extends Object
class Phone2 {
	boolean power;
	int number;
	
	Phone2() {}
	Phone2(int number) {
		//super();	//생략됨.
		System.out.println("부모클래스의 생성자");
		this.number = number;
	}
	
	void power() {
		power = !power;
	}

	void send() {
		if (power)
			System.out.println("전화걸기");
	}

	void receive() {
		if (power)
			System.out.println("전화받기");
	}
}

//SmartPhone 클래스는 Phone 클래스의 하위(자손,자식,child,sub) 클래스임.
//Phone 클래스는 SmartPhone 클래스의 상위(부모,super,parent,base) 클래스임.
class SmartPhone2 extends Phone2 {
	SmartPhone2(){	//자손클래스의 생성자
		//부모클래스의 생성자를 호출해야함.
		//super(1324);
		//super();	// 기본생성자는 생략가능
		System.out.println("자손클래스의 생성자");
	}
	public void setApp(String name) {
		System.out.println(name + "앱을 설치함");
	}

	public void setPower(boolean power) {
		super.power = power;
	}

	public boolean getPower() {
		return super.power;
	}
}

public class PhoneEx2 {

	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2();
		
		/*
		SmartPhone sp = new SmartPhone();
		sp.setApp("게임");
		System.out.println("전원 Off");
		// sp.power = false;
		sp.setPower(false);
		sp.number = 1;
		sp.send();
		sp.receive();
		System.out.println("번호 : " + sp.number);
		System.out.println("================");
		System.out.println("전원 On");
		// sp.power = true;
		sp.setPower(true);
		sp.send();
		sp.receive();
		System.out.println("번호 : " + sp.number);
		*/
	}

}
