package chap2;

// 큰 자료형 + 작은 자료형 => 큰 자료형 : 다른 자료형 사이의 연산 결과
public class VarEx5 {

	public static void main(String[] args) {
		int i1 = 100;
		int i2 = 200;
		int i3 = i1 + i2;
		float f1 = 10.0f;
		float f2 = i3 + f1;
		double d1 = f1 + 10.5;
		
		System.out.println("i3=" + i3);
		System.out.println("f2=" + f2);
		System.out.println("d1=" + d1);

		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1 + b2; // int형보다 작은 자료형 간의 연산 결과는 최소 int형이다
		// short b3 = b1 + b2 // int <= byte + byte, int <= byte + short, ...
		// int b3 = b1 + b2;
		short b3 = (short) (b1 + b2);
		
		char c1 = 'a';
		int c2 = c1 + 1;
	}

}
