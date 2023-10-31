package chap3;

/*
 * 대입연산자
 * - =
 * - +=
 * - -=
 * - *=
 * ...
 * 
 * lvalue(좌측변수) = rvalue(우측값, 변수, 수식)
 */
public class OpEx7 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		
		num += 10;
		System.out.println(num);

		num -= 10;
		System.out.println(num);

		num *= 5;
		System.out.println(num);

		num /= 10;
		System.out.println(num);

		num %= 3;
		System.out.println(num);

		num += 2 + 3;
		System.out.println(num);

		num *= 2 + 3;
		System.out.println(num);
		
		byte b = 1;
		b *= 2;
		System.out.println(b);
		
		b *= 2;
		System.out.println(b);
		
		b *= 2;
		System.out.println(b);
	}

}
