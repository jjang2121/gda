package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		int num; //변수 선언
		num = 100; //변수 초기화
		
		System.out.println(num);
		
		num = 200;
		System.out.println(num);
		
		int num2 = 100;
		System.out.println(num2);
		
		double d;
		d = 10.5;
		System.out.println(d);
		
		char c = 'A';
		System.out.println(c);
		
		boolean b = true;
		System.out.println(b);
		
		num = c;
		System.out.println(num);
		
		//2진 리터럴 값 저장하기
		num = 0b1011;
		System.out.println(num);
		
		//8진 리터럴 값 저장하기
		num = 011;
		System.out.println(num);
		
		//16진 리터럴 값 저장하기
		num = 0x11;
		System.out.println(num);
	}
}
