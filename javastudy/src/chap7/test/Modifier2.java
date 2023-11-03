package chap7.test;

public class Modifier2 {
	private		int v1 = 10;	// Modifier class 내에서만 접근 허용
				int v2 = 20;	// default 제어자, chap7 패키지 내에서만 접근 가능
	protected	int v3 = 30;
	public		int v4 = 40;

	public void method() {
		System.out.println("chap7.test.Modifier2의 메소드");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}


