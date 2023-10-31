package chap3;

/**
 * 이상연산자: 산술연산자
 * - +, -, *, /, %
 */
public class OpEx3 {

	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.printf("%d+%d=%d\n",x,y,(x+y));
		System.out.printf("%d-%d=%d\n",x,y,(x-y));
		System.out.printf("%d*%d=%d\n",x,y,(x*y));
		System.out.printf("%d/%d=%d\n",x,y,(x/y));
		System.out.printf("%d%%%d=%d\n",x,y,(x%y));
		
		System.out.println(10/8);
		System.out.println(-10/8);
		System.out.println(10/-8);
		System.out.println(-10/-8);
		
		// 나머지의 부호는 피제수의 부호를 따라간다
		System.out.println(10%8);
		System.out.println(-10%8);
		System.out.println(10%-8);
		System.out.println(-10%-8);

	}

}
