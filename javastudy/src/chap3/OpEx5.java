package chap3;

/*
 * 이항연산자
 * - 비트연산자
 * -- & (AND)
 * -- | (OR)
 * -- ~ (NOT)
 * -- ^ (XOR)
 */
public class OpEx5 {

	public static void main(String[] args) {
		System.out.println(6 & 3);
		System.out.println(6 | 3);
		System.out.println(6 ^ 3);
		/*
		 * 6: 00000110
		 * 3: 00000011
		 * ---------------
		 * &: 00000010 (2)
		 * |: 00000111 (7)
		 * ^: 00000101 (5)
		 */
		System.out.println(~10);
		/*
		 * 10: 00001010
		 *  ~: 11110101
		 *  
		 *  음수는 2의 보수로 표현한다. 2의 보수는 1의 보수 + 1
		 *  맨 왼쪽 비트 한 개가 부호비트이다.
		 */

	}

}
