package chap7;

/*
제어자(제한자) : 접근제어자, 그 외 제어자
접근제어자 : private < (default) < protected < public
그외제어자 : abstract, static, final
접근제어자 와 그 외 제어자 같이 사용 가능
*/


class Modifier {
	private		int v1 = 100;	// Modifier class 내에서만 접근 허용
				int v2 = 200;	// default 제어자, chap7 패키지 내에서만 접근 가능
	protected	int v3 = 300;
	public		int v4 = 400;

	public void method() {
		System.out.println(this.getClass().getName()+"의 메소드");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}
	
public class ModifierEx1 {
	
	public static void main(String[] args) {
		Modifier m = new Modifier();
		m.method();
		// System.out.println(m.v1); private 접근제어로 인한 오류발생!
		System.out.println(m.v2);
		System.out.println(m.v3);
		System.out.println(m.v4);
		// m.v1 = 1;
		m.v2 = 2;
		m.v3 = 3;
		m.v4 = 4;
		System.out.println(m.v2);
		System.out.println(m.v3);
		System.out.println(m.v4);
	}

}
